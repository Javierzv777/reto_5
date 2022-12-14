package com.example.inventariosappspring.modelo;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column("codigo")
    private Long codigo;

    @Column("nombre")
    private String nombre;

    @Column("precio")
    private Double precio;
    
    @Column("inventario")
    private Integer inventario;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }



    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", inventario=" + inventario + ", nombre=" + nombre + ", precio=" + precio
                + "]";
    }

    public void agregar(){

    }
    
    public void actualizar(){

    }

    public void eliminar(){

    }

    public void generarInforme(){
        
    }
}
