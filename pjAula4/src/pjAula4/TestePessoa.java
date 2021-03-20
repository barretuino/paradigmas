package pjAula4;

import java.util.Date;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa voce = new Pessoa();
		
		voce.setDataNascimento(new Date(1998, 7, 14));
		voce.setNome("João de Souza");
		
		Pessoa mae = new Pessoa();
		mae.setDataNascimento(new Date(1970, 1 , 17));
		mae.setNome("Maria de Souza");
		
		voce.setMae(mae);
		
		Professor paulo = new Professor();
		
		Diretor marcelo = new Diretor();
		
		marcelo.setDataAdmissao(null);
	}
}
