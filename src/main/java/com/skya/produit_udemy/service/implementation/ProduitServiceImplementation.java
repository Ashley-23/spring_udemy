package com.skya.produit_udemy.service.implementation;

import com.skya.produit_udemy.entity.Produit;
import com.skya.produit_udemy.repository.ProduitRepository;
import com.skya.produit_udemy.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImplementation implements ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public void deleteProduit(Produit produit) {
        produitRepository.delete(produit);
    }

    @Override
    public Produit findProduit(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public List<Produit> findAllProduit() {
        return produitRepository.findAll();
    }
}
