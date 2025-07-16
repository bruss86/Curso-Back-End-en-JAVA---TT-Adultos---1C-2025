package com.techlab.model;

import jakarta.persistence.*;
//import java.util.List;

@Entity
@Table(name = "pedidos") // Mapea a la tabla "pedidos"

public class Pedido {

    @Id // Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental
    private Long id;

    // @ManyToOne(fetch = FetchType.EAGER)
    private Long usuarioid;

    // debemos recibir una lista de productos
    private String itemspedido;
    // private List<Producto> itemsPedido;

    public Pedido() {
    }

    public Pedido(Long id, Long usuarioid, String itemspedido) {
        this.id = id;
        this.usuarioid = usuarioid;
        this.itemspedido = itemspedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioid() {
        return usuarioid;
    }

    public void setClienteid(Long usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getItemspedido() {
        return itemspedido;
    }

    public void setItemspedido(String itemspedido) {
        this.itemspedido = itemspedido;
    }

}
