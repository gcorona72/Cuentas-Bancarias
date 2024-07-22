import java.util.ArrayList;
import java.util.Scanner;

//Preguntar sobre mostrar el dinero en los arrays de gastos e ingresos

public class Main {
    public static void main(String[] args) {

        boolean valido = true;
        String nombre;
        int edad;
        String dni;

        System.out.println("Bienvenido,");

        //Este bucle se reinicia cada vez que el usuario introduce un DNI erroneo

        while (valido){

            System.out.println("Rellene los siguientes apartados para acceder a su cuenta.");

            System.out.print("Introduzca su nombre: ");

            Scanner teclado1 = new Scanner(System.in);

            nombre = teclado1.nextLine();



            System.out.print("Introduzca su edad: ");

            Scanner teclado2 = new Scanner(System.in);

            edad = teclado2.nextInt();



            System.out.print("Introduzca su DNI: ");

            Scanner teclado3 = new Scanner(System.in);

            dni = teclado3.nextLine();

            Usuario usuario1 = new Usuario(nombre,edad,dni);


            if (usuario1.verificar() == false){

                System.out.println("El DNI introducido no es valido, por favor intentelo de nuevo" + "\n");

            }else{

                Cuenta cuenta1 = new Cuenta(usuario1,1000,new ArrayList<>(),new ArrayList<>());

                System.out.println("Se ha verificado su identidad");

                System.out.println("Bienvenido: " + usuario1.getNombre() + " de " + usuario1.getEdad() + " años con DNI " + usuario1.getDni() + "\n");



                boolean salir = true;

                //Este bucle se reinicia hasta que el usuario decida salir en cuyo caso el bucle anterior tambien terminara.

                while (salir) {

                    System.out.println("¿Qué operación desea realizar?" + "\n");

                    System.out.println("1 Añadir un nuevo gasto" + "\n" +
                            "2 Añadir un nuevo ingreso" + "\n" +
                            "3 Mostrar mis Gastos" + "\n" +
                            "4 Mostrar mis Ingresos" + "\n" +
                            "5 Mostrar mi Saldo" + "\n" +
                            "0 Salir" + "\n"
                    );

                    Scanner teclado4 = new Scanner(System.in);

                    int opcion = teclado4.nextInt();

                    switch (opcion) {

                        case 1:

                            //Sumar gasto

                            System.out.println("¿Cual es el importe del gasto? ");

                            Scanner teclado5 = new Scanner(System.in);

                            int gasto = teclado5.nextInt();

                            cuenta1.verificarGasto(gasto);
                            break;

                        case 2:

                            //Sumar ingreso

                            System.out.println("¿Cual es el importe del ingreso? ");

                            Scanner teclado6 = new Scanner(System.in);

                            int ingreso = teclado6.nextInt();

                            cuenta1.verificarIngreso(ingreso);

                            break;


                        case 3:

                            //Obtienes una lista de todos los gastos realizados

                            cuenta1.getGastos();

                            break;

                        case 4:

                            //Obtienes una lista de todos los ingresos recibidos

                            cuenta1.getIngresos();
                            break;

                        case 5:

                            //Saldo de la cuenta

                            System.out.println("Su saldo es de: " + cuenta1.getSaldo());
                            break;

                        case 0:

                            //Cancela los dos bucles

                            valido = false;
                            salir = false;

                            break;
                    }
                }
            }
        }
    }
}