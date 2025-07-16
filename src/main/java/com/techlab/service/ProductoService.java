
package com.techlab.service;

import com.techlab.model.Producto;
import java.util.List;
import java.util.Optional;

// Interfaz que define el contrato del servicio
public interface ProductoService {
    List<Producto> listarProductos();

    Optional<Producto> obtenerProductoPorId(Long id);

    Producto guardarProducto(Producto producto);

    Producto actualizarProducto(Long id, Producto producto);

    void eliminarProducto(Long id);
}
