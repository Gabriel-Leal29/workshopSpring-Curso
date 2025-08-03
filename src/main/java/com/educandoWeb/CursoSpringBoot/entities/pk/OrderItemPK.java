package com.educandoWeb.CursoSpringBoot.entities.pk;

import com.educandoWeb.CursoSpringBoot.entities.Product;
import com.educandoWeb.CursoSpringBoot.entities.Order;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable//por ser uma classe auxiliar de chave primaria composta
public class OrderItemPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne//mts pra 1
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne//mts pra 1
    @JoinColumn(name="product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPK that = (OrderItemPK) o;
        return Objects.equals(order, that.order) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }
}
