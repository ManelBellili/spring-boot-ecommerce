package com.luv2code.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luv2code.entities.Product;

@RepositoryRestResource(collectionResourceRel = "product",path="products")

public interface ProductRepository extends JpaRepository<Product, Long> {

}
