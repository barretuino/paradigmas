import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmCadastro extends JFrame {
	JButton btCadastrar, btExcluir;
	JTextField txtNome, txtEmail;
	JLabel lbNome, lbEmail;
	frmCadastro(){
		setTitle("Exemplo de Tela");
		setSize(300,300);
		setLayout(new FlowLayout());
		
		lbNome = new JLabel("Nome");
		add(lbNome);
				
		txtNome = new JTextField(20);
		add(txtNome);
		
		lbEmail = new JLabel("Email");
		add(lbEmail);
		
		txtEmail = new JTextField(20);
		add(txtEmail);
		
		btCadastrar = new JButton("Cadastrar");
		btCadastrar.setMnemonic('C');
		add(btCadastrar);
		
		btExcluir = new JButton("Excluir");
		btExcluir.setMnemonic('E');
		add(btExcluir);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmCadastro c = new frmCadastro();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
