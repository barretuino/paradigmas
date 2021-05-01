import java.util.ArrayList;

public class ArrayListExemplo {
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		lista.add("paulo");
		lista.add("uri");
		lista.add("andre");
		lista.add("paulino");
		lista.add("aparecido");
		
		/*Predicate<String> filtro = f-> f.contains("r");
		lista.removeIf(filtro);*/
		
		System.out.println(lista);
	}
}