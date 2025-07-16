
package com.techlab.service;

import com.techlab.model.Producto;
import com.techlab.repository.ProductosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Marca la clase como servicio de Spring
public class ProductoServiceImpl implements ProductoService {

    private final ProductosRepository productosRepository;

    public ProductoServiceImpl(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    public List<Producto> listarProductos() {
        return productosRepository.findAll();
    }

    public Optional<Producto> obtenerProductoPorId(Long id) {
        return productosRepository.findById(id);
    }

    public Producto guardarProducto(Producto producto) {
        return productosRepository.save(producto);
    }

    public Producto actualizarProducto(Long id, Producto producto) {
        producto.setId(id);
        return productosRepository.save(producto);
    }

    public void eliminarProducto(Long id) {
        productosRepository.deleteById(id);
    }
}
