package com.bootcamp.solid;

public class Dividir implements Cuentas{

    public double a;
    public double b;
    public double result = 0.0;
	
    @Override
	public void hacerCuentas() {
    	 if (b != 0) {
             result = a / b;
         }
		
	}

	public Dividir(double a, double b) {
		this.a = a;
		this.b = b;

	}
}