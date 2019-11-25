package com.lab.entity;

import com.lab.util.DishInOrderId;

import javax.persistence.*;

@Entity
@Table(name = "dishes_in_order")
public class DishInOrder {
    @Id
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "dish_id", column = @Column(name = "dish_id")),
            @AttributeOverride(name = "order_id", column = @Column(name = "order_id"))
    })
    private DishInOrderId dishInOrderId;

    @Column(name = "count")
    private Long count;

    @ManyToOne
    @JoinColumn(name = "dishid")
    private Dish dish;

    @ManyToOne
    @JoinColumn(name = "orderid")
    private Order order;

    public DishInOrder(Long dishId, Long orderId, Long count) {
        this.dishInOrderId.setDish_id(dishId);
        this.dishInOrderId.setOrder_id(orderId);
        this.count = count;
    }

    public Long getDishId() {
        return dishInOrderId.getDish_id();
    }

    public void setDishId(Long dishId) {
        dishInOrderId.setDish_id(dishId);
    }

    public Long getOrderId() {
        return dishInOrderId.getOrder_id();
    }

    public void setOrderId(Long orderId) {
        dishInOrderId.setOrder_id(orderId);
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
                "dishInOrderId=" + dishInOrderId +
                ", count=" + count +
                ", dish=" + dish +
                ", order=" + order +
                '}';
    }
}
