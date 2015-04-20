package ar.edu.tallerweb.cuentas;

public class Cuenta {
	private float saldo;
	
	//Constructor
	public Cuenta(float saldo){
		this.saldo=saldo;
	}
	
	public boolean extraerMonto(float monto){
		if (monto<this.saldo && monto>0){
			this.saldo -= monto;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean depositarMonto(float monto){
		if(monto>0){
			this.saldo+=monto;
			return true;
		}else{
			return false;
		}
	}
	
	public float consultarSaldo(){
		return this.saldo;
	}
	
}
