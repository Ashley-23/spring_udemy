package com.skya.produit_udemy;

import com.skya.produit_udemy.entity.Produit;
import com.skya.produit_udemy.repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ProduitUdemyApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	private ProduitRepository produitRepository;


	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PC Dell",2200.500,new Date());
		produitRepository.save(prod);
	}

}
