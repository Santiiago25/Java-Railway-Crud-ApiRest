package com.products.tecnology.controller;

import com.products.tecnology.entity.Producto;
import com.products.tecnology.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @PostMapping("/save")
    public Producto save(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @GetMapping("/productos")
    public List<Producto> findAll(){
        return productoService.findAll();
    }

    @GetMapping("/producto/{id}")
    public Producto findById(@PathVariable Long id){
        return productoService.findById(id);
    }

    @DeleteMapping("/producto/{id}")
    public void deleteById(@PathVariable Long id){
        productoService.deleteById(id);
    }

    @PutMapping("/update")
    public Producto updateProducto(@RequestBody Producto producto){
        Producto productodb = productoService.findById(producto.getId());
        productodb.setNombre(producto.getNombre());
        productodb.setMarca(producto.getMarca());
        productodb.setModelo(producto.getMarca());
        productodb.setStock(producto.isStock());
        return productoService.update(productodb);
    }

}
