
package Ejercicio3_17;
import java.util.Scanner;

public class Main {
    
     public static void main(String[] args) {
            PerfilMedico persona = new PerfilMedico("Juan", "Lopez", 'M', 25, 10, 1999, 1.85);
		Scanner input = new Scanner(System.in);
		
		System.out.println("PACIENTE 1");
		System.out.printf("Nombre: %s %s", persona.getNombre(), persona.getApellido());
		System.out.printf("%nSexo: %c", persona.getGenero());
		System.out.println("");
		persona.edadPersona();
		System.out.println("");
		persona.frecCardMax();
		System.out.println("");
		persona.frecCardProm();
		System.out.println("");
		persona.iMC();
		
		System.out.println("\n\nINGRESE DATOS DE NUEVO PACIENTE");
		System.out.print("Nombre: ");
		String nombre = input.nextLine();
		System.out.print("Apellido: ");
		String apellido = input.nextLine();
		System.out.print("Sexo (M o F): ");
		char genero = input.next().charAt(0);
		System.out.println("Fecha de Nacimiento (DD/MM/YYYY)");
		System.out.print("Dia: ");
		int dia = input.nextInt();
		System.out.print("Mes: ");
		int mes = input.nextInt();
		System.out.print("Agno: ");
		int anio = input.nextInt();
		System.out.print("Altura (Metros): ");
		double altura = input.nextDouble();
		System.out.print("Peso (Kg): ");
		double peso = input.nextDouble();
		
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setGenero(genero);
		persona.setDia(dia);
		persona.setMes(mes);
		persona.setAnio(anio);
		persona.setAltura(altura);
		persona.setPeso(peso);
		
		System.out.println("\nPACIENTE 2");
		System.out.printf("Nombre: %s %s", persona.getNombre(), persona.getApellido());
		System.out.printf("%nSexo: %c", persona.getGenero());
		System.out.println("");
		persona.edadPersona();
		System.out.println("");
		persona.frecCardMax();
		System.out.println("");
		persona.frecCardProm();
		System.out.println("");
		persona.iMC();
		
		
	}//Fin de método main

}//Fin de declaracion de clase
