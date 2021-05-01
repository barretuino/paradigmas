import java.util.Vector;

public class ExemploVector {
	public static void main(String[] args) {
		Vector vetor = new Vector(2);
		
		System.out.println(vetor.capacity());
		
		vetor.add("Paulo");
		vetor.add("Luiz");
		vetor.add("Fernanda");
		
		System.out.println(vetor);
		System.out.println(vetor.capacity());
		
		vetor.clear();
		System.out.println(vetor.capacity());
	}
}
