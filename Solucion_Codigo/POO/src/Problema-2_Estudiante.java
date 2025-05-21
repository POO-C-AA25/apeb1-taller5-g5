 class Problema_2_Estudiante {
    public String nombre;
    public int edad;
    public Problema_2_Materia materia;

    public Problema_2_Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void asignarMateria(Problema_2_Materia materia) {
        this.materia = materia;
    }

    public String verificarAprobacion(double notaRecuperacion) {
        if (materia == null) {
            return "No se ha asignado ninguna materia al estudiante.";
        }
        double total = materia.obtenerTotal();
        if (total >= 7.0) {
            return "Estudiante aprobado con " + total + " puntos.";
        } else {
            double nuevoTotal = materia.obtenerTotalParcial() + notaRecuperacion;
            if (nuevoTotal >= 7.0) {
                return "Estudiante aprobado con recuperación. Nota final: " + nuevoTotal;
            } else {
                return "Estudiante reprobado. Nota final con recuperación: " + nuevoTotal;
            }
        }
    }

    public String toString() {
        return "Estudiante: " + nombre + ", Edad: " + edad + ", Materia: " + (materia != null ? materia.nombre : "No asignada");
    }
}