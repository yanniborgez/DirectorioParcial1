import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;

/*
@autor Iván Yanni Borgez Bautista
@email borgezyanni@gmail.com
@descripción directorio de contactos para primer parcial de Algorítmica y programación II
*/

public class Main {
    public static void main(String args[]){

        String nombreTemp;
        String numeroTemp;
        String dirTemp;
        String correoTemp;
        int temp;
        String catTemp = "";
        boolean salir = false;
        int opcion;

        LinkedList<EntradaDatos> agenda = new LinkedList<EntradaDatos>();

        Scanner scan = new Scanner(System.in);

        while (!salir) {
            System.out.println("=========================\n" +
                    "DIRECTORIO DE CONTACTOS\n" +
                    "=========================\n" +
                    "1) Registrar un nuevo contacto\n" +
                    "2) Consultar contactos\n" +
                    "3) Salir del programa\n");

            try {
                System.out.println("Escribe el numero de una de las opciones: ");
                opcion = scan.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n-Registro de nuevo contacto-");
                        System.out.println("Ingresa el nombre:");
                        nombreTemp = scan.next() + scan.nextLine();
                        System.out.println("Ingresa el numero telefonico:");
                        numeroTemp = scan.nextLine();
                        System.out.println("Ingresa la direccion:");
                        dirTemp = scan.nextLine();
                        System.out.println("Ingresa el correo electronico:");
                        correoTemp = scan.nextLine();
                        System.out.println("Ingresa el digito de la categoria:\n" +
                                "1) Familia\n" +
                                "2) Amigos\n" +
                                "3) Trabajo");
                        temp = scan.nextInt();

                        switch (temp){
                            case 1:
                                catTemp = "Familia";
                                break;
                            case 2:
                                catTemp = "Amigos";
                                break;
                            case 3:
                                catTemp = "Trabajo";
                                break;
                        }

                        System.out.println();

                        agenda.add(new EntradaDatos(nombreTemp,numeroTemp,dirTemp, correoTemp,catTemp));

                        break;

                    case 2:

                        Iterator<EntradaDatos> itr = agenda.iterator();

                        EntradaDatos et;
                        System.out.println("\n-Consulta de contactos-");

                        System.out.println("Los contactos guardados son: ");

                        while(itr.hasNext()){
                            et = itr.next();
                            System.out.println("\nNombre: " + et.nombre + "\nNumero telefonico: " + et.numero + "\nDireccion: " + et.direccion + "\nCorreo electronico: " + et.correo+ "\nGrupo: " + et.catTemp + "\n");
                        }

                        System.out.println();

                        break;

                    case 3:
                        System.out.println("\nHasta luego!\n");
                        salir = true;
                        break;

                    default:
                        System.out.println("\nPor favor, ingresa un numero entre 1 y 3.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nDebes insertar un numero.\n");
                scan.next();
            }
        }
    }
}
