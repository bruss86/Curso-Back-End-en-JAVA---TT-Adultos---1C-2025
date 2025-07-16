package com.techlab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techlab.model.Producto;

@Repository
public interface ProductosRepository extends JpaRepository<Producto, Long> {

    // ===============================================
    // 🚀 MÉTODOS CRUD INCLUIDOS AUTOMÁTICAMENTE
    // ===============================================
    // findAll() -> Lista todos los artículos
    // findById(Long id) -> Busca uno por ID
    // save(Articulo a) -> Inserta o actualiza
    // deleteById(Long id) -> Elimina por ID
    // count() -> Cuenta registros
    // existsById(Long id) -> Verifica si existe un ID

    // ===============================================
    // 🛠️ MÉTODOS PERSONALIZADOS (se generan por nombre)
    // ===============================================

    // Buscar artículos por nombre exacto
    List<Producto> findByNombre(String nombre);

    List<Producto> findByPrecio(Double precio);

    List<Producto> findByStock(int stock);

    // Buscar artículos cuyo nombre contenga una palabra (LIKE '%texto%')
    List<Producto> findByNombreContaining(String texto);

    // Buscar artículos con precio mayor a un valor dado
    List<Producto> findByPrecioGreaterThan(Double precio);

    // Buscar artículos con precio entre dos valores
    List<Producto> findByPrecioBetween(Double min, Double max);

    // Buscar por nombre ignorando mayúsculas y minúsculas
    List<Producto> findByNombreIgnoreCase(String nombre);

    // Buscar artículos ordenados por precio ascendente
    List<Producto> findAllByOrderByPrecioAsc();

    // Buscar artículos por nombre y precio mayor a cierto valor
    List<Producto> findByNombreAndPrecioGreaterThan(String nombre, Double precio);
}
