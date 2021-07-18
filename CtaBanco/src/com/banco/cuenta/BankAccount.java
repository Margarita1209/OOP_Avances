package com.banco.cuenta;

import java.util.Random;

public class BankAccount {
	private String numeroCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorro;
	private static int cantidadCuentas = 0;
	private static double cantidadDinero = 0;
	
	private String cuenta() {
		Random r = new Random();
		String num = String.valueOf(r.nextInt(1000000000));
		return num;
	}
	// Crea nueva cuenta
	public void nuevaCuenta() {
		numeroCuenta = cuenta();
		cantidadCuentas++;
		System.out.println("El número de su cuenta es: " + numeroCuenta + ". ");
	}
	// Getters Saldos
	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}
	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}
	// Depositar
	public void depositarCuentaCorriente(double dinero) {
		saldoCuentaCorriente = saldoCuentaCorriente + dinero;
		cantidadDinero = cantidadDinero + dinero;
		System.out.println("Usted a depositado $" + dinero + " a su cuenta corriente. ");
	}
	public void depositarCuentaAhorro(double dinero) {
		saldoCuentaAhorro = saldoCuentaAhorro + dinero;
		cantidadDinero = cantidadDinero + dinero;
		System.out.println("Usted a depositado $" + dinero + " a su cuenta de ahorro. ");
	}
	// Retirar
	public void retirarCuentaCorriente(double dinero) {
		if (saldoCuentaCorriente > 0) {
			saldoCuentaCorriente = saldoCuentaCorriente - dinero;
			cantidadDinero = cantidadDinero - dinero;
			System.out.println("Usted a retirado $" + dinero + " de su cuenta corriente. ");
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
	}
	public void retirarCuentaAhorro(double dinero) {
		if (saldoCuentaAhorro > 0) {
			saldoCuentaAhorro = saldoCuentaAhorro - dinero;
			cantidadDinero = cantidadDinero - dinero;
			System.out.println("Usted a retirado $" + dinero + " de su cuenta de ahorro. ");
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
		
	}
	
	// Consultar saldo
		public void consultaSaldo() {
			System.out.println("Su saldo en la cuenta Corriente es de: " + saldoCuentaCorriente + ". ");
			System.out.println("Su saldo en la cuenta de Ahorro es de: " + saldoCuentaAhorro + ". ");
		}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public static int getCantidadCuentas() {
		return cantidadCuentas;
	}
	public static void setCantidadCuentas(int cantidadCuentas) {
		BankAccount.cantidadCuentas = cantidadCuentas;
	}
	public static double getCantidadDinero() {
		return cantidadDinero;
	}
	public static void setCantidadDinero(double cantidadDinero) {
		BankAccount.cantidadDinero = cantidadDinero;
	}
	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}
	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}
	

}
