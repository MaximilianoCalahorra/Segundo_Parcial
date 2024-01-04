package modelo;

///Clase Descuento:
public abstract class Descuento
{
	//Atributos:
	protected boolean activo;
	
	//Constructor:
	public Descuento(boolean activo) 
	{
		this.activo = activo;
	}

	//Getter:
	public boolean isActivo() 
	{
		return activo;
	}

	//Setter:
	public void setActivo(boolean activo)
	{
		this.activo = activo;
	}

	//To String:
	public String toString() 
	{
		return "Activo: " + activo + "\n";
	}
	
	//Calcular descuento particular:
	//CU 4:
	protected abstract double calcularDescuentoParticular(int cantidad, double precio);
	
	//Aplicar descuento:
	//CU 5:
	public double aplicarDescuento(int cantidad, double precio) 
	{
		double descuento = 0;
		if (activo) 
		{
			descuento = calcularDescuentoParticular(cantidad, precio);
		}
		return descuento;
	}
}
