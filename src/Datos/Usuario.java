package Datos;

public class Usuario {
    /* VARIABLES GLOBALES DE LA CLASE */
    private String codigo;
    private String nombre;
    private String apellido;
    private String dui;
    private String sexo;
    private String telefono;
    private String celular;
    private String profesion;
    private String direccion;
    private String tipo;
    private String usuario;
    private String pass;
    
    /* CONTRUCTOR */
    public Usuario() {
        this.codigo = "";
        this.nombre = "";
        this.apellido = "";
        this.dui = "";
        this.sexo = "";
        this.telefono = "";
        this.celular = "";
        this.profesion = "";
        this.direccion = "";
        this.tipo = "";
        this.usuario = "";
        this.pass = "";
    }

    /* CONSTRUCTOR CON PARAMETROS */
    public Usuario(String codigo, String nombre, String apellido, String dui, String sexo, String telefono, String celular, String profesion, String direccion, String tipo, String usuario, String pass) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.sexo = sexo;
        this.telefono = telefono;
        this.celular = celular;
        this.profesion = profesion;
        this.direccion = direccion;
        this.tipo = tipo;
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
