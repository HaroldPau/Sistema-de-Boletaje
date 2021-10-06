

package Bean;

public class Despacho {

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public int getPadron() {
        return padron;
    }

    public void setPadron(int padron) {
        this.padron = padron;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String hora;
    private String fecha;
    private String conductor;
    private int padron;
    private int id;
    
    
}
