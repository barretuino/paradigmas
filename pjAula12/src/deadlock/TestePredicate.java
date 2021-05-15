package deadlock;

import java.util.function.Predicate;

public class TestePredicate {

	public static void main(String[] args) {
		
		//Instanciando o Objeto
		Pessoa autor = new Pessoa();
		autor.setNome("Ednei Parmigiani");
		autor.setIdade(71);
		autor.setNacionalidade("Brasileiro");
	
		//Aplicando Predicate Simples
		Predicate<Pessoa> maioridadePredicate = p -> p.getIdade() > 18;
		boolean b1 = maioridadePredicate.test(autor);
		System.out.println(b1 ? "Adulto" : "Criança");
		
		//Aplicando Predicate Composto
		Predicate<Pessoa> naoIdosoPredicate = p -> p.getIdade() < 70;
		boolean b2 = maioridadePredicate.and(naoIdosoPredicate).test(autor);
		System.out.println(b2 ? "Adulto" : "Idoso");
		
		//Aplicando Predicate Composto - Explicíto
		Predicate<Pessoa> idadeValidaPredicate = p -> p.getIdade() > 18 && p.getIdade() < 70;
		boolean b3 = idadeValidaPredicate.test(autor);
		System.out.println(b3 ? "Válido" : "Inválido");
		
		//Aplicando Predicate com operador or e and
		Predicate<String> isBrasileiro = Predicate.isEqual("Brasileiro");
		boolean b4 = isBrasileiro.test(autor.getNacionalidade());
		System.out.println(b4 ? "Brasileiro" : "Estrangeiro");

		//Predicado em método customizado
		new TestePredicate().processarIdade(autor, maioridadePredicate);		
	}
	
	public void processarIdade(Pessoa pessoa, Predicate predicate) {
		if (predicate.test(pessoa)){
			System.out.println(String.format("%s é adulto.", pessoa.getNome()));
		}
	}
}