
package com.techlab.controller;

import com.techlab.model.Producto;
import com.techlab.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController // Expone métodos como API REST
@RequestMapping("/api/productos") // Ruta base
public class ProductosController {

    @Autowired
    private final ProductoService productoService;

    public ProductosController(ProductoService articuloService) {
        this.productoService = articuloService;
    }

    @GetMapping
    public List<Producto> listar() {
        // return productoService.listarProductos();
        try {
            return productoService.listarProductos();
        } catch (Exception e) {
            throw new RuntimeException("Error al listar productos: " + e.getMessage(), e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerPorId(@PathVariable Long id) {
        try {
            return productoService.obtenerProductoPorId(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener producto por ID: " + e.getMessage(), e);
        }
        /*
         * return productoService.obtenerProductoPorId(id)
         * .map(ResponseEntity::ok)
         * .orElse(ResponseEntity.notFound().build());
         */
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizar(@PathVariable Long id, @RequestBody Producto producto) {
        if (productoService.obtenerProductoPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productoService.actualizarProducto(id, producto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (productoService.obtenerProductoPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        productoService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }
}
