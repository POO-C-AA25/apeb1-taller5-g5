import java.util.Scanner;

 class Problema_1_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema_1_CarritoDeCompras carrito = new Problema_1_CarritoDeCompras();

        carrito.agregarProductoInventario(new Problema_1_Producto("Camisa", 25.0, 100));
        carrito.agregarProductoInventario(new Problema_1_Producto("Pantalon", 40.0, 50));
        carrito.agregarProductoInventario(new Problema_1_Producto("Zapatos", 60.0, 30));

        System.out.println("Ingrese el porcentaje de descuento (si aplica, de lo contrario 0): ");
        carrito.descuento = sc.nextDouble();
        if (carrito.descuento < 0 || carrito.descuento > 100) {
            System.out.println("Descuento inválido. Se establecerá en 0%.");
            carrito.descuento = 0;
        }

        sc.nextLine();
        String continuar = "si";
        while (continuar.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el nombre del producto a comprar:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la cantidad:");
            int cantidad = sc.nextInt();
            sc.nextLine();
            System.out.println(carrito.agregarProducto(nombre, cantidad));

            System.out.println("¿Desea agregar otro producto? (si/no):");
            continuar = sc.nextLine();
        }

        System.out.println("Resumen de la compra:");
        System.out.println(carrito.mostrarResumenCompra());

        System.out.println("Ingrese el monto pagado:");
        double monto = sc.nextDouble();
        System.out.println(carrito.realizarPago(monto));
    }
}