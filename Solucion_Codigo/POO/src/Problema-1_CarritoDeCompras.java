import java.util.ArrayList;

 class Problema_1_CarritoDeCompras {
    public ArrayList<Problema_1_Producto> inventario;
    public ArrayList<Problema_1_Producto> productosSeleccionados;
    public double descuento;

    public Problema_1_CarritoDeCompras() {
        inventario = new ArrayList<>();
        productosSeleccionados = new ArrayList<>();
        descuento = 0;
    }

    public void agregarProductoInventario(Problema_1_Producto producto) {
        inventario.add(producto);
    }

    public String agregarProducto(String nombre, int cantidad) {
        for (Problema_1_Producto p : inventario) {
            if (p.nombre.equalsIgnoreCase(nombre)) {
                if (p.cantidad >= cantidad) {
                    productosSeleccionados.add(new Problema_1_Producto(p.nombre, p.precio, cantidad));
                    return "Producto agregado al carrito.";
                } else {
                    return "No hay suficiente cantidad disponible.";
                }
            }
        }
        return "Producto no encontrado en la tienda.";
    }

    public double calcularTotal() {
        double total = 0;
        for (Problema_1_Producto p : productosSeleccionados) {
            total += p.precio * p.cantidad;
        }
        if (total > 1000) {
            total = total - (total * descuento / 100);
        }
        return total;
    }

    public String realizarPago(double monto) {
        double total = calcularTotal();
        if (monto >= total) {
            for (Problema_1_Producto comprado : productosSeleccionados) {
                for (Problema_1_Producto p : inventario) {
                    if (p.nombre.equalsIgnoreCase(comprado.nombre)) {
                        p.cantidad -= comprado.cantidad;
                    }
                }
            }
            return "Gracias por su compra. Su cambio es: $" + (monto - total);
        } else {
            return "Monto insuficiente. Faltan: $" + (total - monto);
        }
    }

    public String mostrarDetalleCompra() {
        String detalle = "";
        for (Problema_1_Producto p : productosSeleccionados) {
            detalle += p.toString() + "\n";
        }
        return detalle;
    }

    public String mostrarResumenCompra() {
        double subtotal = 0;
        for (Problema_1_Producto p : productosSeleccionados) {
            subtotal += p.precio * p.cantidad;
        }

        String resumen = mostrarDetalleCompra();
        resumen += "\nSubtotal: $" + subtotal;

        if (subtotal > 1000) {
            double descuentoAplicado = subtotal * descuento / 100;
            resumen += "\nDescuento aplicado (" + descuento + "%): -$" + descuentoAplicado;
            resumen += "\nTotal a pagar: $" + (subtotal - descuentoAplicado);
        } else {
            resumen += "\nTotal a pagar: $" + subtotal;
        }

        return resumen;
    }
}