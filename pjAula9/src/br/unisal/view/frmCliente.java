package br.unisal.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//CTRL + SHIFT + O (Importação da bibliotecas)
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.unisal.vendas.Cliente;

public class frmCliente extends JFrame implements ActionListener{
	//1º Passo - Declarar os objetos
	JLabel lbNome, lbCodigo, lbStatus;	
	JTextField txtNome, txtCodigo;
	JButton btCadastrar, btPesquisar;
	JComboBox<String> cbxStatus;
	List<Cliente> clientes = new ArrayList<Cliente>();
	String status [] = { "Ativo", "Inativo", "Cancelado"};
	
	public frmCliente() {
		setTitle("Cadastro de Cliente");
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		//2º Passo - Construção dos Objetos
		lbNome = new JLabel("Nome");
		btCadastrar = new JButton("Cadastrar");
		btPesquisar = new JButton("Pesquisar");
		txtNome = new JTextField(20);
		lbCodigo = new JLabel("Código");
		txtCodigo = new JTextField(20);
		lbStatus = new JLabel("Situação");
		cbxStatus = new JComboBox<String>(status);
		
		//3º Passo - Adicionar o componente que já foi instanciado, a tela
		add(lbCodigo);
		add(txtCodigo);
		add(lbNome);
		add(txtNome);
		add(lbStatus);
		add(cbxStatus);
		add(btCadastrar);
		add(btPesquisar);
		
		//4º Passo - Tratamento de Ações
		btCadastrar.addActionListener(this);
		btPesquisar.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == btCadastrar) {
			Cliente objeto = new Cliente();
			
			objeto.setCodigo(Integer.parseInt(txtCodigo.getText()));
			objeto.setNome(txtNome.getText());
			objeto.setStatus(status[cbxStatus.getSelectedIndex()]);
			
			clientes.add(objeto);
			
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso! ");
			limparFormulario();
		}else {
			JOptionPane.showMessageDialog(null, clientes);
		}
	}
	
	private void limparFormulario() {
		txtCodigo.setText("");
		txtNome.setText("");
		txtCodigo.requestFocus();
	}
	
	public static void main(String args[]) {
		frmCliente form = new frmCliente();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
