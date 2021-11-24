package com.pedromdsn.p2.app.bicicletas;

public class BicicletaEletrica extends Bicicleta {
	private int potencia;
	private float autonomia;

	public BicicletaEletrica(String codigo, String marca, String modelo, float preco, int potencia, float autonomia) {
		super(codigo, marca, modelo, preco);
		this.potencia = potencia;
		this.autonomia = autonomia;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public float getAutonomia() {
		return this.autonomia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}
}
