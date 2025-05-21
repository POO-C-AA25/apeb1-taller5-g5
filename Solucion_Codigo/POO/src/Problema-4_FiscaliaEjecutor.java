import java.util.Scanner;
import java.util.ArrayList;

 class Problema_4_FiscaliaEjecutor {
    public static Problema_4_CasoCorrupcion buscarCaso(ArrayList<Problema_4_CasoCorrupcion> lista, String id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).idCaso.equals(id)) {
                return lista.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Problema_4_CasoCorrupcion> casos = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú Fiscalía ---");
            System.out.println("1) Registrar caso");
            System.out.println("2) Agregar implicado");
            System.out.println("3) Agregar alerta");
            System.out.println("4) Actualizar urgencias");
            System.out.println("5) Mostrar casos");
            System.out.println("6) Salir");
            System.out.print("Opción: ");
            int opt = sc.nextInt(); sc.nextLine();

            if (opt == 1) {
                System.out.print("ID caso: "); String id = sc.nextLine();
                System.out.print("Nombre: "); String nom = sc.nextLine();
                System.out.print("Fecha inicio: "); String fi = sc.nextLine();
                System.out.print("Info adicional: "); String info = sc.nextLine();
                casos.add(new Problema_4_CasoCorrupcion(id, nom, fi, info));

            } else if (opt == 2) {
                System.out.print("ID caso: "); String id2 = sc.nextLine();
                Problema_4_CasoCorrupcion c = buscarCaso(casos, id2);
                if (c != null) {
                    System.out.print("Tipo delito: "); String td = sc.nextLine();
                    System.out.print("Nombre: "); String ni = sc.nextLine();
                    System.out.print("Edad: "); int ed = sc.nextInt(); sc.nextLine();
                    System.out.print("Nacionalidad: "); String na = sc.nextLine();
                    System.out.print("Ocupación: "); String oc = sc.nextLine();
                    System.out.print("Descripción: "); String de = sc.nextLine();
                    c.agregarImplicado(new Problema_4_Implicado(td, ni, ed, na, oc, de));
                }

            } else if (opt == 3) {
                System.out.print("ID caso: "); String id3 = sc.nextLine();
                Problema_4_CasoCorrupcion c2 = buscarCaso(casos, id3);
                if (c2 != null) {
                    System.out.print("Fecha alerta: "); String fa = sc.nextLine();
                    System.out.print("Descripción alerta: "); String da = sc.nextLine();
                    c2.agregarAlerta(new Problema_4_Alerta(fa, da));
                }

            } else if (opt == 4) {
                for (int i = 0; i < casos.size(); i++) {
                    casos.get(i).actualizarUrgencia();
                }
                System.out.println("Urgencias actualizadas.");

            } else if (opt == 5) {
                for (int i = 0; i < casos.size(); i++) {
                    System.out.println(casos.get(i));
                }

            } else if (opt == 6) {
                salir = true;
            } else {
                System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
