package com.bootcamp.solid;

public class Multiplication implements Cuentas{
    public double a;
    public double b;
    public double result = 0.0;

    public Multiplication(double a , double b) {
        this.a = a;
        this.b = b;
    }

	@Override
	public void hacerCuentas() {
		this.result= a*b;
		
	}
}