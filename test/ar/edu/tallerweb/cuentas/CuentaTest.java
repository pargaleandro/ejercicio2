package ar.edu.tallerweb.cuentas;

import org.junit.Assert;
import org.junit.Test;


public class CuentaTest {
	@Test
	public void testExtraccionMontoMenorCero(){
		Cuenta cuentaBancaria = new Cuenta(1000); 
		
		boolean estadoExtraccion = cuentaBancaria.extraerMonto(-10);
		//System.out.println(estadoExtraccion);
		
		Assert.assertTrue(estadoExtraccion == false);
	}
	
	@Test
	public void testExtraccionMontoMayorSaldo(){
		Cuenta cuentaBancaria = new Cuenta(1000); 
		
		boolean estadoExtraccion = cuentaBancaria.extraerMonto(5000);
		//System.out.println(estadoExtraccion);
		
		Assert.assertTrue(estadoExtraccion == false);
	}

	@Test
	public void testDepositoMontoMenorCero(){
		Cuenta cuentaBancaria = new Cuenta(1000); 
		
		boolean estadoDeposito = cuentaBancaria.depositarMonto(-10);
		//System.out.println(estadoExtraccion);
		
		Assert.assertTrue(estadoDeposito == false);
	}
	
	@Test
	public void testeaSaldo(){
		Cuenta cuentaBancaria = new Cuenta (1000);
		
		cuentaBancaria.depositarMonto(100);
		cuentaBancaria.extraerMonto(600);
		float saldoActual = cuentaBancaria.consultarSaldo();
		System.out.println(saldoActual);
		Assert.assertEquals(500, saldoActual, 0);
	}

}
