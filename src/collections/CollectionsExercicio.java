package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsExercicio {

	public static void main(String[] args) {
		List<Integer> listaLoja = new ArrayList<Integer>();

		listaLoja.add(15);
		listaLoja.add(8);
		listaLoja.add(9);
		listaLoja.add(1);
		listaLoja.add(3);
		listaLoja.add(2);
		listaLoja.add(10);

		for (Integer listaElementos : listaLoja) {
			System.out.println(listaLoja);
		}
		System.out.println();
		listaLoja.remove(0);
		for (Integer listaElementos : listaLoja) {
			System.out.println(listaElementos);
		}
		int primeroElemento = listaLoja.get(0);
		System.out.println("\nO primeiro elemento foi:" + primeroElemento);
		System.out.println();

		for (int l = 0; l < listaLoja.size(); l++) {
			System.out.println("\n Elemento:" + listaLoja.get(l));
		}
		Collections.sort(listaLoja);
		System.out.println("\nDepois de ordenada...");
		System.out.println(listaLoja);
		System.out.println();

		Set<Integer> meuSet = new HashSet<Integer>();

		meuSet.add(5);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(2);
		meuSet.add(5);

		Iterator<Integer> lMeuSet = meuSet.iterator();
		while (lMeuSet.hasNext()) {
			System.out.println(lMeuSet.next());
		}
	}
}
