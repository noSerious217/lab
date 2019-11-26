package com.lab.util;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DishInOrderId implements Serializable {
    public DishInOrderId() {
    }

    public DishInOrderId(Long dishid, Long orderid) {
        this.dishid = dishid;
        this.orderid = orderid;
    }

    public Long getDishid() {
        return dishid;
    }

    public void setDishid(Long dish_id) {
        this.dishid = dish_id;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long order_id) {
        this.orderid = order_id;
    }

    private Long dishid;
    private Long orderid;

    @Override
    public String toString() {
        return "DishInOrderId{" +
                "dish_id=" + dishid +
                ", order_id=" + orderid +
                '}';
    }
}
