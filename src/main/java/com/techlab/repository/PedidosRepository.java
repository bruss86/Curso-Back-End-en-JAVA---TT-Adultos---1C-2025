package com.techlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techlab.model.Pedido;

@Repository
public interface PedidosRepository extends JpaRepository<Pedido, Long> {

    // Métodos CRUD incluidos automáticamente por JpaRepository
    // findAll() -> Lista todos los pedidos
    // findById(Long id) -> Busca uno por ID
    // save(Pedido p) -> Inserta o actualiza un pedido
    // deleteById(Long id) -> Elimina un pedido por ID
    // count() -> Cuenta registros de pedidos
    // existsById(Long id) -> Verifica si existe un pedido con el ID dado

    // Métodos personalizados pueden ser añadidos aquí según sea necesario

    // Por ejemplo, si se desea buscar pedidos por clienteId:
    // List<Pedido> findByUsuarioId(Long usuarioid);

    // O si se desea buscar pedidos que contengan un producto específico:
    // List<Pedido> findByPedidoContaining(Pedido pedido);
}
