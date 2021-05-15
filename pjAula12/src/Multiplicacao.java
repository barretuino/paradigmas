import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Multiplicacao extends JFrame implements ActionListener {
	
	JLabel lbResultado;
	JTextField txtValor1, txtValor2;
	JButton btCalcular;
	JPanel painel;
	
	public Multiplicacao() {
		setTitle("Exemplo Sem Execucao Paralela - Demorada");
		
		txtValor1 = new JTextField(10);
		txtValor2 = new JTextField(10);
		
		lbResultado = new JLabel("       ?         ");
		
		btCalcular = new JButton("=");
		btCalcular.addActionListener(this);
		
		painel = new JPanel();
		
		painel.add(txtValor1);
		painel.add(new JLabel("X"));
		painel.add(txtValor2);
		painel.add(btCalcular);
		painel.add(lbResultado);
		
		add(painel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BigInteger calculo = new BigInteger("0");
		for(int i=0; i < Integer.parseInt(txtValor1.getText()); i++)
			for(int x=0; x < Integer.parseInt(txtValor2.getText()); x++)
				calculo = calculo.add(new BigInteger("1"));
		
		lbResultado.setText(calculo.toString());
	}
	public static void main(String[] args) {
		Multiplicacao multiplicacao = new Multiplicacao();
	}
}