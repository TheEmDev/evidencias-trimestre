import clasescomposicion.Recibo;

public class AppComposicion {
    public static void main(String[] args) throws Exception {
        Recibo recibo = new Recibo(27, 10, 2011, "Limpitruc SA", 2023);
        recibo.setTipo('R');
        recibo.setNumero(1);
        recibo.setDetalle("Pago de servicio jardineria");
        recibo.setTotal(350);
        recibo.mostrar();
    }
}
