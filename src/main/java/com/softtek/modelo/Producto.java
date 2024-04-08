package com.softtek.modelo;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@ToString

public class Producto {
    private Integer id;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    public String comprobar() throws ProductoException {
        if (id == null) { // Verificar si id es null
            throw new ProductoException("El producto no tiene asignado un id");
        } else {
            return toString();
        }
    }
}
