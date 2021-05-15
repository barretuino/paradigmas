
public class Contador implements Runnable {
	private String contador;	

	public Contador(String contador) {
		this.contador = contador;
	}

	@Override
	public void run() {
		for(int i=1; i<=100;i++){
			System.out.println(contador + " - " + i);
		}

	}

}
