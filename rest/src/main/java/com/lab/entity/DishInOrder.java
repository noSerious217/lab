package com.lab.entity;

import javax.persistence.*;

@Entity
@Table(name = "dishes_in_order")
public class DishInOrder {
    @Column(name = "dish_id")
    private Long dishId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "count")
    private Long count;

    @ManyToOne
    @JoinColumn(name = "dishid")
    private Dish dish;

    @ManyToOne
    @JoinColumn(name="orderid")
    private Order order;

    public DishInOrder(Long dishId, Long orderId, Long count) {
        this.dishId = dishId;
        this.orderId = orderId;
        this.count = count;
    }

    public Long getDishId() {
        return dishId;
    }

    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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
                "dishId=" + dishId +
                ", orderId=" + orderId +
                ", count=" + count +
                ", dish=" + dish +
                ", order=" + order +
                '}';
    }
}
