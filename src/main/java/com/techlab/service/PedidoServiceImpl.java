package com.techlab.service;

import com.techlab.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.techlab.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PedidoServiceImpl implements PedidoService {
    private final PedidosRepository pedidosRepository;

    @Autowired
    public PedidoServiceImpl(PedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }

    @Override
    public List<Pedido> listarPedidos() {
        return pedidosRepository.findAll();
    }

    @Override
    public Optional<Pedido> obtenerPedidoPorId(Long id) {
        return pedidosRepository.findById(id);
    }

    @Override
    public Pedido guardarPedido(Pedido pedido) {
        return pedidosRepository.save(pedido);
    }

    @Override
    public Pedido actualizarPedido(Long id, Pedido pedido) {
        pedido.setId(id);
        return pedidosRepository.save(pedido);
    }

    @Override
    public void eliminarPedido(Long id) {
        pedidosRepository.deleteById(id);
    }
}
