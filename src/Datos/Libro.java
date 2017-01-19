package Datos;

public class Libro {
    /* VARIABLES GLOBALES DE LA CLASE */
    private String codigo;
    private String titulo;
    private String autor;
    private int editorial;
    private String ISBN;
    private String anioEdicion;
    private int numEdicion;
    private int pais;
    private int idioma;
    private String materia;
    private int paginas;
    private String ubicacion;
    private String descripcion;
    private String tipo;
    private String estado;
    
    /* CONSTRUCTOR */
    public Libro() {
        this.codigo = "";
        this.titulo = "";
        this.autor = "";
        this.editorial = 0;
        this.ISBN = "";
        this.anioEdicion = "";
        this.numEdicion = 0;
        this.pais = 0;
        this.idioma = 0;
        this.materia = "";
        this.paginas = 0;
        this.ubicacion = "";
        this.descripcion = "";
        this.tipo = "";
        this.estado = "";
    }

    /* CONSTRUCTOR CON PARAMETROS */
    public Libro(String codigo, String titulo, String autor, int editorial, String ISBN, String anioEdicion, int numEdicion, int pais, int idioma, String materia, int paginas, String ubicacion, String descripcion, String tipo, String estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.anioEdicion = anioEdicion;
        this.numEdicion = numEdicion;
        this.pais = pais;
        this.idioma = idioma;
        this.materia = materia;
        this.paginas = paginas;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(String anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public int getIdioma() {
        return idioma;
    }

    public void setIdioma(int idioma) {
        this.idioma = idioma;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
