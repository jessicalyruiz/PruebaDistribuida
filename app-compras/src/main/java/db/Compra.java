package db;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name="compra")
@Data
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private BigDecimal precio;

    @Column(name="producto_id")
    private Integer productoId;

    @Column(name="cliente_id")
    private Integer clienteId;
}
