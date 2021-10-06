package Bean;

import java.sql.Blob;

public class Personal {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopa() {
        return apellidopa;
    }

    public void setApellidopa(String apellidopa) {
        this.apellidopa = apellidopa;
    }

    public String getApellidoma() {
        return apellidoma;
    }

    public void setApellidoma(String apellidoma) {
        this.apellidoma = apellidoma;
    }

    public String getTidentificacion() {
        return tidentificacion;
    }

    public void setTidentificacion(String tidentificacion) {
        this.tidentificacion = tidentificacion;
    }

    public String getNidentificacion() {
        return nidentificacion;
    }

    public void setNidentificacion(String nidentificacion) {
        this.nidentificacion = nidentificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(String fechanaci) {
        this.fechanaci = fechanaci;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipolicencia() {
        return tipolicencia;
    }

    public void setTipolicencia(String tipolicencia) {
        this.tipolicencia = tipolicencia;
    }

    public String getNlicencia() {
        return nlicencia;
    }

    public void setNlicencia(String nlicencia) {
        this.nlicencia = nlicencia;
    }

    public String getVencimientolicencia() {
        return vencimientolicencia;
    }

    public void setVencimientolicencia(String vencimientolicencia) {
        this.vencimientolicencia = vencimientolicencia;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }
    private String nombre;
    private String apellidopa;
    private String apellidoma;
    private String tidentificacion;
    private String nidentificacion;
    private String sexo;
    private String fechanaci;
    private String direccion;
    private String distrito;
    private String telefono;
    private String celular;
    private String activo;
    private String propietario;
    private String cargo;
    private String tipolicencia;
    private String nlicencia;
    private String vencimientolicencia;
    private Blob foto;
    
}
