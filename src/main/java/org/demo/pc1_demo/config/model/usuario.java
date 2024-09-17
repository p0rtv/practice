package org.demo.pc1_demo.config.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Usuario {
    @Id
    String username;
    String correo;
    String nombrecompleto;
    String password;

    @OneToMany(mappedBy = "usuario")
    List<carrito>carritos;


}