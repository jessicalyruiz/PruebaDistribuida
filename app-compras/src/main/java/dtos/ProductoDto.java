package dtos;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductoDto {

    private Integer id;

    private String nombre;

    private String precio;
}
