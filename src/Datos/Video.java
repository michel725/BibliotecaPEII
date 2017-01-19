package Datos;

public class Video {
    /* VARIABLES GLOBALES DE LA CLASE */
    private String codigo;
    private String titulo;
    private String director;
    private int productora;
    private String tipo;
    private String anio;
    private int duracion;
    private int pais;
    private int idioma;
    private String subtitulo;
    private int clasificacion;
    private String genero;
    private String ubicacion;
    private String sinopsis;
    
    /* CONSTRUCTOR */
    public Video() {
        this.codigo = "";
        this.titulo = "";
        this.director = "";
        this.productora = 0;
        this.tipo = "";
        this.anio = "";
        this.duracion = 0;
        this.pais = 0;
        this.idioma = 0;
        this.subtitulo = "";
        this.clasificacion = 0;
        this.genero = "";
        this.ubicacion = "";
        this.sinopsis = "";
    }

    /* CONSTRUCTOR CON PARAMETROS */
    public Video(String codigo, String titulo, String director, int productora, String tipo, String anio, int duracion, int pais, int idioma, String subtitulo, int clasificacion, String genero, String ubicacion, String sinopsis) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.productora = productora;
        this.tipo = tipo;
        this.anio = anio;
        this.duracion = duracion;
        this.pais = pais;
        this.idioma = idioma;
        this.subtitulo = subtitulo;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.ubicacion = ubicacion;
        this.sinopsis = sinopsis;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getProductora() {
        return productora;
    }

    public void setProductora(int productora) {
        this.productora = productora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
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

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

}
