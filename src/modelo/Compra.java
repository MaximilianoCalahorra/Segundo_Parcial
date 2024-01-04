package modelo;

import java.time.LocalDateTime;

///Clase Compra:
public class Compra
{
	//Atributos:
	private int cantidad;
	private Articulo articulo;
	private LocalDateTime fechaHora;
	
	//Constructor:
	public Compra(int cantidad, Articulo articulo, LocalDateTime fechaHora) throws Exception
	{
		setCantidad(cantidad);
		this.articulo = articulo;
		this.fechaHora = fechaHora;
	}

	//Getters:
	public int getCantidad() 
	{
		return cantidad;
	}
	public Articulo getArticulo()
	{
		return articulo;
	}
	public LocalDateTime getFechaHora() 
	{
		return fechaHora;
	}

	//Setters:
	public void setCantidad(int cantidad) throws Exception
	{
		if (cantidad <= 0) 
		{
			throw new Exception("Error! La cantidad debe ser mayor a 0.\n");
		}
		this.cantidad = cantidad;
	}
	public void setArticulo(Articulo articulo) 
	{
		this.articulo = articulo;
	}
	public void setFechaHora(LocalDateTime fechaHora)
	{
		this.fechaHora = fechaHora;
	}
	
	//To String:
	public String toString()
	{
		return "Compra:\n"
			 + "Cantidad: " + cantidad + "\n"
			 + articulo.toString()
			 + "Fecha y hora: " + fechaHora + "\n";
	}
	
	//Precio total:
	//CU 6:
	public double precioTotal() 
	{
		double precioArticulo = articulo.getPrecio();
		double descuento = articulo.getDescuento().aplicarDescuento(cantidad, precioArticulo);
		double totalSinDescuento = cantidad * precioArticulo;
		return totalSinDescuento - descuento;
	}
}
	
