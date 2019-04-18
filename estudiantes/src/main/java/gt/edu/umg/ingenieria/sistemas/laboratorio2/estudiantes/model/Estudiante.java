package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre_completo")
    private String nombre_completo;
    @Column(name = "numero_carne")
    private String numero_carne;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "dpi")
    private String dpi;
    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    public Estudiante() {
    }

    public Estudiante(String nombre_completo, String numero_carne, String telefono, String direccion, String correo, String dpi, Date fecha_nacimiento) {
        this.nombre_completo = nombre_completo;
        this.numero_carne = numero_carne;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.dpi = dpi;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNumero_carne() {
        return numero_carne;
    }

    public void setNumero_carne(String numero_carne) {
        this.numero_carne = numero_carne;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
}
