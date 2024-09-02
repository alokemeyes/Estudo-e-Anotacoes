package estudo.consulta;
/* Method References
 *    x :: y
 *     
 *     Alternativa as Lambdas e considerado por alguns professores como 
 *     simplificação das Lambdas
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Methodreferences {

	public static void main(String[] args) {
		List<String> times = new ArrayList<String>();

		times.add("Corinthians");
		times.add("Flamengo");
		times.add("Cruzeiro");
		times.add("Internacional");
		times.add("Bahia");
		
		//Alternativa as espressoes Lambdas
		//considerado simplificação das Lambdas por alguns professores
		times.sort(Comparator.comparing(String::length));
		
		System.out.println(times);
	}

}
