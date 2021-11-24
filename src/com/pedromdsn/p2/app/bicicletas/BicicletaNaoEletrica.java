package com.pedromdsn.p2.app.bicicletas;

public class BicicletaNaoEletrica extends Bicicleta {
	private int velocidade;
	private String suspensao;
	
	public BicicletaNaoEletrica(String codico, String marca, String modelo, float preco, int velocidade, String suspensao) {
		super(codico, marca, modelo, preco);
		this.velocidade = velocidade;
		this.suspensao = suspensao;
	}

	public int getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getSuspensao() {
		return this.suspensao;
	}

	public void setSuspensao(String suspensao) {
		this.suspensao = suspensao;
	}
}
