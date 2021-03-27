package pjAula5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Herança do tipo "É um" JFrame
 * Herança do tipo "Tem um" JButton
 * Implementação de Interface de Tratamento de Ação
 * @author Paulo Barreto
 *
 */
public class frmCadastro extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	public JButton btCadastrar;
	public JComboBox<String> cbxEstados;
	
	public frmCadastro() {
		setTitle("Exemplo de Herança");
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		btCadastrar = new JButton("Cadastrar");
		add(btCadastrar);
		btCadastrar.addActionListener(this);
		
		String estados[] = new String[EnumSet.allOf(Estado.class).size()];
		int i=0;
		for(Estado e: EnumSet.allOf(Estado.class)) {
			estados[i++] = e.getDescricao();
		}
		
		cbxEstados = new JComboBox<String>(estados);
		add(cbxEstados);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		frmCadastro frm = new frmCadastro();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Você clicou no Botão");
	}
}
