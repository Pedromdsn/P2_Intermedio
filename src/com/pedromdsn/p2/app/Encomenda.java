package com.pedromdsn.p2.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pedromdsn.p2.app.bicicletas.Bicicleta;


public class Encomenda {
	private final int id;
	private final Date data = new Date();
	private final List<Bicicleta> bicicletas = new ArrayList<>();
	public static int LAST_ID = 0;

	public Encomenda() {
		this.id = ++LAST_ID;
	}

	public int getId() {
		return this.id;
	}

	public Date getData() {
		return this.data;
	}

	public List<Bicicleta> getBicicletas() {
		return this.bicicletas;
	}

	public void addBicicleta(Bicicleta bicicleta) {
		bicicletas.add(bicicleta);
	}

	@Override
	public String toString() {
		return "Encomenda [id=" + id + ", data=" + data + ", bicicletas=" + bicicletas + "]";
	}
}
