class Problema_2_Materia {
    public String nombre;
    public double acd;
    public double ape;
    public double aa;

    public Problema_2_Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public double obtenerTotalParcial() {
        return acd + ape + aa;
    }

    public double obtenerTotal() {
        return acd + ape + aa;
    }

    public String toString() {
        return "Materia: " + nombre + ", ACD: " + acd + ", APE: " + ape + ", AA: " + aa;
    }
}