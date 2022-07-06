/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab27
 */
public class bibliotecario extends Persona{
    
    private int idBibliotecario;
    private int rut;
    private String nombre;
    private int telefono;
    private String direccion;

    public bibliotecario() {
    }

    public bibliotecario(int idBibliotecario, int rut, String nombre, int telefono, String direccion) {
        this.idBibliotecario = idBibliotecario;
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }
    
    
    
}
