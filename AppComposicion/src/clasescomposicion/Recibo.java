package clasescomposicion;

public class Recibo extends Comprobante {
    private Proveedor proveedor;
    private float total;
    private String detalle;
    
    public Recibo() {
    }
    
    public Recibo(int dia, int mes, int anio, String razonSocial, int codigo) {
        super(dia, mes, anio);
        proveedor = new Proveedor(razonSocial, codigo);
    }
    
    public Proveedor getProveedor() {
        return proveedor;
    }
    
    public void setProveedor(Proveedor val) {
        this.proveedor = val;
    }
    
    public float getTotal() {
        return total;
    }
    
    public void setTotal(float val) {
        this.total = val;
    }
    
    public String getDetalle() {
        return detalle;
    }
    
    public void setDetalle(String val) {
        this.detalle = val;
    }
    
    public void mostrar() {
        System.out.println("Tipo: " + getTipo() + " Número: " + getNumero());
        System.out.println("Fecha: " + getFecha().getDia() + "/" + 
                          getFecha().getMes() + "/" + getFecha().getAnio());
        System.out.println("Proveedor Código: " + proveedor.getCodigo() + 
                          ", Razón Social: " + proveedor.getRazonSocial());
        System.out.println("Servicio Detalle: " + getDetalle() + 
                          ", Importe Total: " + getTotal());
    }
}