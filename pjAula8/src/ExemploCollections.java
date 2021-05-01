import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploCollections {
	public static String imprimeValores(Set estrutura) {
		String texto = "";
		Iterator i = estrutura.iterator();
		while(i.hasNext()) {
			texto += i.next() + " ";
		}
		return texto;
	}
	
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		set.add("Igor");
		set.add("Paulo");
		set.add("Mariana");
		set.add("André");
		
		System.out.println(set);
		
		System.out.println(imprimeValores(set));
		
		System.out.println(set);
		
		
		
		set.clear();
		System.out.println(set.isEmpty());
	}
}
