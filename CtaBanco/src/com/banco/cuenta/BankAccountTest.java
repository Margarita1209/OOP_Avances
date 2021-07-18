package com.banco.cuenta;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount money = new BankAccount();
		money.nuevaCuenta();
		System.out.println("La......es de: " + BankAccount.getCantidadCuentas());
		money.depositarCuentaCorriente(50000.00);
		money.depositarCuentaCorriente(10000.00);
		money.depositarCuentaAhorro(700.00);
		money.depositarCuentaAhorro(58200.000);
		money.retirarCuentaCorriente(5.000);
		money.retirarCuentaAhorro(250.00);
		money.consultaSaldo();
		System.out.println("Saldo Total en Cuentas: " + BankAccount.getCantidadDinero());


	}

}
