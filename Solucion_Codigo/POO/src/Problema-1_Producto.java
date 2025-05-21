 class Problema_1_Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public Problema_1_Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String toString() {
        return "Producto: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad;
    }
}