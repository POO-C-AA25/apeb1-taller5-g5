public class Problema_4_Alerta {
    public String fechaAlerta;
    public String descripcion;

    public Problema_4_Alerta(String fechaAlerta, String descripcion) {
        this.fechaAlerta = fechaAlerta;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return fechaAlerta + ": " + descripcion;
    }
}
