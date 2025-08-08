package com.educandoWeb.CursoSpringBoot.entities;

import com.educandoWeb.CursoSpringBoot.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.Mapping;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="tb_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone="GMT")
    //instant seja mostrado no json no formato de String do ISO 8601
    private Instant moment;

    //fazendo o relacionamento de muitos para um, no caso mts pedidos para 1 usuário

    @ManyToOne//para identificar como chave estrangeira
    @JoinColumn(name = "client_id")//nome da chave estrangeira
    private User client;//nome da variável q esta deste lado da aplicação, ta sendo buscado no User.java

    private Integer status;

    @OneToMany(mappedBy = "id.order")//um para mts
    private Set<OrderItem> items = new HashSet<>();

    //associação de 1 pra 1, e a entidade do outro lado(classe payment, tem o nome order
    //e o cascade = CascadeType.ALL é obrigatorio colocar para terem o msm id
    @OneToOne(mappedBy = "order",cascade = CascadeType.ALL)
    private Payment payment;

    public Order() {}

    public Order(Long id, Instant moment, OrderStatus status,User client) {
        this.id = id;
        this.moment = moment;
        setStatus(status);
        this.client = client;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public OrderStatus getStatus() {
        return OrderStatus.valueOf(status);
    }

    public Set<OrderItem> getItems() {
        return items;
    }

    public void setStatus(OrderStatus status) {
        if(status != null){
            this.status = status.getCode();
        }
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
