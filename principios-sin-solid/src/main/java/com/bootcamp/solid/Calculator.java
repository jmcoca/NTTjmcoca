package com.bootcamp.solid;
public class Calculator {
	
    public void calculate(Cuentas cuenta) {
    	cuenta.hacerCuentas();    
    
    }

    public static void main(String[] args) throws Exception {

        Calculator  obj = new Calculator();
        
        Dividir dv = new Dividir(10.0,5.0);
        obj.calculate(dv);
        System.out.println("Resultado calculator division: " +  dv.result);

        Addition add= new Addition(3,9);
        obj.calculate(add);
        System.out.println("Resultado calculator suma  3 y 9: " +  add.result);
        
        
        Multiplication mult= new Multiplication(3.0,9.0);
        obj.calculate(mult);
        System.out.println("Resultado Multiplication  3 y 9: " +  mult.result);
        
        Cuadrado cuadrado= new Cuadrado(4);
        obj.calculate(cuadrado);
        System.out.println("Resultado cudarado  4: " +  cuadrado.result);
        
    }

}