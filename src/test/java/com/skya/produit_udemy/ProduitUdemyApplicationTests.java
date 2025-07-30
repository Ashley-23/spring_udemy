package com.skya.produit_udemy;

import com.skya.produit_udemy.entity.Produit;
import com.skya.produit_udemy.repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitUdemyApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	private ProduitRepository produitRepository;


	@Test
	public void testCreateProduit() {
		Produit prod_create = new Produit("PC Dell",2200.500,new Date());
		produitRepository.save(prod_create);
	}

	@Test
	public void testFindProduit() {
		Produit prod_find = produitRepository.findById(1L).get();
		System.out.println(prod_find);
	}

	@Test
	public void testUpdateProduit() {
		Produit prod_update = produitRepository.findById(2L).get();
		prod_update.setPrixProduit(20000.00);
		produitRepository.save(prod_update);

		System.out.println(prod_update);
	}


	@Test
	public void testDeleteProduit() {
		produitRepository.deleteById(2L);
	}

	@Test
	public void testFindAllProduit() {
		List<Produit> prod_all = produitRepository.findAll();

		for (Produit produit : prod_all) {
			System.out.println(produit);
		}
	}

}
