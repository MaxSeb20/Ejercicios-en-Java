
package ProgEmpleado;
public class Empleado {
    //Atributos
    private String nombre;
    private String apellido; 
    private double salarioMensual; 
   
    // Constructor para inicializar las vars. de instancia
    public Empleado( String pNombre , String pApellido , double pSalarioMensual )
    {
        // Asignación de los valores de los parámetros a las variables de instancia
        nombre = pNombre;
        apellido = pApellido;
        salarioMensual = pSalarioMensual;
     
    } // Fin del constructor
    
        //Métodos
    
    // Método establecer para el nombre del empleado
    public void establecerNombre( String pNombre )
    {
        nombre = pNombre;
    }
   
    // Método para obtener el nombre del empleado
    public String obtenerNombre()
    {
        return nombre;
    }
   
    // Método para establecer el epellido del empleado
    public void establecerApellido( String pApellido )
    {
        apellido = pApellido;
    }
   
    // Método para obtener el apellido del empleado
    public String obtenerApellido()
    {
        return apellido;
    }
   
    // Método para establecer el sueldo del empleado
    public void establecerSalarioMensual( double salario )
    {
        salarioMensual = salario;
    }
   
    // Método para obtener el salario mensual de un empleado
    public double obtenerSalarioMensual()
    {
        return salarioMensual;
    }
   
    // Método para calcular el salario anual de un empleado
    public double obtenerSalarioAnual()
    {
        return obtenerSalarioMensual() * 12;
    }
   
    // Método para incrementar el 10% sobre el sueldo anual del empleado
    public double obtenerAumento()
    {
        return obtenerSalarioAnual() * 1.10;
    }
   
    // Método que muestra resumen de la información relativa al empleado
    public void mostrarResumen()
    {
        System.out.printf( "\nSu nombre es: %s" , obtenerNombre() );
        System.out.printf( "\nSu apellido es: %s" , obtenerApellido() );
        System.out.printf( "\nSu salario mensual es: %f" , obtenerSalarioMensual() );
        System.out.printf( "\nSu salario anual sin incremento es: %f" , obtenerSalarioAnual() );
        System.out.printf( "\nSu salario anual con incremento es: %f" , obtenerAumento() );
    } 
} 

