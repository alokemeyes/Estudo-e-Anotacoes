package estudo.consulta;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {
		
		List<String> times = new ArrayList<String>();
		
		times.add("Corinthians");
		times.add("Cruzeiro");
		times.add("Flamengo");
		times.add("Internacional");
		times.add("Bahia");
		
		//compara o tamanho das strings e coloca em ordem crescente
		times.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//imprime cada string na tela
		times.forEach(s -> System.out.println(s));
	}

}
