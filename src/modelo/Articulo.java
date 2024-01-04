package modelo;

///Clase Articulo:
public class Articulo
{
	//Atributos:
	private int id;
	private String detalle;
	private double precio;
	private Descuento descuento;
	
	//Constructor:
	public Articulo(int id, String detalle, double precio, Descuento descuento) 
	{
		this.id = id;
		this.detalle = detalle;
		this.precio = precio;
		this.descuento = descuento;
	}

	//Getters:
	public int getId()
	{
		return id;
	}
	public String getDetalle() 
	{
		return detalle;
	}
	public double getPrecio() 
	{
		return precio;
	}
	public Descuento getDescuento() 
	{
		return descuento;
	}

	//Setters:
	public void setId(int id)
	{
		this.id = id;
	}
	public void setDetalle(String detalle) 
	{
		this.detalle = detalle;
	}
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
	public void setDescuento(Descuento descuento)
	{
		this.descuento = descuento;
	}
	
	//Equals:
	public boolean equals(Articulo articulo) 
	{
		return this.id == articulo.id;
	}
	
	//To String:
	public String toString() 
	{
		return "Articulo:\n"
			 + "ID: #" + id + "\n"
			 + "Detalle: " + detalle + "\n"
			 + "Precio: " + precio + "\n"
			 + "Descuento:\n"
			 + descuento.toString(); 
	}
}
