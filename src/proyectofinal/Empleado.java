/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *Clase que representa un empleado de la tienda, hereda de la clase indentidad
 * @author sljim
 */
public class Empleado
{
 private String nombre;
 private int id;
 private int edad;
 private String sexo;
 private int telefono;
 private String cargo;
 private String direccion;
 private int horario;
 private String usuario;
 private String password;

    public Empleado(String nombre, int id, int edad, String sexo, int telefono, String cargo, String direccion, int horario, String usuario, String password) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.cargo = cargo;
        this.direccion = direccion;
        this.horario = horario;
        this.usuario = usuario;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", sexo=" + sexo + ", telefono=" + telefono + ", cargo=" + cargo + ", direccion=" + direccion + ", horario=" + horario + ", usuario=" + usuario + ", password=" + password + '}';
    }
   /**
    * Constructor de la clase Empleado
    * @param pNombre Nombre del empleado
    * @param pID Identificación del empleado
    * @param pCosto Dinero que se le debe al empleado por las horas
    * @param pFechaContratado Horas que el empleado trabajó
    * @param pPassword Contraseña del empleado para ingresar al sistema
    * @param pPago Dinero que se le debe pagar, incluye 5mil pesos de transoporte por dia
    */
   
   //-------------------------------------------- 
   // Metodos
   //--------------------------------------------
   
    
   
   
   
}
