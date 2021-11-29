
package Ejercicio3_17;

import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
	
	private String nombre;
	private String apellido;
	private char genero;
	private int dia;
	private int mes;
	private int anio;
	private double altura;
	private double peso;

    public PerfilMedico(String nombre, String apellido, char genero, int dia, int mes, int anio, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
    }
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String Apellido) {
		this.apellido = apellido;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void edadPersona(){
		
		LocalDate fechaNac = LocalDate.of(anio, mes, dia);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("Edad: %d", periodo.getYears());
		
	}
	
	public void frecCardMax(){
		
		LocalDate fechaNac = LocalDate.of(anio, mes, dia);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("Frecuencia Cardiaca Maxima: %d", 220 - periodo.getYears());
		
	}
	
	public void frecCardProm(){
		
		LocalDate fechaNac = LocalDate.of(anio, mes, dia);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("Rango de Frecuencia Cardiaca Promedio: %.0f y %.0f",
																				(220 - periodo.getYears())*0.5, 
																				(220 - periodo.getYears())*0.85);
		
	}
	
	public void iMC(){
		
		double imc;
		
		imc = peso/(altura*altura);
		
		if(imc < 18.5){
			System.out.printf("IMC es: %.2f **BAJO DE PESO**", imc);
		}
		else if(imc >= 18.5 && imc <= 24.9){
			System.out.printf("IMC es: %.2f **NORMAL**", imc);
		}
		else if(imc >= 25 && imc <= 29.9){
			System.out.printf("IMC es: %.2f **SOBREPESO**", imc);
		}
		else{
			System.out.printf("IMC es: %.2f **OBESIDAD**", imc);
		}
		
	}
	
}//Fin de declaracion de clase
