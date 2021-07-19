package com.calculadora.uno;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calculo = new Calculator();
		
		calculo.setOperandoOne(10.5);
		calculo.setOperation('+');
		calculo.setOperandoTwo(5.2);
		calculo.performOperation();
		System.out.println("El resultado es " + calculo.getResult());

	}

}
