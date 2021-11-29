
package ProgFactura;

public class Main {

    public static void main(String[] args) {
        
        // crea arreglo PorPagar con cuatro elementos
        Factura objetosPorPagar[] = new Factura[ 4 ];
// llena el arreglo con objetos que implementan la interfaz PorPagar
objetosPorPagar[ 0 ] = new Factura( "01234", "Clavos", 4, 1.00 );
objetosPorPagar[ 1 ] = new Factura( "54289", "Martillo", 4, 4.00 );
objetosPorPagar[ 2 ] = new Factura( "12345", "Carretilla", 3, 100.00 );
objetosPorPagar[ 3 ] = new Factura( "56751", "Pinturas Acrilicas", 5,
45.00 );
System.out.println("Facturas Ferreteria :\n" );

for ( Factura porPagarActual : objetosPorPagar )
{
System.out.printf( "%s \n%s: $%,.2f\n\n", porPagarActual.toString(),
"Total a Pagar", porPagarActual.obtenerMontoPago() );
} // fin de for
} // fin de main
    }
    
