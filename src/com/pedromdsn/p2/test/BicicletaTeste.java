package com.pedromdsn.p2.test;

import com.pedromdsn.p2.app.Encomenda;
import com.pedromdsn.p2.app.bicicletas.BicicletaEletrica;
import com.pedromdsn.p2.app.bicicletas.BicicletaNaoEletrica;

public class BicicletaTeste {
	public static void teste() {
		Encomenda e = new Encomenda();
		Encomenda e2 = new Encomenda();

		BicicletaEletrica b1 = new BicicletaEletrica("abc", "nike", "b1", 10f, 10, 10);
		BicicletaEletrica b2 = new BicicletaEletrica("abd", "nike", "b1", 11f, 11, 11);

		BicicletaNaoEletrica b3 = new BicicletaNaoEletrica("abcd", "nike", "b1", 10f, 10, "22");
		BicicletaNaoEletrica b4 = new BicicletaNaoEletrica("abde", "nike", "b1", 11f, 11, "11");

		e.addBicicleta(b1);
		e.addBicicleta(b3);

		e2.addBicicleta(b2);
		e2.addBicicleta(b4);

		System.out.println(e);
		System.out.println(e2);
	}
}
