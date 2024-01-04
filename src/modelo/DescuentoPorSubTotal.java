package modelo;

///Clase DescuentoPorSubTotal:
public class DescuentoPorSubTotal extends Descuento
{
	//Atributos:
	private int aplicarDesdeValor;
	private int porcentajeDescuento;
	
	//Constructor:
	public DescuentoPorSubTotal(boolean activo, int aplicarDesdeValor, int porcentajeDescuento) 
	{
		super(activo);
		this.aplicarDesdeValor = aplicarDesdeValor;
		this.porcentajeDescuento = porcentajeDescuento;
	}

	//Getters:
	public int getAplicarDesdeValor()
	{
		return aplicarDesdeValor;
	}
	public int getPorcentajeDescuento()
	{
		return porcentajeDescuento;
	}

	//Setters:
	public void setAplicarDesdeValor(int aplicarDesdeValor)
	{
		this.aplicarDesdeValor = aplicarDesdeValor;
	}
	public void setPorcentajeDescuento(int porcentajeDescuento)
	{
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	//To String:
	public String toString() 
	{
		return "Descuento por subtotal:\n"
			 + super.toString()
			 + "Aplicar desde el valor: $" + aplicarDesdeValor + "\n"
			 + "Porcentaje de descuento: " + porcentajeDescuento + "%\n";
	}
	
	//Calcular descuento particular:
	//CU 4:
	protected double calcularDescuentoParticular(int cantidad, double precio) 
	{
		double descuento = 0;
		double totalAPagar = cantidad * precio;
		if (totalAPagar >= aplicarDesdeValor) 
		{
			descuento = totalAPagar * porcentajeDescuento / 100;
		}
		return descuento;
	}
}
