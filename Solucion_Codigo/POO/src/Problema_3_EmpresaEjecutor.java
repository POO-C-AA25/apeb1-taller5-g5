import java.util.Scanner;

public class Problema_3_EmpresaEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la Empresa: ");
        String nombreE = sc.nextLine();
        System.out.print("Directorio: ");
        String dir = sc.nextLine();

        Problema_3_Empresa empresa = new Problema_3_Empresa(nombreE, dir);

        int i = 0;
        while (i < 3) {
            System.out.println("----- Departamento " + (i+1) + " -----");
            System.out.print("Nombre: ");
            String nom = sc.nextLine();
            System.out.print("Número de Empleados: ");
            int emp = sc.nextInt();
            System.out.print("Producción Anual: ");
            double prod = sc.nextDouble();
            sc.nextLine(); // consumir salto
            empresa.agregarDepartamento(new Problema_3_Departamento(nom, emp, prod), i);
            i++;
        }

        if (!empresa.estaCompleto()) {
            System.out.println("Faltan departamentos por registrar.");
        } else {
            System.out.println("\n--- RESULTADO ---");
            System.out.println(empresa);
        }
        sc.close();
    }
}
