
package com.techlab.model;

import jakarta.persistence.*;

// Indica que esta clase es una entidad JPA
@Entity
@Table(name = "productos") // Mapea a la tabla "articulo"
public class Producto {

    @Id // Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental
    private Long id;

    // @ManyToOne(fetch = FetchType.EAGER)

    private String nombre;
    private Double precio;
    private int stock;

    public Producto() {
    }

    public Producto(Long id, String nombre, Double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
