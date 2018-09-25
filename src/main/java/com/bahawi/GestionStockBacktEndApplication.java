package com.bahawi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bahawi.entities.Produit;
import com.bahawi.repositories.ProduitRepository;

@SpringBootApplication
public class GestionStockBacktEndApplication implements CommandLineRunner {
	
	@Autowired
	private ProduitRepository produitrepo;
	public static void main(String[] args) {
		SpringApplication.run(GestionStockBacktEndApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		produitrepo.save(new Produit("Livre",50,20));
		produitrepo.save(new Produit("Cahier",70,120.5f));
		produitrepo.save(new Produit("Stylo",54,30.76f));
		

		
		
	}
}
