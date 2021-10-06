
package Bean;

public class ControlCombustible {
    private int idCombustible;
    private float vueltas;
    private int tipoCombustible;
    private float CamtidadGalon;
    private float TotalPago;
    private String Vehiculo;
    private String fecha;
    private String usuario;

    public int getIdCombustible() {
        return idCombustible;
    }

    public void setIdCombustible(int idCombustible) {
        this.idCombustible = idCombustible;
    }

    public float getVueltas() {
        return vueltas;
    }

    public void setVueltas(float vueltas) {
        this.vueltas = vueltas;
    }

    public int getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(int tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public float getCamtidadGalon() {
        return CamtidadGalon;
    }

    public void setCamtidadGalon(float CamtidadGalon) {
        this.CamtidadGalon = CamtidadGalon;
    }

    public float getTotalPago() {
        return TotalPago;
    }

    public void setTotalPago(float TotalPago) {
        this.TotalPago = TotalPago;
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
            
}
