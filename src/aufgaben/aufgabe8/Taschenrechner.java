package aufgaben.aufgabe8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Taschenrechner extends JFrame{
	
	public Taschenrechner()
	{
		super();
		this.setTitle("Taschenrechner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = this.initContent();
		this.getContentPane().add(panel);
		
		this.setSize(300, 400);
		this.setLocation(200, 100);
		this.setVisible(true);
		
	}
	
	private JPanel initContent()
	{
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		oben.setBackground(new Color(22, 255, 9));
		JTextField feld = new JTextField(25);
	//	JLabel leer = new JLabel();
		oben.add(feld);
		//oben.add(leer);
		
		JPanel unten = new JPanel();
		unten.setLayout(new GridLayout(6,3));
		JButton b1 = new JButton("1");
		unten.add(b1);
		JButton b2 = new JButton("2");
		unten.add(b2);
		JButton b3 = new JButton("3");
		unten.add(b3);
		JButton b4 = new JButton("4");
		unten.add(b4);
		JButton b5 = new JButton("5");
		unten.add(b5);
		JButton b6 = new JButton("6");
		unten.add(b6);
		JButton b7 = new JButton("7");
		unten.add(b7);
		JButton b8 = new JButton("8");
		unten.add(b8);
		JButton b9 = new JButton("9");
		unten.add(b9);
		JButton bk1 = new JButton("(");
		unten.add(bk1);
		JButton b0 = new JButton("0");
		unten.add(b0);
		JButton bk2 = new JButton(")");
		unten.add(bk2);
		JButton bmal = new JButton("*");
		unten.add(bmal);
		JButton bg = new JButton("/");
		unten.add(bg);
		JButton bp = new JButton("+");
		unten.add(bp);
		JButton bm = new JButton("-");
		unten.add(bm);
		JButton bk = new JButton(".");
		unten.add(bk);
		JButton bi = new JButton("=");
		unten.add(bi);
		
		main.add(oben, BorderLayout.NORTH);
		main.add(unten);
		return main;
	}
	
	public static void main(String[] args) {
		
		new Taschenrechner();
	}

}
