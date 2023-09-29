package co.edu.uniquindio.prestamo;

public class MainMenu {

    public static void main(String[] args) {

        do {
            mostrarMenu();
            opcion=leerEntero("Ingrese la opción");
            switch (opcion) {
                case 1:
                    /*miEstudiante.setCodigo(codigo);
                     * y asi un set por cada atributo
                     * */
                    break;
                case 2:

                    break;
                default:
                    break;
            }
        }while(opcion!=3);

    }
}
