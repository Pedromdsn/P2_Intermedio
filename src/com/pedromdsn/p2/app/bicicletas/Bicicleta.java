package com.pedromdsn.p2.app.bicicletas;

public abstract class Bicicleta {
	private String codico;
	private String marca;
	private String modelo;
	private float preco;

	public Bicicleta(String codico, String marca, String modelo, float preco) {
		this.codico = codico;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getCodico() {
		return this.codico;
	}

	public void setCodico(String codico) {
		this.codico = codico;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPreco() {
		return this.preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Bicicleta [codico=" + this.codico + "]";
	}
}