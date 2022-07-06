/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab27
 */
public class Lector extends Persona{
    
    private int numSocio;
    private int rut;
    private String nombre;
    private int telefono;
    private String direccion;

    public Lector() {
    }

    public Lector(int numSocio, int rut, String nombre, int telefono, String direccion) {
        this.numSocio = numSocio;
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    
    
    
}
