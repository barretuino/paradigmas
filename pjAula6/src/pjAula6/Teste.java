package pjAula6;

public class Teste {
	public static void main(String[] args) {
		Aluno vinicius = new Aluno();
		
		vinicius.setRa(123456);
		vinicius.setNome("Vinicius");
		
		Curso engenharia = new Curso();
		engenharia.setCodigo(1);
		engenharia.setDescricao("Eng Computação");
		engenharia.setDuracao((byte)5);
		
		vinicius.setCurso(engenharia);
	}
}
