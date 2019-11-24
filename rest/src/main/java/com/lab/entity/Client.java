package com.lab.entity;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    public Client(String email, Double discount, String password) {
        this.email = email;
        this.discount = discount;
        this.password = password;
    }

    @Id
    @Column(name = "Id", nullable = false)
    @SequenceGenerator(name = "clientSeq", sequenceName = "client_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientSeq")
    private Long id;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Discount")
    private Double discount;

    @Column(name = "Password")
    private String password;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", discount=" + discount +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Client() {
    }

    public Client(String email, String password) {
        this.email = email;
        discount = 0.0;
        this.password = password;
    }
}
