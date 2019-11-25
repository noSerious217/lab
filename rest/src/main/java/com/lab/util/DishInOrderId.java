package com.lab.util;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DishInOrderId implements Serializable {
    public DishInOrderId(Long dish_id, Long order_id) {
        this.dish_id = dish_id;
        this.order_id = order_id;
    }

    public Long getDish_id() {
        return dish_id;
    }

    public void setDish_id(Long dish_id) {
        this.dish_id = dish_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    private Long dish_id;
    private Long order_id;

    @Override
    public String toString() {
        return "DishInOrderId{" +
                "dish_id=" + dish_id +
                ", order_id=" + order_id +
                '}';
    }
}
