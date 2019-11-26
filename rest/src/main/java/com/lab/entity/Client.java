package com.lab.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @Column(name = "client_id", nullable = false)
    @SequenceGenerator(name = "clientSeq", sequenceName = "client_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientSeq")
    private Long id;

    @Column(name = "client_email", nullable = false)
    private String email;

    @Column(name = "client_discount")
    private Double discount;

    @Column(name = "client_password")
    private String password;

    @Column(name = "client_role")
    private String role;

    public Client(String email, Double discount, String password) {
        this.email = email;
        this.discount = discount;
        this.password = password;
        role = "USER";
    }

    public Client(String email, Double discount, String password, String role) {
        this.email = email;
        this.discount = discount;
        this.password = password;
        this.role = role;
    }

    public Client() {
    }

    public Client(String email, String password) {
        this.email = email;
        discount = 0.0;
        this.password = password;
        role = "USER";
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", discount=" + discount +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
