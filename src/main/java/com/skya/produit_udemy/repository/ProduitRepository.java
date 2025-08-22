package com.skya.produit_udemy.repository;

import com.skya.produit_udemy.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long>  {

    // Pour rechercher un produit par son nom
    List<Produit> findByNomProduit(String nom);

    // Pour rechercher les produits qui contiennent un mot spécifique
    List<Produit> findByNomProduitContains(String nom);
}
