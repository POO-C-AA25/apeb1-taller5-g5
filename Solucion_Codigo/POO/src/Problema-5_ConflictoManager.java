import java.util.ArrayList;
import java.util.HashSet;

 class Problema_5_ConflictoManager {
    public ArrayList<Problema_5_Conflicto> conflictos = new ArrayList<>();

    public void registrarConflicto(Problema_5_Conflicto c) {
        conflictos.add(c);
    }

    public void eliminarConcluidos() {
        for (int i = conflictos.size() - 1; i >= 0; i--) {
            if (conflictos.get(i).tieneAcuerdo()) {
                conflictos.remove(i);
            }
        }
    }

    public ArrayList<Problema_5_Conflicto> listarActivos() {
        ArrayList<Problema_5_Conflicto> activos = new ArrayList<>();
        for (int i = 0; i < conflictos.size(); i++) {
            if (!conflictos.get(i).tieneAcuerdo()) {
                activos.add(conflictos.get(i));
            }
        }
        return activos;
    }

    public double porcentajePaisesMultiConflicto() {
        HashSet<String> todos = new HashSet<>();
        HashSet<String> multi = new HashSet<>();
        for (int i = 0; i < conflictos.size(); i++) {
            Problema_5_Conflicto c = conflictos.get(i);
            for (int j = 0; j < c.paises.size(); j++) {
                String p = c.paises.get(j);
                if (!todos.add(p)) {
                    multi.add(p);
                }
            }
        }
        if (todos.isEmpty()) return 0;
        return (multi.size() * 100.0) / todos.size();
    }

    public Problema_5_Conflicto buscarConflicto(String nombre) {
        for (int i = 0; i < conflictos.size(); i++) {
            if (conflictos.get(i).nombre.equals(nombre)) {
                return conflictos.get(i);
            }
        }
        return null;
    }

    public ArrayList<Problema_5_Conflicto> listarPorPais(String pais) {
        ArrayList<Problema_5_Conflicto> res = new ArrayList<>();
        for (int i = 0; i < conflictos.size(); i++) {
            if (conflictos.get(i).paises.contains(pais)) {
                res.add(conflictos.get(i));
            }
        }
        return res;
    }
}
