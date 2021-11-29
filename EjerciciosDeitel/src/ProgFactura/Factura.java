
package ProgFactura;

public class Factura {
private String NumeroPieza;
private String DescripcionPieza;
private int Cantidad;
private double PrecioPorArticulo;

//constructor con cuatro argumentos
public Factura( String pieza, String descripcion, int cantidad,
double precio )
{
NumeroPieza = pieza;
DescripcionPieza = descripcion;
setCantidad( cantidad ); // valida y almacena la cantidad
setPrecioPorArticulo( precio ); // valida y almacena el precio por artículo
} // fin del constructor de Factura con cuatro argumentos
// establece el número de pieza
public void setNumeroPieza( String pieza )
{
NumeroPieza = pieza;
} // fin del método establecerNumeroPieza
//obtener número de pieza
public String getNumeroPieza()
{
return NumeroPieza;
} // fin del método obtenerNumeroPieza
// establece la descripción
public void setDescripcionPieza( String descripcion )
{
DescripcionPieza = descripcion;
} // fin del método establecerDescripcionPieza
// obtiene la descripción
public String getDescripcionPieza()
{
return DescripcionPieza;
} // fin del método obtenerDescripcionPieza
// establece la cantidad
public void setCantidad( int cantidad )
{
Cantidad = ( cantidad < 0 ) ? 0 : cantidad; // cantidad no puede ser negativa
} // fin del método establecerCantidad
// obtener cantidad
public int getCantidad()
{
return Cantidad;
} // fin del método obtenerCantidad
// establece el precio por artículo
public void setPrecioPorArticulo( double precio )
{
PrecioPorArticulo = ( precio < 0.0 ) ? 0.0 : precio; // valida el precio
} // fin del método establecerPrecioPorArticulo
// obtiene el precio por artículo
public double getPrecioPorArticulo()
{
return PrecioPorArticulo;
} // fin del método obtenerPrecioPorArticulo
//devuelve representación String de un objeto Factura
public String toString()
{
return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
"Factura", "Numero de Pieza", getNumeroPieza(), getDescripcionPieza(),
"Cantidad", getCantidad(), "Precio por Articulo", getPrecioPorArticulo() );
} // fin del método toString
// método requerido para realizar el contrato con la interfaz PorPagar
public double obtenerMontoPago()
{
return getCantidad() * getPrecioPorArticulo(); // calcula el costo total
} // fin del método obtenerMontoPago
}
