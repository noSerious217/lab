package com.lab.entity;

import com.lab.util.DishInOrderId;

import javax.persistence.*;

@Entity
@Table(name = "dishes_in_order")
@IdClass(DishInOrderId.class)
public class DishInOrder {

    @Id
    @Column(name = "order_id")
    private Long order_id;

    @Id
    @Column(name="dish_id")
    private Long dish_id;

    @Column(name = "count")
    private Long count;

    @ManyToOne
    @JoinColumn(name = "dishid")
    private Dish dish;

    @ManyToOne
    @JoinColumn(name = "orderid")
    private Order order;

    public DishInOrder(Long order_id, Long dish_id, Long count) {
        this.order_id = order_id;
        this.dish_id = dish_id;
        this.count = count;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getDish_id() {
        return dish_id;
    }

    public void setDish_id(Long dish_id) {
        this.dish_id = dish_id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Dish getDish() {
        return dish;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "DishInOrder{" +
                "order_id=" + order_id +
                ", dish_id=" + dish_id +
                ", count=" + count +
                '}';
    }
}
