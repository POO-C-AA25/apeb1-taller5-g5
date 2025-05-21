 class Problema_4_Implicado {
    public String tipoDelito, nombre, nacionalidad, ocupacion, descripcion;
    public int edad;

    public Problema_4_Implicado(String tipoDelito, String nombre, int edad,
                                String nacionalidad, String ocupacion, String descripcion) {
        this.tipoDelito = tipoDelito;
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.ocupacion = ocupacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años), " + nacionalidad +
               ", " + ocupacion + ". Delito: " + tipoDelito +
               ". " + descripcion;
    }
}
