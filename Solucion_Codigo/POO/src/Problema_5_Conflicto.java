import java.util.ArrayList;

public class Problema_5_Conflicto {
    public String nombre;
    public String etapaActual;
    public ArrayList<String> paises;
    public String fechaInicioEtapa;
    public String estadoMilitar;
    public String indicadores;
    public boolean acuerdoPaz;
    public ArrayList<Problema_5_Evento> eventos;

    public Problema_5_Conflicto(String nombre, String etapaActual,
                                ArrayList<String> paises, String fechaInicioEtapa,
                                String estadoMilitar, String indicadores) {
        this.nombre = nombre;
        this.etapaActual = etapaActual;
        this.paises = paises;
        this.fechaInicioEtapa = fechaInicioEtapa;
        this.estadoMilitar = estadoMilitar;
        this.indicadores = indicadores;
        this.acuerdoPaz = false;
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Problema_5_Evento e) {
        eventos.add(e);
        if (e.tipoEvento.equalsIgnoreCase("Paz")) {
            acuerdoPaz = true;
        }
    }

    public boolean tieneAcuerdo() {
        return acuerdoPaz;
    }

    @Override
    public String toString() {
        String s = "Conflicto: " + nombre +
                   "\nEtapa: " + etapaActual +
                   "\nPaíses: " + paises +
                   "\nInicio etapa: " + fechaInicioEtapa +
                   "\nEstado militar: " + estadoMilitar +
                   "\nIndicadores: " + indicadores +
                   "\nAcuerdo de paz: " + acuerdoPaz +
                   "\nEventos:\n";
        for (int j = 0; j < eventos.size(); j++) {
            s += "  - " + eventos.get(j) + "\n";
        }
        return s;
    }
}
