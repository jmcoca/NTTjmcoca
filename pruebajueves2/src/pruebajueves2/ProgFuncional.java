package pruebajueves2;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProgFuncional {

	public static void main(String[] args) {
			      List<Producto> shopping = List.of(
			            new Producto("Clothes", new BigDecimal("15.90"), Impuesto.NORMAL),
			            new Producto("Bread", new BigDecimal("1.5"), Impuesto.SUPERREDUCED),
			            new Producto("Meat", new BigDecimal("13.99"), Impuesto.REDUCED),
			            new Producto("Cheese", new BigDecimal("3.59"), Impuesto.SUPERREDUCED),
			            new Producto("Coke", new BigDecimal("1.89"), Impuesto.REDUCED),
			            new Producto("Whiskey", new BigDecimal("19.90"), Impuesto.NORMAL));
			      
			      
			   
			
	Object procesarCesta=shopping
			.stream()
			.filter(a-> a.name.startsWith("C"))
			.map(b->b.name)
			.sorted()
			.collect(Collectors.toList());
	

	
	System.out.println("Productos comienzan por C ordenados:  "+procesarCesta);
	
	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("Expresiones Lambda5");
	
	Object calcularTotal=shopping
			.stream()
			.map(x->x.price.add(x.price.multiply( BigDecimal.valueOf( x.impuesto.getPercent()*0.01 ))))
			.reduce(BigDecimal.ZERO, BigDecimal::add); 
			//.collect(Collectors.toList());
			
			
			
	
	
	System.out.println("Resultado "+ calcularTotal);
	
}
}

