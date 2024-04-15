package com.products.tecnology.repository;

import com.products.tecnology.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends CrudRepository<Producto, Long> {
}
