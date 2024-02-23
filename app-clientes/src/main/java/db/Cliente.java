package db;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="cliente")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    private String apellido;

    private String direccion;
}
