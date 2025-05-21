import java.util.Scanner;

 class Problema_2_EstudianteEjecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        Problema_2_Estudiante estudiante = new Problema_2_Estudiante(nombre, edad);

        System.out.print("Ingrese nombre de la materia: ");
        String nombreMateria = scanner.nextLine();

        System.out.print("Ingrese calificación ACD (sobre 3.5): ");
        double acd = scanner.nextDouble();

        System.out.print("Ingrese calificación APE (sobre 3.5): ");
        double ape = scanner.nextDouble();

        System.out.print("Ingrese calificación AA (sobre 3.0): ");
        double aa = scanner.nextDouble();

        Problema_2_Materia materia = new Problema_2_Materia(nombreMateria, acd, ape, aa);
        estudiante.asignarMateria(materia);

        double totalParcial = materia.obtenerTotal();
        System.out.println("\n" + estudiante.toString());
        System.out.println(materia.toString());

        if (totalParcial < 7.0) {
            System.out.print("Estudiante no aprueba directamente. Ingrese nota de recuperación (sobre 3.5): ");
            double recuperacion = scanner.nextDouble();
            System.out.println(estudiante.verificarAprobacion(recuperacion));
        } else {
            System.out.println(estudiante.verificarAprobacion(0));
        }

        scanner.close();
    }
}