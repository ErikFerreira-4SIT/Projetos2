import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aula1 extends JPanel{
	
	JLabel lb1, lb2, lb3, lb4, lb5, lb6;
	JButton bt1, bt2, bt3;
	ImageIcon img1, img2, img3;

	public Aula1() {
		InicializarComponentes();
		DefinirEventos();
		}
	
	public void InicializarComponentes() {
		setLayout(null);
		
		lb1 = new JLabel("Borracha");
		lb1.setForeground(Color.green);
		img1 = new ImageIcon("C:/Users/erikz/Downloads/borracha.png");
		lb2 = new JLabel(img1);
		bt1 = new JButton("Borracha");
		bt1.setBackground(Color.green);
		bt1.setForeground(Color.black);
		
		img2 = new ImageIcon("C:/Users/erikz/Downloads/lapis.png");
		lb3 = new JLabel("Lapis");
		lb3.setForeground(Color.red);
		lb4 = new JLabel(img2);
		bt2 = new JButton("Lapis");
		bt2.setBackground(Color.red);
		bt2.setForeground(Color.black);
		
		img3 = new ImageIcon("C:/Users/erikz/Downloads/sino-da-escola.png");
		lb5 = new JLabel("Sino");
		lb5.setForeground(Color.yellow);
		lb6 = new JLabel(img3);
		bt3 = new JButton("Sino");
		bt3.setBackground(Color.yellow);
		bt3.setForeground(Color.black);
		
		
		lb1.setBounds(140, 200, 150, 50);
		lb2.setBounds(50, 0, 200, 250);
		bt1.setBounds(75, 250, 150, 25);
		
		lb3.setBounds(325, 200, 150, 50);
		lb4.setBounds(265, 0, 200, 250);
		bt2.setBounds(290, 250, 150, 25);
		
		lb5.setBounds(540, 200, 150, 50);
		lb6.setBounds(470, 0, 200, 250);
		bt3.setBounds(500, 250, 150, 25);
		
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(lb6);
		add(bt1);
		add(bt2);
		add(bt3);
		
		
		
		}
	public void DefinirEventos() {
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				JOptionPane.showMessageDialog(null,"Você escolheu a Borracha");
			}
		}
				);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				JOptionPane.showMessageDialog(null, "Você escolheu o Lapis");
				
			}
		});
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				JOptionPane.showMessageDialog(null, "Você escolheu o Sino");
			}
		});
		
		
			
		}
	public static void main (String args[]) {
		JFrame frame = new JFrame("Janela com imagem");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Aula1());
		frame.getContentPane().setBackground(Color.black);
		frame.setBounds(400, 250, 700, 400);
		frame.setVisible(true);
		
		frame.setResizable(false);
	}
	
	
	
}