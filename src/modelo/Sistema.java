package modelo;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

///Clase Sistema:
public class Sistema
{
	//Atributos:
	private List<Articulo> articulos;
	private List<Compra> compras;
	
	//Constructor:
	public Sistema() 
	{
		this.articulos = new ArrayList<Articulo>();
		this.compras = new ArrayList<Compra>();
	}

	//Getters:
	public List<Articulo> getArticulos() 
	{
		return articulos;
	}
	public List<Compra> getCompras()
	{
		return compras;
	}
	
	//To String:
	public String toString()
	{
		String sistema = "Lista de articulos:\n";
		for (int i = 0; i < articulos.size(); i++) 
		{
			sistema += articulos.get(i).toString();
		}
		sistema += "Lista de compras:\n";
		for (int i = 0; i < compras.size(); i++) 
		{
			sistema += compras.get(i).toString();
		}
		return sistema;
	}
	
	//Traer:
	//CU 1:
	public Articulo traerArticulo(String detalle) 
	{
		Articulo articuloAuxiliar = null;
		Articulo articuloBuscado = null;
		int i = 0;
		while (i < articulos.size() && articuloBuscado == null) 
		{
			articuloAuxiliar = articulos.get(i);
			if (articuloAuxiliar.getDetalle().equalsIgnoreCase(detalle)) 
			{
				articuloBuscado = articuloAuxiliar;
			}
			i++;
		}
		return articuloBuscado;
	}
	
	//CU 7:
	public List<Compra> traerCompras(LocalDateTime desde, LocalDateTime hasta)
	{
		List<Compra> comprasQueCumplen = new ArrayList<Compra>();
		Compra compraAuxiliar = null;
		for (int i = 0; i < compras.size(); i++) 
		{
			compraAuxiliar = compras.get(i);
			if (!(compraAuxiliar.getFechaHora().isBefore(desde)) &&
				!(compraAuxiliar.getFechaHora().isAfter(hasta))) 
			{
				comprasQueCumplen.add(compraAuxiliar);
			}
		}
		return comprasQueCumplen;
	}
	
	//CU 8:
	public List<Compra> traerComprasDescuentoPorCantidad(LocalDateTime desde, LocalDateTime hasta)
	{
		List<Compra> comprasQueCumplen = traerCompras(desde, hasta);
		Compra compraAuxiliar = null;
		for (int i = 0; i < comprasQueCumplen.size(); i++) 
		{
			compraAuxiliar = comprasQueCumplen.get(i);
			if (!(compraAuxiliar.getArticulo().getDescuento() instanceof DescuentoPorCantidad)) 
			{
				comprasQueCumplen.remove(i);
			}
		}
		return comprasQueCumplen;
	}
	
	//CU 9:
	public List<Articulo> traerArticulosConDescuento(boolean activo)
	{
		List<Articulo> articulosQueCumplen = new ArrayList<Articulo>();
		Articulo articuloAuxiliar = null;
		for (int i = 0; i < articulos.size(); i++) 
		{
			articuloAuxiliar = articulos.get(i);
			if (articuloAuxiliar.getDescuento().isActivo() == activo) 
			{
				articulosQueCumplen.add(articuloAuxiliar);
			}
		}
		return articulosQueCumplen;
	}
	
	//Agregar:
	//CU 2:
	public boolean agregarArticulo(String detalle, double precio, Descuento descuento) throws Exception
	{
		if (traerArticulo(detalle) != null) 
		{
			throw new Exception("Error! Ya existe un articulo con el detalle " + detalle + " en la lista de articulos.\n");
		}
		int id = 1;
		if (articulos.size() > 0) 
		{
			int tamanio = articulos.size();
			id = articulos.get(tamanio - 1).getId() + 1;
		}
		return articulos.add(new Articulo(id, detalle, precio, descuento));
	}
	
	//CU 3:
	public boolean agregarCompra(int cantidad, Articulo articulo, LocalDateTime fechaHora) throws Exception
	{
		return compras.add(new Compra(cantidad, articulo, fechaHora));
	}
}
