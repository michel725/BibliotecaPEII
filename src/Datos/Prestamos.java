package Datos;

public class Prestamos {

    /* VARIABLES GLOBALES DE LA CLASE */
    private String codigoLibro;
    private String codigoUsuario;
    private String fechaPrestamo;
    private String fechaDevolucion;
    
    public Prestamos(String codigoLibro, String codigoUsuario, String fechaPrestamo, String fechaDevolucion) {
        this.codigoLibro = codigoLibro;
        this.codigoUsuario = codigoUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Prestamos() {
        this.codigoLibro = "";
        this.codigoUsuario = "";
        this.fechaPrestamo = "";
        this.fechaDevolucion = "";
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
}
