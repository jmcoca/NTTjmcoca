package pruebajueves;

import java.util.List;
import java.util.stream.Collectors;

public class Imperative {

	public static void main(String[] args) {
		
		
		
		List<Integer> conjuntoNumeros= List.of(2,4,6,7,8,10,12,16,18,20,22);
		
		int i=0;
		for (int numero: conjuntoNumeros) {
			if (numero>10) {
				i++;
			}
		}
		
		System.out.println("Programacion declarativa");
		System.out.println(i);
		
		
		
		System.out.println("--------------Programacion-----Funcional--------------------------------------------------------------");
		System.out.println("Expresiones Lambda");
		
		INumeros variable=lista->{
			
			lista.forEach(dato->System.out.print(" Datos: "+dato));

			System.out.println("");
		};
		
		variable.buscar(conjuntoNumeros);
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Expresiones Lambda2");
		
		System.out.println("cuenta" +conjuntoNumeros.stream().filter(d-> d>10).count());
		
		
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Expresiones Lambda3");
		
		
		INumeros2 dato2=(lista)->conjuntoNumeros.stream().filter(n-> n>10 ).count();
		
		System.out.println("datos : "+ dato2.buscar(conjuntoNumeros));
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Expresiones Lambda3");
		
		List<String> conjuntoColores= List.of("Blanco","Verde","Rojo","Azul","Amarillo","Negro","Gris");
		
		Object procesarColores=conjuntoColores
				.stream()
				.peek(System.out::println)
				.filter(a->!a.equals("Negro"))
				.map(b->b.toString().toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("Colores:  "+procesarColores);
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Expresiones Lambda4");
		
		IColores filtrarColores=(color)->{return color.stream()
				.peek(System.out::println)
				.filter(a->!a.equals("Amarillo"))
				.map(b->b.toString().toUpperCase())
				.collect(Collectors.toList());
		};
		
		System.out.println("usando interfaz" + filtrarColores.procesar(conjuntoColores));
		
	}

	

}
