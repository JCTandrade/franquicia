package com.franquicia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franquicia.entities.ProductoEntity;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

}
