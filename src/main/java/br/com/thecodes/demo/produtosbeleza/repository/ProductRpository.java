package br.com.thecodes.demo.produtosbeleza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thecodes.demo.produtosbeleza.entity.Product;

public interface ProductRpository extends JpaRepository<Product, Long>{
	

}
