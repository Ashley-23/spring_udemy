package com.skya.produit_udemy.service;

import com.skya.produit_udemy.entity.Produit;

import java.util.List;

public interface ProduitService {


    Produit saveProduit(Produit produit);
    Produit updateProduit(Produit produit);

    void deleteProduitById(Long id);
    void deleteProduit(Produit produit);

    Produit findProduit(Long id);
    List<Produit> findAllProduit();
}
