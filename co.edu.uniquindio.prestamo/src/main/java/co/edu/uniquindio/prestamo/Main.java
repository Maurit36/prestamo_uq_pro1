package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrestamoUq prestamoUq = inializarDatosPrueba();

        Scanner scanner = new Scanner(System.in);

        //CRUD

        //Create
        crearCliente("juan", "arias", "1094", 24, prestamoUq);
        crearCliente("ana", "alzate", "1095", 35, prestamoUq);
        crearCliente("maria", "perez", "1096", 22, prestamoUq);
        crearCliente("pedro", "arias", "1097", 24, prestamoUq);

        //Read
        mostrarInformacionCliente(prestamoUq);

        //Update
        actualizarCliente(prestamoUq, "1095");
        System.out.println("-----> Informacion luego de actualizar");
        mostrarInformacionCliente(prestamoUq);

        //Delete
        eliminarCliente(prestamoUq, "1094");
        System.out.println("-----> Informacion luego de eliminar");
        mostrarInformacionCliente(prestamoUq);
    }

    private static PrestamoUq inializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo Rapido");

        return prestamoUq;
    }

    private static void crearCliente(String nombre,
                                     String apellido,
                                     String cedula,
                                     int edad,
                                     PrestamoUq prestamoUq) {
        prestamoUq.crearCliente(nombre, apellido, cedula, edad);
    }

    private static void eliminarCliente(PrestamoUq prestamoUq, String cedula) {
        prestamoUq.eliminarCliente(cedula);
    }

    private static void actualizarCliente(PrestamoUq prestamoUq, String cedula) {
        prestamoUq.actualizarCliente(cedula);
    }

    private static void mostrarInformacionCliente(PrestamoUq prestamoUq) {
        List<Cliente> listaClientes = prestamoUq.obtenerClientes();
        int tamanoLista = listaClientes.size();
        for(int i=0; i < tamanoLista; i++){
            Cliente cliente = listaClientes.get(i);
            System.out.println(cliente.toString());
        }
    }



            // Pide al usuario que ingrese un valor
            System.out.print("Ingresa un número: ");

            // Lee el número ingresado por el usuario
            int numero = scanner.nextInt();

            // Muestra el número ingresado
            System.out.println("Has ingresado el número: " + numero);

            // Cierra el Scanner cuando hayas terminado de usarlo
            scanner.close();
    }
    }
}