package com.products.tecnology.service;

import com.products.tecnology.entity.Producto;

import java.util.List;

public interface IProductoService {

    //Guardar producto
    Producto save(Producto producto);

    List<Producto> findAll();

    Producto findById(Long id);

    void deleteById(Long id);

    Producto update(Producto producto);



}
