package presentacion;

import com.softtek.modelo.Producto;
import com.softtek.modelo.ProductoException;

public class EjemploUso8 {

        public static void main(String[] args) {
            try {
                Producto miProduct = new Producto(1, "Camiseta", 19.99, "Primark", "Camiseta de algodón");


                miProduct.comprobar();

                System.out.println("El producto tiene asignado un ID.");
            } catch (ProductoException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
