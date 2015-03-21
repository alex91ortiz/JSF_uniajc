package modelos;
// Generated 21-mar-2015 8:56:03 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tarea generated by hbm2java
 */
@Entity
@Table(name="tarea"
    ,catalog="taller1"
)
public class Tarea  implements java.io.Serializable {


     private int tareaId;
     private Persona persona;
     private Proyecto proyecto;
     private String nombre;
     private String descripcion;
     private Date fecha;
     private Long ejecucion;
     private String estadoTarea;

    public Tarea() {
    }

	
    public Tarea(int tareaId) {
        this.tareaId = tareaId;
    }
    public Tarea(int tareaId, Persona persona, Proyecto proyecto, String nombre, String descripcion, Date fecha, Long ejecucion, String estadoTarea) {
       this.tareaId = tareaId;
       this.persona = persona;
       this.proyecto = proyecto;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.fecha = fecha;
       this.ejecucion = ejecucion;
       this.estadoTarea = estadoTarea;
    }
   
     @Id 

    
    @Column(name="tarea_id", unique=true, nullable=false)
    public int getTareaId() {
        return this.tareaId;
    }
    
    public void setTareaId(int tareaId) {
        this.tareaId = tareaId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Persona_persona_id")
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Proyecto_proyecto_id")
    public Proyecto getProyecto() {
        return this.proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="descripcion", length=65535)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha", length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="ejecucion", precision=10, scale=0)
    public Long getEjecucion() {
        return this.ejecucion;
    }
    
    public void setEjecucion(Long ejecucion) {
        this.ejecucion = ejecucion;
    }

    
    @Column(name="estadoTarea", length=45)
    public String getEstadoTarea() {
        return this.estadoTarea;
    }
    
    public void setEstadoTarea(String estadoTarea) {
        this.estadoTarea = estadoTarea;
    }




}


