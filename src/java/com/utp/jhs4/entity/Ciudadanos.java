package com.utp.jhs4.entity;
// Generated 18/09/2019 12:46:49 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Ciudadanos generated by hbm2java
 */
public class Ciudadanos  implements java.io.Serializable {


     private BigDecimal cedula;
     private String nombre;
     private Set<Prestamos> prestamoses = new HashSet<Prestamos>(0);

    public Ciudadanos() {
    }

	
    public Ciudadanos(BigDecimal cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public Ciudadanos(BigDecimal cedula, String nombre, Set<Prestamos> prestamoses) {
       this.cedula = cedula;
       this.nombre = nombre;
       this.prestamoses = prestamoses;
    }
   
    public BigDecimal getCedula() {
        return this.cedula;
    }
    
    public void setCedula(BigDecimal cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Prestamos> getPrestamoses() {
        return this.prestamoses;
    }
    
    public void setPrestamoses(Set<Prestamos> prestamoses) {
        this.prestamoses = prestamoses;
    }




}


