package br.com.thecodes.demo.produtosbeleza.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thecodes.demo.produtosbeleza.entity.Product;
import br.com.thecodes.demo.produtosbeleza.repository.ProductRpository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
	private final ProductRpository productRpository;

	@GetMapping
	public List<Product> findAll() {
		return productRpository.findAll();

	}

}
