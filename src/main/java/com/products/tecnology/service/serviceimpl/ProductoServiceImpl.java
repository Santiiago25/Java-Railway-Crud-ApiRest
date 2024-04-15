package com.products.tecnology.service.serviceimpl;

import com.products.tecnology.entity.Producto;
import com.products.tecnology.repository.IProductoRepository;
import com.products.tecnology.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return (List) productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        Producto producto = productoRepository.findById(id).orElseThrow();
        return  producto;
    }

    @Override
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }
}
