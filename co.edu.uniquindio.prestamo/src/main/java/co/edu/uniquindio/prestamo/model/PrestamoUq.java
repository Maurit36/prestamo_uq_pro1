package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {

    private String nombre;

    List<Cliente> listaClientes = new ArrayList<>();
    List<Prestamo> listaPrestamos = new ArrayList<>();
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Objeto> listaObjetos = new ArrayList<>();

    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    /**
     * Metodo para crear un cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearCliente(String nombre, String apellido, String cedula, int edad){
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCedula(cedula);
        cliente.setEdad(edad);
        getListaClientes().add(cliente);

        return true;
    }

    /**
     * Metodo para obtener la lista de todos los clientes
     * @return List<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }

    public void eliminarCliente(String cedula) {
        int tamanoLista = getListaClientes().size();
        for (int i=0; i < tamanoLista; i++){
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaClientes().remove(i);
                break;
            }
        }
    }
    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}