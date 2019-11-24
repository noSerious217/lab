package com.lab.entity;

import javax.persistence.*;

@Entity
@Table(name = "couriers")
public class Courier {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "courierSeq",allocationSize = 1,initialValue = 1,sequenceName = "courier_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "courierSeq")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Override
    public String toString() {
        return "Courier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Courier() {
    }

    public Courier(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
