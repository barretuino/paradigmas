package pjAula6;

/**
 * Aula 6 - Demonstração de Tipos Primitivos
 * @author Paulo Barreto
 * @date 09/04/2021
 */

public class Produto {
	//Atributos
	//Inteiros
	int inteiro;
	Integer inteiroWrapper;
	short inteiroShort;
	long inteiroLong;
	byte inteiroCurto;
	
	byte temperaturaConservacao; //-128 a +127
	Byte temperatWrapper;
	long codigoEAN;
	
	//Flutuantes
	float pontoFlutuante; //32 bits
	Float wrapperFloat;
	double pontoFlutuanteDuplo; //64 bits
	Double wrapperDuplo = null;
	
	//Caracter
	char caracter; //16 bits
	String textoString; //64 bits Tipo personalizado
	
	//Boolean

	
	public static void main(String[] args) {
		//printf("Texto \n");
		/*System.out.println("Texto\""); //Line next
		System.out.println("\tOutro Texto");
		boolean logico = true;
		boolean logico2 = false;
		Boolean logicoWrapper = true;
		
		if(logicoWrapper != null && logicoWrapper) {
			System.out.println("Verdade");
		}else {
			System.out.println("Falso");
		}
		
		System.out.println(6%2 == 0 ? "Sim é par" : "Não é par, é impar");
		int valor = 10;
		System.out.println(valor++);
		System.out.println(valor);
		
		boolean connection = false;
		if(!connection) {
			System.out.println("Estabelecendo nova conexão");
		}else {
			System.out.println("Conexão está ativa");
		}*/
		
		for(int i=0; i<100; i++) {
			System.out.println("Contador " + i);
		}
		
		char opcao = 'C';
		switch (opcao) {
		case 'A':
			System.out.println("Escolheu A");
			break;
		case 'B':
			System.out.println("Escolheu B");
			break;
		default:
			System.out.println("Escolheu Nenhuma das opções");
		}
		
		//vetores
		int valores[] = {5, 15, 36};
		int matriz[][] = {{ 5,  15, 36},
						  {-14, 10, 26},
						  {100, 1,  22}};
		
		int vet[] = new int[100];
		int mat[][] = new int[3][3];	
		
	}
	
}
