package auto;

import motor_dispensador.Deposito;
import motor_dispensador.Motor;

public class Auto {
	private Motor motor;
	private Deposito deposito;
	
	private Auto(){
		
	}
	
	public Auto(Motor motor, Deposito dispensador){
		this.motor = motor;
		this.deposito = dispensador;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Deposito getDeposito() {
		return deposito;
	}

	public void setDeposito(Deposito dispensador) {
		this.deposito = dispensador;
	}
	
	public Auto clonar(){
		Auto duplicado = new Auto();
		duplicado.setDeposito(deposito.clonar());
		duplicado.setMotor(motor.clonar());
		return duplicado;
	}
}
