package db;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="producto")
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private String precio;

}
