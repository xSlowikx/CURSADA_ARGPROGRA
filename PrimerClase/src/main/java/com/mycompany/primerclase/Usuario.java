/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerclase;

/**
 *
 * @author ale_e
 */
public class Usuario {

    private String nombre;
    private Integer edad;
    private String paisNacimiento;

    public Usuario(String nombre, Integer edad, String paisNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.paisNacimiento = paisNacimiento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @return the paisNacimiento
     */
    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     * @param paisNacimiento the paisNacimiento to set
     */
    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + ", Nacionalidad: " + this.paisNacimiento;
    }

}
