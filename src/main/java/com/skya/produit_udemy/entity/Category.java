package com.skya.produit_udemy.entity;

import jakarta.persistence.*;

import java.util.List;

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
        super();
    }

    public Category(String nomCategory, String descriptionCategory) {
        super();
        this.nomCategory = nomCategory;
        this.descriptionCategory = descriptionCategory;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getNomCategory() {
        return nomCategory;
    }

    public void setNomCategory(String nomCategory) {
        this.nomCategory = nomCategory;
    }

    public String getDescriptionCategory() {
        return descriptionCategory;
    }

    public void setDescriptionCategory(String descriptionCategory) {
        this.descriptionCategory = descriptionCategory;
    }


}
