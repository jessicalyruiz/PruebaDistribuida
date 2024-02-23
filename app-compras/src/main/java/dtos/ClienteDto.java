package dtos;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ClienteDto {

    private Integer id;

    private String nombre;

    private String apellido;

    private String direccion;
}
