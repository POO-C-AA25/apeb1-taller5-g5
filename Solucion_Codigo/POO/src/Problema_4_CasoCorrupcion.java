import java.util.ArrayList;

public class Problema_4_CasoCorrupcion {
    public String idCaso;
    public String nombre;
    public String fechaInicio;
    public String estado;
    public String infoAdicional;
    public ArrayList<Problema_4_Implicado> implicados;
    public ArrayList<Problema_4_Alerta> alertas;

    public Problema_4_CasoCorrupcion(String idCaso, String nombre,
                                     String fechaInicio, String infoAdicional) {
        this.idCaso = idCaso;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.infoAdicional = infoAdicional;
        this.estado = "En investigación";
        this.implicados = new ArrayList<>();
        this.alertas = new ArrayList<>();
    }

    public void agregarImplicado(Problema_4_Implicado i) {
        implicados.add(i);
    }

    public void agregarAlerta(Problema_4_Alerta a) {
        alertas.add(a);
        actualizarUrgencia();
    }

    public void actualizarUrgencia() {
        if (estado.equals("En investigación") && alertas.size() > 0) {
            estado = "Urgente";
        }
    }

    @Override
    public String toString() {
        String s = "Caso " + idCaso + " [" + nombre + "]\n" +
                   "Inicio: " + fechaInicio + "\n" +
                   "Estado: " + estado + "\n" +
                   "Info: " + infoAdicional + "\n" +
                   "Implicados:\n";
        for (int j = 0; j < implicados.size(); j++) {
            s += "  - " + implicados.get(j) + "\n";
        }
        s += "Alertas:\n";
        for (int j = 0; j < alertas.size(); j++) {
            s += "  - " + alertas.get(j) + "\n";
        }
        return s;
    }
}
