
import java.util.Arrays;

public class Ejemplo1 {

    public static void main(String[] args) {
        //areglos estaticos
        //Sintaxis => tipoDatos nombreArray[] = new tipo[tamaño];
        int notas[] = new int[3];
        notas[0] = 10;
        notas[1] = 7;
        notas[2] = 8;
        System.out.println("Notas: " + Arrays.toString(notas));
        double calificaciones[] = {9.5, 8.6, 6.4};
        System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
        //Sintaxis for mejorado -> for (tipoDato nombreDestino : arregloOrigen);
        for (double nota : calificaciones) {
            System.out.println("Con " + nota + " " + ((nota >= 6.5) ? "APROB" : "REPRO"));
        }
        //Sintaxis => tipoDatos nombreArray[] = new tipo[tamaño];
        Estudiante listEsts[] = {
            new Estudiante("Mateo", 10.0),
            new Estudiante("Stalin", 9.5),
            new Estudiante("Christian", 6.0)
        };

        // Sintaxis for mejorado -> for (tipoDato nombreDestino : arregloOrigen);
        for (Estudiante est : listEsts) {
            String estado = (est.nota >= 6.5) ? "APROB" : "REPRO";
            System.out.println(est.nombre + " tiene nota " + est.nota + " - " + estado);
        }
    }
}

class Estudiante {

    public String nombre;
    public double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;

    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
}
