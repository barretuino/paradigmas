public class ThreadTestes {
	
	class Tarefa extends Thread {
		  
	    private final double valorInicial;
	    private final double valorFinal;
	    private double total = 0;
	  
	    //método construtor que receberá os parâmetros da tarefa
	    public Tarefa(double valorInicial, double valorFinal) {
	        this.valorInicial = valorInicial;
	        this.valorFinal = valorFinal;
	    }
	  
	    //método que retorna o total calculado
	    public double getTotal() {
	        return total;
	    }
	  
	    /*
	     Este método se faz necessário para que possamos dar start() na Thread 
	     e iniciar a tarefa em paralelo
	     */
	    @Override
	    public void run() {
	        for (double i = valorInicial; i <= valorFinal; i++) {
	            total += i;
	        }
	    }
	}
	
	private static void execucaoParalela() {
		ThreadGroup group = new ThreadGroup("A��es Conjuntas");
		
		Programa p1 = new Programa();    
        p1.setId(1);

        Thread t1 = new Thread(group, p1);
        t1.start();
        t1.setName("identifica��o");

        Programa p2 = new Programa();    
        p2.setId(2);

        Thread t2 = new Thread(group, p2);
        t2.start();  
        
        t2.setPriority(10);
        t1.setPriority(1);
        
       System.out.println("N�mero de threds agrupadas " + group.activeCount());
             
	}
	
	private static void paralelaAguardaFinalizacao() {
		 //cria três tarefas
        Tarefa t1 = new ThreadTestes().new Tarefa(0, 100_000_000);
        t1.setName("Tarefa1");
        Tarefa t2 = new ThreadTestes().new Tarefa(100_000_001, 200_000_000);
        t2.setName("Tarefa2");
        Tarefa t3 = new ThreadTestes().new Tarefa(200_000_001, 300_000_000d);
        t3.setName("Tarefa3");
  
        //inicia a execução paralela das três tarefas, iniciando três novas threads no programa
        t1.start();
        t2.start();
        t3.start();
  
        //aguarda a finalização das tarefas
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
  
        //Exibimos o somatório dos totalizadores de cada Thread
        System.out.println("Total: " + (t1.getTotal() + t2.getTotal() + t3.getTotal()));
	}
	
	private static void execucaoSincronizada() {
		        
        
	}
	
	public static void main(String[] args) {
		//Exemplo de duas threads partindo, uma primeiro, depois a outra, paralelas
		//execucaoParalela();
		//Com Thread
		long inicio = System.currentTimeMillis();
		paralelaAguardaFinalizacao();
		System.out.println("Demorou Thread " +(( System.currentTimeMillis() - inicio )/ 1000 ));
		
		//Sem Thread
		inicio = System.currentTimeMillis();
		double soma = 0;
		for(double i = 0 ; i< 300_000_000d; i++) {
			soma += i;
		}
		System.out.println("Resultado do For " + soma);
		System.out.println("Demorou For " +(( System.currentTimeMillis() - inicio) / 1000 ));
	}
}

class Programa implements Runnable {

    private int id;           
    // colocar getter e setter pro atributo id

    public void run () {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("Programa " + id + " valor: " + i);
        }
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    public int getId() {
    	return id;
    }
}
