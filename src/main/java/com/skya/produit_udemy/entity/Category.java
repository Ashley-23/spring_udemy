package com.skya.produit_udemy.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory;
    private String nomCategory;
    private String descriptionCategory;

    @OneToMany (mappedBy = "category")
    private List <Produit> produits;

    public Category() {
    }
}
