 class Problema_3_Empresa {
    public String nombre;
    public String directorio;
    public Problema_3_Departamento[] departamentos;

    public Problema_3_Empresa(String nombre, String directorio) {
        this.nombre = nombre;
        this.directorio = directorio;
        departamentos = new Problema_3_Departamento[3];
    }

    public void agregarDepartamento(Problema_3_Departamento dep, int indice) {
        if (indice >= 0 && indice < departamentos.length) {
            departamentos[indice] = dep;
        }
    }

    public boolean estaCompleto() {
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] == null) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "Empresa: " + nombre + "\nDirectorio: " + directorio + "\n\n";
        for (int i = 0; i < departamentos.length; i++) {
            s += departamentos[i] + "\n";
        }
        return s;
    }
}
