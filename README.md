# Descripción del programa
**Consiste en mi resolución del segundo parcial de la materia de Orientación a Objetos I de la carrera de Sistemas de la UNLa**.

**Está desarrollado completamente en Java mediante el paradigma de la POO, aplicando conceptos tales como clases, atributos, métodos, polimorfismo, reutilización de código,
manejo de excepciones y de fechas y horas, herencia y clases y métodos abstractos**.

*Lamentablemente no cuento con las consignas detalladas de ese parcial, pero a partir de mi resolución voy a hacer una reconstrucción del modelo provisto, los casos de uso y test solicitados.*

**Modelo:**
![modelo](https://github.com/MaximilianoCalahorra/Segundo_Parcial/assets/152804837/ab959fad-df03-4d31-bb29-c18ea8e66fb7)

**Casos de uso:**
- #1: + traerArticulo(String detalle): Articulo
- #2: + agregarArticulo(String detalle, double precio, Descuento descuento): boolean
  - Lanza una excepción si ya existe un artículo con ese detalle.
  - ID del artículo autoincrementable según altas y bajas.
- #3: + agregarCompra(int cantidad, Articulo articulo, LocalDateTime fechaHora): boolean
  - Lanza una excepción en caso de que la cantidad de la compra sea menor o igual a 0.
- #4: ~ calcularDescuentoParticular(int cantidad, double precio): double
  - Implementación obligatoria en cada clase hija por ser un método abstracto.
- #5: + aplicarDescuento(int cantidad, double precio): double
- #6: + precioTotal(): double
- #7: + traerCompras(LocalDateTime desde, LocalDateTime hasta): List<Compra>
- #8: + traerComprasDescuentoPorCantidad(LocalDateTime desde, LocalDateTime hasta): List<Compra>
- #9: + traerArticulosConDescuento(boolean activo): List<Articulo>

**Test:**
- #1: Agregar los siguientes artículos e imprimir la lista:
  - Articulo = \[detalle = "art1", precio = 100.0, descuento = DescuentoPorCantidad =\[activo = true, cadaNUnidades = 3, unidadesGratis = 1]]
  - Articulo = \[detalle = "art2", precio = 150.0, descuento = DescuentoPorCantidad =\[activo = true, cadaNUnidades = 5, unidadesGratis = 2]]
  - Articulo = \[detalle = "art3", precio = 500.0, descuento = DescuentoPorSubTotal =\[activo = true, aplicaDesdeValor = 1000, porcentajeDescuento = 50]]
  - Articulo = \[detalle = "art4", precio = 200.0, descuento = DescuentoPorSubTotal =\[activo = false, aplicaDesdeValor = 500, porcentajeDescuento = 10]]
- #2: Intentar agregar el siguiente artículo:
  - Articulo = \[detalle = "art2", precio = 150.0, descuento = DescuentoPorCantidad =\[activo = true, cadaNUnidades = 5, unidadesGratis = 2]]
- #3: Agregar las siguientes compras e imprimir la lista:
  - Compra = \[cantidad = 6, Articulo = \[detalle = "art1", precio = 100.0, descuento = DescuentoPorCantidad =\[activo = true, cadaNUnidades = 3, unidadesGratis = 1]], fechaHora = 2023-10-20T09:00]
  - Compra = \[cantidad = 5, Articulo = \[detalle = "art2", precio = 150.0, descuento = DescuentoPorCantidad =\[activo = true, cadaNUnidades = 5, unidadesGratis = 2]], fechaHora = 2023-10-20T09:30]
  - Compra = \[cantidad = 10, Articulo = \[detalle = "art2", precio = 150.0, descuento = DescuentoPorCantidad =\[activo = true, cadaNUnidades = 5, unidadesGratis = 2]], fechaHora = 2023-10-20T10:00]
  - Compra = \[cantidad = 3, Articulo = \[detalle = "art3", precio = 500.0, descuento = DescuentoPorSubTotal =\[activo = true, aplicaDesdeValor = 1000, porcentajeDescuento = 50]], fechaHora = 2023-10-20T10:30]
  - Compra = \[cantidad = 4, Articulo = \[detalle = "art4", precio = 200.0, descuento = DescuentoPorSubTotal =\[activo = false, aplicaDesdeValor = 500, porcentajeDescuento = 10]], fechaHora = 2023-10-20T11:00]
- #4: Intentar agregar la siguiente compra:
  - Compra = \[cantidad = 0, Articulo = \[detalle = "art3", precio = 500.0, descuento = DescuentoPorSubTotal =\[activo = true, aplicaDesdeValor = 1000, porcentajeDescuento = 50]], fechaHora = 2023-10-20T10:30]
- #5: Imprimir el precio total de las compras con índice 2, 3 y 4 de la lista de compras.
- #6: Imprimir las compras entre las fechas 2023-10-20T09:15 y 2023-10-20T10:30.
- #7: Imprimir las compras entre las fechas 2023-10-20T09:15 y 2023-10-20T10:30 que tengan un artículo con descuento del tipo descuento por cantidad.
- #8: Imprimir los artículos con descuento activo.

*Gracias por interesarte en visitar este repositorio y leer acerca de él*.

¡Saludos!

Maximiliano Calahorra.
 



