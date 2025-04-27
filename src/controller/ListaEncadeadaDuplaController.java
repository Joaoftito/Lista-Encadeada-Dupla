package controller;

import model.ListaEncadeadaDupla;

public class ListaEncadeadaDuplaController {

	public ListaEncadeadaDuplaController() {
		super();
	}

	public String teste() throws Exception {
		ListaEncadeadaDupla lista = new ListaEncadeadaDupla();

		lista.Prepend(69);
		lista.Prepend(4);
		lista.Prepend(2);
		lista.Prepend(0);

		lista.Append(6);
		lista.Append(10);

		lista.Insert(8, 5);
		lista.Insert(12, 6);
		lista.Insert(-2, 0);
		
		lista.Remove(0);
		lista.Remove(3);
		lista.Remove(5);
		
		System.out.println("O elemento solicitado pelo endereço indicado é: " + lista.Get(4));
		System.out.println("O total de elementos da lista é: " + lista.Total());

		return lista.toString();
	}

}
