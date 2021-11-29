
package ProgEmpleado;
import java.util.Scanner;
 
public class Main
{
    // Método main inicia y finaliza la ejecución de la aplicación
    public static void main( String args[] )
    {
        // Variables receptoras de valores introducidos por el usuario del programa
        String nombre; 
        String apellido; 
        double salario; 
       
        // Instacimiento de dos objetos con valores iniciales
        Empleado empleado1 = new Empleado( "Juan" , "Perez" , 800 );
        Empleado empleado2 = new Empleado( "Luis" , "Losa" , -900 );
       
        // Solicitud y obtención de los del empleado1
        // Crear un objeto Scanner que admita la entrada de valores de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
       
        System.out.print( "\nSolicitud y recepción de los datos del empleado1" );
       
        
        System.out.print( "\nEscriba su nombre: " );
        nombre = entrada.nextLine();
        empleado1.establecerNombre( nombre );
       
       
        System.out.print( "\nEscriba su apellido: " );
        apellido = entrada.nextLine();
        empleado1.establecerApellido( apellido );
       
      
        System.out.print( "\nEscriba su salario mensual: " );
        salario = entrada.nextDouble();
        empleado1.establecerSalarioMensual( salario );
       
        // Muestra el resumen del empleado1
        System.out.print( "\nResumen para empleado1: " );
        empleado1.mostrarResumen();
       
        System.out.println( "\n\nSolicitud y recepción de los datos del empleado2" );
       
        // Nombre
        System.out.print( "\nEscriba su nombre: " );
        nombre = entrada.nextLine();
        empleado2.establecerNombre( nombre );
       
        // Apellido
        System.out.print( "\nEscriba su apellido: " );
        apellido = entrada.nextLine();
        empleado2.establecerApellido( apellido );
       
        // Salario
        System.out.print( "\nEscriba su salario mensual: " );
        salario = entrada.nextDouble();
        empleado2.establecerSalarioMensual( salario );
       
        // Muestra el resumen del empleado1
        System.out.print( "\nResumen para empleado2: " );
        empleado2.mostrarResumen();
       
        System.out.println();
    } 
}