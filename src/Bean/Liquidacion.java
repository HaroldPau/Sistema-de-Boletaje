
package Bean;

public class Liquidacion {

    /**
     * @return the codigoe
     */
    public String getCodigoe() {
        return codigoe;
    }

    /**
     * @param codigoe the codigoe to set
     */
    public void setCodigoe(String codigoe) {
        this.codigoe = codigoe;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the vuelta
     */
    public int getVuelta() {
        return vuelta;
    }

    /**
     * @param vuelta the vuelta to set
     */
    public void setVuelta(int vuelta) {
        this.vuelta = vuelta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPadron() {
        return padron;
    }

    public void setPadron(String padron) {
        this.padron = padron;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    private String padron;
    private String fecha;
    private double precio;
    private double total;
    private int cantidad;
    private String nombre;
    private int vuelta;
    private String codigoe;
    private int guia;
    private int codigob;
    private String inicio;
    private int CodigoL;

    public int getGuia() {
        return guia;
    }

    public void setGuia(int guia) {
        this.guia = guia;
    }

    public int getCodigob() {
        return codigob;
    }

    public void setCodigob(int codigob) {
        this.codigob = codigob;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public int getCodigoL() {
        return CodigoL;
    }

    public void setCodigoL(int CodigoL) {
        this.CodigoL = CodigoL;
    }
    
    
    
    
    
}
