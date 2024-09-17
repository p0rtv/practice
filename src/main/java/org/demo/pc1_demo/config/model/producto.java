package org.demo.pc1_demo.config.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Producto {
    @Id
    Long id;
    String nombre;
    String description;
    Integer stock;
    Float precio;
    @ManyToMany(mappedBy = "productos")
    List<carrito> carritos;
}