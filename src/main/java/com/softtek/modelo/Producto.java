package com.softtek.modelo;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@ToString

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    public String comprobar() throws ProductoException {
        if (null == id) {
            throw new ProductoException("El producto no tiene asignado un id");
        } else {
            return toString();
        }
    }

}