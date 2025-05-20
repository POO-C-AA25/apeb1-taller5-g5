import java.util.ArrayList;

public class Problema_5_Evento {
    public String tipoEvento;
    public String fechaEvento;
    public ArrayList<String> paisesInvolucrados;

    public Problema_5_Evento(String tipoEvento, String fechaEvento, ArrayList<String> paises) {
        this.tipoEvento = tipoEvento;
        this.fechaEvento = fechaEvento;
        this.paisesInvolucrados = paises;
    }

    @Override
    public String toString() {
        return tipoEvento + " (" + fechaEvento + "), países: " + paisesInvolucrados;
    }
}
