package Controlador.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "consulta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c"),
    @NamedQuery(name = "Consulta.findByIdConsulta", query = "SELECT c FROM Consulta c WHERE c.idConsulta = :idConsulta"),
    @NamedQuery(name = "Consulta.findByMotivo", query = "SELECT c FROM Consulta c WHERE c.motivo = :motivo"),
    @NamedQuery(name = "Consulta.findByClienteNombre", query = "SELECT c FROM Consulta c WHERE c.clienteNombre = :clienteNombre"),
    @NamedQuery(name = "Consulta.findByClienteApellido", query = "SELECT c FROM Consulta c WHERE c.clienteApellido = :clienteApellido"),
    @NamedQuery(name = "Consulta.findByClienteCorreo", query = "SELECT c FROM Consulta c WHERE c.clienteCorreo = :clienteCorreo"),
    @NamedQuery(name = "Consulta.findByClienteTelefono", query = "SELECT c FROM Consulta c WHERE c.clienteTelefono = :clienteTelefono"),
    @NamedQuery(name = "Consulta.findByTienda", query = "SELECT c FROM Consulta c WHERE c.tienda = :tienda"),
    @NamedQuery(name = "Consulta.findByComentario", query = "SELECT c FROM Consulta c WHERE c.comentario = :comentario")})
public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consulta")
    private Long idConsulta;
    @Size(max = 100)
    @Column(name = "motivo")
    private String motivo;
    @Size(max = 100)
    @Column(name = "cliente_nombre")
    private String clienteNombre;
    @Size(max = 100)
    @Column(name = "cliente_apellido")
    private String clienteApellido;
    @Size(max = 500)
    @Column(name = "cliente_correo")
    private String clienteCorreo;
    @Column(name = "cliente_telefono")
    private Integer clienteTelefono;
    @Size(max = 500)
    @Column(name = "tienda")
    private String tienda;
    @Size(max = 1000)
    @Column(name = "comentario")
    private String comentario;

    public Consulta() {
    }

    public Consulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String getClienteApellido() {
        return clienteApellido;
    }

    public void setClienteApellido(String clienteApellido) {
        this.clienteApellido = clienteApellido;
    }

    public String getClienteCorreo() {
        return clienteCorreo;
    }

    public void setClienteCorreo(String clienteCorreo) {
        this.clienteCorreo = clienteCorreo;
    }

    public Integer getClienteTelefono() {
        return clienteTelefono;
    }

    public void setClienteTelefono(Integer clienteTelefono) {
        this.clienteTelefono = clienteTelefono;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsulta != null ? idConsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.idConsulta == null && other.idConsulta != null) || (this.idConsulta != null && !this.idConsulta.equals(other.idConsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.entity.Consulta[ idConsulta=" + idConsulta + " ]";
    }
    
}
