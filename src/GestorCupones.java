public class GestorCupones {
    private Cupon[] cupones;

    public GestorCupones(Cupon[] cupones) {
        this.cupones = cupones;
    }

    public int contarActivos() {
        if (cupones == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null && cupones[i].isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public Cupon buscarPorCodigo(String codigo) {
        if (cupones == null || codigo == null) {
            return null;
        }
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null && cupones[i].getCodigo().equalsIgnoreCase(codigo)) {
                return cupones[i];
            }
        }
        return null;
    }

    public double calcularPromedioDescuento() {
        if (cupones == null || cupones.length == 0) {
            return 0.0;
        }
        double suma = 0.0;
        int validos = 0;
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null) {
                suma += cupones[i].getPorcentaje();
                validos++;
            }
        }
        if (validos == 0) {
            return 0.0;
        }
        return suma / validos;
    }

    public String listarPorCategoria(String categoria) {
        if (cupones == null || categoria == null) {
            return "No hay cupones disponibles para esa categoría.";
        }
        String resultado = "";
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null && cupones[i].getCategoria().equalsIgnoreCase(categoria)) {
                if (!resultado.isEmpty()) {
                    resultado += "\n";
                }
                resultado += cupones[i].describir();
            }
        }
        return resultado.isEmpty() ? "No se encontraron cupones en la categoría: " + categoria : resultado;
    }

    // Desafío: retorna el cupón activo con mayor porcentaje
    public Cupon obtenerCuponActivoMayorPorcentaje() {
        if (cupones == null) {
            return null;
        }
        Cupon mayor = null;
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null && cupones[i].isActivo()) {
                if (mayor == null || cupones[i].getPorcentaje() > mayor.getPorcentaje()) {
                    mayor = cupones[i];
                }
            }
        }
        return mayor;
    }
}