public class MainCupon {
    public static void main(String[] args) {
        Cupon cp1 = new Cupon("MODA15", 15.0, "Moda", true);
        Cupon cp2 = new Cupon("TECH20", 20.0, "Tecnología", true);
        Cupon cp3 = new Cupon("HOGAR10", 10.0, "Hogar", false);
        Cupon cp4 = new Cupon("MODA30", 30.0, "Moda", true);
        Cupon cp5 = new Cupon("TECH25", 25.0, "Tecnología", false);
        Cupon cp6 = new Cupon("HOGAR05", 5.0, "Hogar", true);

        Cupon[] arregloCupones = {cp1, cp2, cp3, cp4, cp5, cp6};
        GestorCupones gestor = new GestorCupones(arregloCupones);

        System.out.println("=== PRUEBAS MÍNIMAS ND-A3 ===");
        System.out.println("Cupones activos: " + gestor.contarActivos());
        System.out.println("Promedio de descuento: " + gestor.calcularPromedioDescuento() + "%");

        Cupon encontrado = gestor.buscarPorCodigo("TECH20");
        System.out.println("Búsqueda existente: " + (encontrado != null ? encontrado.describir() : "No encontrado"));

        Cupon noEncontrado = gestor.buscarPorCodigo("NOEXISTE");
        System.out.println("Búsqueda inexistente: " + (noEncontrado != null ? noEncontrado.describir() : "No encontrado"));

        System.out.println("\n--- Categoría: Moda (con resultados) ---");
        System.out.println(gestor.listarPorCategoria("Moda"));

        System.out.println("\n--- Categoría: Tecnología (con resultados) ---");
        System.out.println(gestor.listarPorCategoria("Tecnología"));

        System.out.println("\n--- Categoría: Deportes (sin resultados) ---");
        System.out.println(gestor.listarPorCategoria("Deportes"));

        Cupon mejorActivo = gestor.obtenerCuponActivoMayorPorcentaje();
        System.out.println("\n--- Desafío: Cupón activo con mayor porcentaje ---");
        System.out.println(mejorActivo != null ? mejorActivo.describir() : "No hay cupones activos");
    }
}
