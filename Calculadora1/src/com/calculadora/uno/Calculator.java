package com.calculadora.uno;


	public class Calculator implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		private double operandoOne;
		private char operation;
		private double operandoTwo;
		private double result;
		
		public Calculator() {	
		}
		
		public void performOperation() {
			if(operation == '+') {
				result = operandoOne + operandoTwo;
			}
			else if(operation == '-') {
				result = operandoOne - operandoTwo;
			}
			else {
				System.out.println("Ingrese una operacion valida");
			}
		}
		
		public double getResult() {
			return result;
		}
		
		//Setters
		public void setOperandoOne(double operandoOne) {
			this.operandoOne = operandoOne;
		}
		public void setOperation(char operation) {
			this.operation = operation;
		}
		public void setOperandoTwo(double operandoTwo) {
			this.operandoTwo = operandoTwo;
		}
	
}
	
