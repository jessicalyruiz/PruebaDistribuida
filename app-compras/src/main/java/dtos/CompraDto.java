package dtos;

import db.Compra;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
@Data
@ToString
public class CompraDto {

    private Integer id;

    private BigDecimal precio;


    private String productoNombre;

    private String clienteNombre;
    

    public static CompraDto from(Compra obj) {
        CompraDto ret = new CompraDto();

        ret.setId(obj.getId());
        ret.setPrecio(obj.getPrecio());

        return ret;
    }
}
