package com.bootcamp.solid;

public class Cuadrado implements Cuentas{
	public double a;
	public double result;
	
	public Cuadrado(double a) {
		this.a=a;
	}
	
	@Override
	public void hacerCuentas() {
		result=a*a;
		
	}
	

}
