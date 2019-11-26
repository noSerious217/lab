package com.lab.entity;

import javax.persistence.*;

@Entity
@Table(name = "dishes")
public class Dish {
    @Id
    @Column(name = "dish_id")
    @SequenceGenerator(name = "dishSeq", sequenceName = "dish_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dishSeq")
    private Long id;

    @Column(name = "dish_ingredients")
    private String ingredients;

    public Dish(String ingredients) {
        this.ingredients = ingredients;
    }

    public Dish() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
