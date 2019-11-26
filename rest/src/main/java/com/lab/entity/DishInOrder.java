package com.lab.entity;

import com.lab.util.DishInOrderId;

import javax.persistence.*;

@Entity
@Table(name = "dishes_in_order")
@IdClass(DishInOrderId.class)
public class DishInOrder {

    @Id
    @Column(name = "order_id")
    private Long orderid;

    @Id
    @Column(name="dish_id")
    private Long dishid;

    @Column(name = "count")
    private Long count;

    public DishInOrder(Long orderid, Long dishid, Long count) {
        this.orderid = orderid;
        this.dishid = dishid;
        this.count = count;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Long getDishid() {
        return dishid;
    }

    public void setDishid(Long dishid) {
        this.dishid = dishid;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DishInOrder{" +
                "order_id=" + orderid +
                ", dish_id=" + dishid +
                ", count=" + count +
                '}';
    }
}
