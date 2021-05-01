/**
 * Agenda de Contatos
 * @author Prof. Paulo Barreto
 * @date 15/08/2015 
 * Agenda para contatos sem persistência
 * Métodos de solução: Array e ActionListener.
 * Limitações: Ausência de Persistência e número máximo de contatos (100)
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
public class AgendaContatos extends JFrame implements ActionListener
{
  private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
  private JPanel pn,pn1,pn2;
  private JTextField tf,tf1,tf2,tf3;
  private FlowLayout fl;
  private String[][] agenda = new String[100][4];
  private int indice=0,indic=1;
  private int nome=0,end=1,tel=2,cep=3;
  AgendaContatos()
  {
     setSize(420,200);
     setTitle("Agenda - Índice da Matriz Atual: "+ indic);
     bt1 = new JButton("Nome");
     bt2 = new JButton("Endereco");
     bt3 = new JButton("Telefone");
     bt4 = new JButton("CEP");
     bt5 = new JButton("Incluir");
     bt6 = new JButton("Excluir");
     bt7 = new JButton("Editar");
     bt8 = new JButton("<<");
     bt9 = new JButton(">>");
     bt10 = new JButton("Sair");
     tf = new JTextField("");
     tf1 = new JTextField("");
     tf2 = new JTextField("");
     tf3 = new JTextField("");
     pn = new JPanel();
     pn1 = new JPanel();
     pn2 = new JPanel();
     fl = new FlowLayout();
     BorderLayout lay = new BorderLayout();
     getContentPane().setLayout(lay);
     getContentPane().add(pn,BorderLayout.WEST);
     getContentPane().add(pn1,BorderLayout.CENTER);
     getContentPane().add(pn2,BorderLayout.SOUTH);
     pn.setLayout(new GridLayout(4,1));
     pn1.setLayout(new GridLayout(4,1));
     pn2.setLayout(fl);
     pn.add(bt1);
     pn.add(bt2);
     pn.add(bt3);
     pn.add(bt4);
     pn1.add(tf);
     pn1.add(tf1);
     pn1.add(tf2);
     pn1.add(tf3);
     pn2.add(bt5);
     pn2.add(bt6);
     pn2.add(bt7);
     pn2.add(bt8);
     pn2.add(bt9);
     pn2.add(bt10);
     bt5.addActionListener(this);
     bt6.addActionListener(this);
     bt7.addActionListener(this);
     bt8.addActionListener(this);
     bt9.addActionListener(this);
     bt10.addActionListener(this);
     iniciar();
  }
  public void iniciar()
  {
        for(int i=0;i<100;i++)
           for(int j=0;j<4;j++)
               agenda[i][j] = "";
        tf_set_enable(false);
        bt_verificar();
  }
  public void bt_verificar()
  {
      if(agenda[indice][nome] == "")
      {
          bt7.setEnabled(false);
          bt6.setEnabled(false);
      }
      else
      {
          bt7.setEnabled(true);
          bt6.setEnabled(true);
      }
  }
  public void tf_set_enable(boolean x)
  {
     if(x)
     {
        tf.setEnabled(true);
        tf1.setEnabled(true);
        tf2.setEnabled(true);
        tf3.setEnabled(true);
     }
     else
     {
        tf.setEnabled(false);
        tf1.setEnabled(false);
        tf2.setEnabled(false);
        tf3.setEnabled(false);
     }
  }
  public void set_title(String x)
  {
      if(x == "set")
      {
           indic = indice + 1;
           setTitle("Agenda - Índice da Matriz Atual: "+ indic);
      }
      else
      if(x == "++")
      {
           indic++;
           setTitle("Agenda - Índice da Matriz Atual: "+ indic);
      }
      else
      if(x == "--")
      {
           indic--;
           setTitle("Agenda - Índice da Matriz Atual: "+ indic);
      }
  }
  public void incluir_salvar()
  {
       if(bt5.getLabel() == "Salvar")
       {
               for(int i=0;i<100;i++)
               if(agenda[i][nome] == "")
               {
                   agenda[i][nome] = tf.getText();
                   agenda[i][end] = tf1.getText();
                   agenda[i][cep] = tf2.getText();
                   agenda[i][tel] = tf3.getText();
                   break;
               }
               bt5.setLabel("Incluir");
               tf_set_enable(false);
       }
       else
       {
               limpar();
               bt5.setLabel("Salvar");
               tf_set_enable(true);
       }
  }
  public void excluir()
  {
      agenda[indice][nome] = "";
      agenda[indice][end] = "";
      agenda[indice][cep] = "";
      agenda[indice][tel] = "";
  }
  public void editar()
  {
      if(bt7.getLabel() == "Salvar")
       {
            agenda[indice][nome] = tf.getText();
            agenda[indice][end] = tf1.getText();
            agenda[indice][cep] = tf2.getText();
            agenda[indice][tel] = tf3.getText();
            bt7.setLabel("Editar");
            tf_set_enable(false);
       }
       else
       {
            bt7.setLabel("Salvar");
            tf_set_enable(true);
       }
  }
  public void voltar()
  {
               if(indice == 0)
               {
                    indice = 0;
                    set_title("set");
                    JOptionPane.showMessageDialog(null, "Inicio da Agenda");
               }
               else
               if(indice > 0)
               {
                    indice--;
                    tf.setText(agenda[indice][nome]);
                    tf1.setText(agenda[indice][end]);
                    tf2.setText(agenda[indice][cep]);
                    tf3.setText(agenda[indice][tel]);
                    set_title("--");
               }
  }
  public void avancar()
  {
               if(indice == 99)
               {
                    indice = 99;
                    set_title("set");
                    JOptionPane.showMessageDialog(null, "Fim da Agenda");
               }
               else
               if(indice < 99)
               {
                    indice++;
                    tf.setText(agenda[indice][nome]);
                    tf1.setText(agenda[indice][end]);
                    tf2.setText(agenda[indice][cep]);
                    tf3.setText(agenda[indice][tel]);
                    set_title("++");
               }
  }
  public void limpar()
  {
      tf.setText("");
      tf1.setText("");
      tf2.setText("");
      tf3.setText("");
  }
  public void actionPerformed(java.awt.event.ActionEvent e)
  {
  if(e.getSource() == bt5)
  {
       incluir_salvar();
       bt_verificar();
  }
  else
  if(e.getSource() == bt6)
  {
       excluir();
       limpar();
       bt_verificar();
  }
  else
  if(e.getSource() == bt7)
  {
       editar();
       bt_verificar();
  }
  else
  if(e.getSource() == bt8)
  {
       voltar();
       bt_verificar();
  }
  else
  if(e.getSource() == bt9)
  {
       avancar();
       bt_verificar();
  }
  else
  if(e.getSource() == bt10)
  {
       System.exit(0);
  }
}
  public static void main(String [] arg)
  {
     AgendaContatos janela = new AgendaContatos();
     janela.setVisible(true);
  }
}