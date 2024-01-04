package modelo;

///Clase DescuentoPorCantidad:
public class DescuentoPorCantidad extends Descuento
{
	//Atributos:
	private int cadaNUnidades;
	private int unidadesGratis;
	
	//Constructor:
	public DescuentoPorCantidad(boolean activo, int cadaNUnidades, int unidadesGratis) 
	{
		super(activo);
		this.cadaNUnidades = cadaNUnidades;
		this.unidadesGratis = unidadesGratis;
	}

	//Getters:
	public int getCadaNUnidades()
	{
		return cadaNUnidades;
	}
	public int getUnidadesGratis() 
	{
		return unidadesGratis;
	}

	//Setters:
	public void setCadaNUnidades(int cadaNUnidades) 
	{
		this.cadaNUnidades = cadaNUnidades;
	}
	public void setUnidadesGratis(int unidadesGratis)
	{
		this.unidadesGratis = unidadesGratis;
	}
	
	//To String:
	public String toString() 
	{
		return "Descuento por cantidad:\n"
			 + super.toString()
			 + "Cada: " + cadaNUnidades + " unidad/es\n"
			 + "Unidades gratis: " + unidadesGratis + "\n";
	}
	
	//Calcular descuento particular:
	//CU 4:
	protected double calcularDescuentoParticular(int cantidad, double precio) 
	{
		int unidadesARegalar = (cantidad / cadaNUnidades) * unidadesGratis;
		return unidadesARegalar * precio;
	}
}
