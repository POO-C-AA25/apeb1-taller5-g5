import java.util.Scanner;
import java.util.ArrayList;

class Problema_5_ConflictoEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema_5_ConflictoManager mgr = new Problema_5_ConflictoManager();
        boolean fin = false;

        while (!fin) {
            System.out.println("\n--- Menú Conflictos ONU ---");
            System.out.println("1) Registrar conflicto");
            System.out.println("2) Agregar evento");
            System.out.println("3) Listar activos");
            System.out.println("4) % países en >1 conflicto");
            System.out.println("5) Eliminar concluidos");
            System.out.println("6) Listar por país");
            System.out.println("7) Mostrar todo");
            System.out.println("8) Salir");
            System.out.print("Opción: ");
            int opt = sc.nextInt(); sc.nextLine();

            if (opt == 1) {
                System.out.print("Nombre conflicto: "); String nom = sc.nextLine();
                System.out.print("Etapa actual: "); String eta = sc.nextLine();
                System.out.print("Países (coma): ");
                String[] parts = sc.nextLine().split(",");
                ArrayList<String> ps = new ArrayList<>();
                for (int i = 0; i < parts.length; i++) ps.add(parts[i].trim());
                System.out.print("Fecha inicio etapa: "); String fi = sc.nextLine();
                System.out.print("Estado militar: "); String em = sc.nextLine();
                System.out.print("Indicadores: "); String ind = sc.nextLine();
                mgr.registrarConflicto(new Problema_5_Conflicto(nom, eta, ps, fi, em, ind));

            } else if (opt == 2) {
                System.out.print("Nombre conflicto: "); String nc = sc.nextLine();
                Problema_5_Conflicto c = mgr.buscarConflicto(nc);
                if (c != null) {
                    System.out.print("Tipo evento: "); String te = sc.nextLine();
                    System.out.print("Fecha evento: "); String fe = sc.nextLine();
                    System.out.print("Países (coma): ");
                    String[] arr2 = sc.nextLine().split(",");
                    ArrayList<String> ps2 = new ArrayList<>();
                    for (int j = 0; j < arr2.length; j++) ps2.add(arr2[j].trim());
                    c.agregarEvento(new Problema_5_Evento(te, fe, ps2));
                }

            } else if (opt == 3) {
                ArrayList<Problema_5_Conflicto> activos = mgr.listarActivos();
                for (int i = 0; i < activos.size(); i++) {
                    System.out.println(activos.get(i));
                }

            } else if (opt == 4) {
                double pct = mgr.porcentajePaisesMultiConflicto();
                System.out.printf("%% países en >1 conflicto: %.2f%%\n", pct);

            } else if (opt == 5) {
                mgr.eliminarConcluidos();
                System.out.println("Concluidos eliminados.");

            } else if (opt == 6) {
                System.out.print("País: "); String p = sc.nextLine();
                ArrayList<Problema_5_Conflicto> byPais = mgr.listarPorPais(p);
                for (int i = 0; i < byPais.size(); i++) {
                    System.out.println(byPais.get(i));
                }

            } else if (opt == 7) {
                for (int i = 0; i < mgr.conflictos.size(); i++) {
                    System.out.println(mgr.conflictos.get(i));
                }

            } else if (opt == 8) {
                fin = true;
            } else {
                System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
