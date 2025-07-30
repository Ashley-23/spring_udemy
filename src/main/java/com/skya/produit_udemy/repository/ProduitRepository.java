package com.skya.produit_udemy.repository;

import com.skya.produit_udemy.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long>  {

}
