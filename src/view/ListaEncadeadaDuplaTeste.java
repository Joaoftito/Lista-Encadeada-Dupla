package view;

import controller.ListaEncadeadaDuplaController;

public class ListaEncadeadaDuplaTeste {

	public static void main(String[] args) {

		try {
			ListaEncadeadaDuplaController lista = new ListaEncadeadaDuplaController();
			System.out.println(lista.teste());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
