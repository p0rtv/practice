package org.demo.pc1_demo.config.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.demo.pc1_demo.config.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Carrito {
    @Id
    Long id;
    @ManyToOne
    Usuario usuario;
    @ManyToMany
    List<producto> productos;

}