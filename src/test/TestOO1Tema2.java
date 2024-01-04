package test;

import modelo.Sistema;
import modelo.DescuentoPorCantidad;
import modelo.DescuentoPorSubTotal;
import java.time.LocalDateTime;

public class TestOO1Tema2 
{
	public static void main(String[] args)
	{
		///Sistema:
		Sistema sistema = new Sistema();
		
		///Test 1:
		System.out.println("Test 1:");
		try 
		{
			sistema.agregarArticulo("art1", 100.0, new DescuentoPorCantidad(true, 3, 1));
			sistema.agregarArticulo("art2", 150.0, new DescuentoPorCantidad(true, 5, 2));
			sistema.agregarArticulo("art3", 500.0, new DescuentoPorSubTotal(true, 1000, 50));
			sistema.agregarArticulo("art4", 200.0, new DescuentoPorSubTotal(false, 500, 10));
			System.out.println("Lista de articulos:");
			System.out.println(sistema.getArticulos());
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		///Test 2:
		System.out.println("\nTest 2:");
		try 
		{
			sistema.agregarArticulo("art2", 150.0, new DescuentoPorCantidad(true, 5, 2)); //Excepci�n!
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		///Test 3:
		System.out.println("Test 3:");
		try 
		{
			sistema.agregarCompra(6, sistema.traerArticulo("art1"), LocalDateTime.of(2023, 10, 20, 9, 0));
			sistema.agregarCompra(5, sistema.traerArticulo("art2"), LocalDateTime.of(2023, 10, 20, 9, 30));
			sistema.agregarCompra(10, sistema.traerArticulo("art2"), LocalDateTime.of(2023, 10, 20, 10, 0));
			sistema.agregarCompra(3, sistema.traerArticulo("art3"), LocalDateTime.of(2023, 10, 20, 10, 30));
			sistema.agregarCompra(4, sistema.traerArticulo("art4"), LocalDateTime.of(2023, 10, 20, 11, 0));
			System.out.println("Lista de compras:");
			System.out.println(sistema.getCompras());
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		///Test 4:
		System.out.println("\nTest 4:");
		try
		{
			sistema.agregarCompra(0, sistema.traerArticulo("art3"), LocalDateTime.of(2023, 10, 20, 10, 30)); //Excepci�n!
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		///Test 5:
		System.out.println("Test 5:");
		System.out.println("Precio total de la compra con índice #2: $" + sistema.getCompras().get(2).precioTotal());
		System.out.println("Precio total de la compra con índice #3: $" + sistema.getCompras().get(3).precioTotal());
		System.out.println("Precio total de la compra con índice #4: $" + sistema.getCompras().get(4).precioTotal());
	
		///Test 6:
		System.out.println("\nTest 6:");
		System.out.println("Compras entre el 20/10/2023 a las 9:15hs y el 20/10/2023 a las 10:30hs :");
		System.out.println(sistema.traerCompras(LocalDateTime.of(2023, 10, 20, 9, 15), LocalDateTime.of(2023, 10, 20, 10, 30)));
	
		///Test 7:
		System.out.println("\nTest 7:");
		System.out.println("Compras entre el 20/10/2023 a las 9:15hs y el 20/10/2023 a las 10:30hs que tengan un articulo con descuento del tipo descuento por cantidad:");
		System.out.println(sistema.traerComprasDescuentoPorCantidad(LocalDateTime.of(2023, 10, 20, 9, 15), LocalDateTime.of(2023, 10, 20, 10, 30)));
	
		///Test 8:
		System.out.println("\nTest 8:");
		System.out.println("Articulos con descuentos activos:");
		System.out.println(sistema.traerArticulosConDescuento(true));
	}
}
