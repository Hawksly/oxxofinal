/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.entity;

import Modelo.Producto;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MIGUEL
 */
@Entity
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p"),
    @NamedQuery(name = "Productos.findByIdProducto", query = "SELECT p FROM Productos p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Productos.findByNombrePoducto", query = "SELECT p FROM Productos p WHERE p.nombrePoducto = :nombrePoducto"),
    @NamedQuery(name = "Productos.findByDescripcionProducto", query = "SELECT p FROM Productos p WHERE p.descripcionProducto = :descripcionProducto"),
    @NamedQuery(name = "Productos.findByPrecioProducto", query = "SELECT p FROM Productos p WHERE p.precioProducto = :precioProducto"),
    @NamedQuery(name = "Productos.findByCategoriaProducto", query = "SELECT p FROM Productos p WHERE p.categoriaProducto = :categoriaProducto"),
    @NamedQuery(name = "Productos.findByRutaProducto", query = "SELECT p FROM Productos p WHERE p.rutaProducto = :rutaProducto")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre_poducto")
    private String nombrePoducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "descripcion_producto")
    private String descripcionProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_producto")
    private double precioProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "categoria_producto")
    private String categoriaProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "ruta_producto")
    private String rutaProducto;

    public Productos() {
    }

    public Productos(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Productos(Integer idProducto, String nombrePoducto, String descripcionProducto, double precioProducto, String categoriaProducto, String rutaProducto) {
        this.idProducto = idProducto;
        this.nombrePoducto = nombrePoducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
        this.rutaProducto = rutaProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombrePoducto() {
        return nombrePoducto;
    }

    public void setNombrePoducto(String nombrePoducto) {
        this.nombrePoducto = nombrePoducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getRutaProducto() {
        return rutaProducto;
    }

    public void setRutaProducto(String rutaProducto) {
        this.rutaProducto = rutaProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.entity.Productos[ idProducto=" + idProducto + " ]";
    }
    
}
