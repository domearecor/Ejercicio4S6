public class Cupon {
    private String codigo;
    private double porcentaje;
    private String categoria;
    private boolean activo;

    public Cupon(String codigo, double porcentaje, String categoria, boolean activo) {
        this.codigo = codigo;
        this.porcentaje = porcentaje;
        this.categoria = categoria;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String describir() {
        String estado = activo ? "Activo" : "Inactivo";
        return "Código: " + codigo + " | Descuento: " + porcentaje + "% | Categoría: " + categoria + " | " + estado;
    }
}
