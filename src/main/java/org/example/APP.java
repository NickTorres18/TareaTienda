package org.example;

public class APP {
    public static void inicializar() {
        Tienda tienda = new Tienda();

        Producto product = new Producto("PC", "Computador portatil", 1000, 5, "Computación");

        tienda.instanciarProducto(product);

        tienda.mostrarProducto(product);

        tienda.buscarProducto(product,"PC","Computador portatil");

        tienda.agregarProducto("Celu","d1",200,3,"n");

        tienda.compraProducto("PC","Computación");

        tienda.modificarProducto("PC", "Computador portatil", "Lamptop", "Compu", 1500,
                7, "NO se");

        System.out.println(tienda.eliminarProducto(product));
    }
    public static void main(String[]args) {inicializar();}
}
