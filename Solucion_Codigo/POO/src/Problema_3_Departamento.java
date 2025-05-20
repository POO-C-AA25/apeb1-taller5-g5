public class Problema_3_Departamento {
    public String nombre;
    public int numEmpleados;
    public double produccionAnual;
    public char categoria;

    public Problema_3_Departamento(String nombre, int numEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
        this.produccionAnual = produccionAnual;
        determinarCategoria();
    }

    public void determinarCategoria() {
        if (numEmpleados < 10 && produccionAnual < 500000) {
            categoria = 'C';
        } else if (numEmpleados >= 20 && produccionAnual >= 1000000) {
            categoria = 'B';
        } else if (numEmpleados > 20 && produccionAnual > 1000000) {
            categoria = 'A';
        } else {
            categoria = 'C';
        }
    }

    @Override
    public String toString() {
        return "Departamento: " + nombre +
               "\nEmpleados: " + numEmpleados +
               "\nProducción Anual: " + produccionAnual +
               "\nCategoría: " + categoria + "\n";
    }
}
