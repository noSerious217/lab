package com.lab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "orderSeq",allocationSize = 1,initialValue = 1,sequenceName = "order_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_sequence")
    private Long id;

    @Column(name = "userid")
    private Long userid;

    @Column(name = "timeorder")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeorder;

    @Column(name = "timedelivery")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date timedelivery;

    @Column(name = "address")
    private String address;

    @Column(name = "payment")
    private double payment;

    @Column(name = "discount")
    private double discount;

    public Order() {
    }

    public Order(Long userid, Date timeorder, Date timedelivery, String address, double payment, double discount) {
        this.userid = userid;
        this.timeorder = timeorder;
        this.timedelivery = timedelivery;
        this.address = address;
        this.payment = payment;
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getTimeorder() {
        return timeorder;
    }

    public void setTimeorder(Date timeorder) {
        this.timeorder = timeorder;
    }

    public Date getTimedelivery() {
        return timedelivery;
    }

    public void setTimedelivery(Date timedelivery) {
        this.timedelivery = timedelivery;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userid=" + userid +
                ", timeorder=" + timeorder +
                ", timedelivery=" + timedelivery +
                ", address='" + address + '\'' +
                ", payment=" + payment +
                ", discount=" + discount +
                '}';
    }
}
