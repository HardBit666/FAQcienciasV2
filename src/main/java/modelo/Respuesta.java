package modelo;
// Generated 21/03/2018 11:34:09 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Respuesta generated by hbm2java
 */
public class Respuesta  implements java.io.Serializable {


     private int idrespuesta;
     private Pregunta pregunta;
     private Usuario usuario;
     private String titulo;
     private String detalles;
     private Date fecha;

    public Respuesta() {
    }

    public Respuesta(Pregunta pregunta, Usuario usuario, String titulo, String detalles, Date fecha) {
       this.pregunta = pregunta;
       this.usuario = usuario;
       this.titulo = titulo;
       this.detalles = detalles;
       this.fecha = fecha;
    }
   
    public int getIdrespuesta() {
        return this.idrespuesta;
    }
    
    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }
    public Pregunta getPregunta() {
        return this.pregunta;
    }
    
    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDetalles() {
        return this.detalles;
    }
    
    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}
