package aufgaben.aufgabe9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Taschenrechner extends JFrame implements ActionListener {
	
	JTextField feld;
	
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
		this.feld = new JTextField(25);
	//	JLabel leer = new JLabel();
		oben.add(feld);
		//oben.add(leer);
		
		JPanel mitte = new JPanel();
		mitte.setLayout(new GridLayout(6,3, 10,10));
		JButton b1 = new JButton("1");
		b1.addActionListener(this);
		mitte.add(b1);
		JButton b2 = new JButton("2");
		b2.addActionListener(this);
		mitte.add(b2);
		JButton b3 = new JButton("3");
		b3.addActionListener(this);
		mitte.add(b3);
		JButton b4 = new JButton("4");
		b4.addActionListener(this);
		mitte.add(b4);
		JButton b5 = new JButton("5");
		b5.addActionListener(this);
		mitte.add(b5);
		JButton b6 = new JButton("6");
		b6.addActionListener(this);
		mitte.add(b6);
		JButton b7 = new JButton("7");
		b7.addActionListener(this);
		mitte.add(b7);
		JButton b8 = new JButton("8");
		b8.addActionListener(this);
		mitte.add(b8);
		JButton b9 = new JButton("9");
		b9.addActionListener(this);
		mitte.add(b9);
		JButton bk1 = new JButton("(");
		bk1.addActionListener(this);
		mitte.add(bk1);
		JButton b0 = new JButton("0");
		b0.addActionListener(this);
		mitte.add(b0);
		JButton bk2 = new JButton(")");
		bk2.addActionListener(this);
		mitte.add(bk2);
		JButton bmal = new JButton("*");
		bmal.addActionListener(this);
		mitte.add(bmal);
		JButton bg = new JButton("/");
		bg.addActionListener(this);
		mitte.add(bg);
		JButton bp = new JButton("+");
		bp.addActionListener(this);
		mitte.add(bp);
		JButton bm = new JButton("-");
		bm.addActionListener(this);
		mitte.add(bm);
		JButton bk = new JButton(".");
		bk.addActionListener(this);
		mitte.add(bk);
		JButton bi = new JButton("=");
		bi.addActionListener(this);
		mitte.add(bi);
		
		JPanel unten = new JPanel();
		
		JButton bC = new JButton("C");
		bC.addActionListener(this);
		unten.add(bC);
		JButton bCE = new JButton("CE");
		bCE.addActionListener(this);
		unten.add(bCE);
		
		main.add(oben, BorderLayout.NORTH);
		main.add(mitte, BorderLayout.CENTER);
		main.add(unten, BorderLayout.SOUTH);
		return main;
	}
	
	public static void main(String[] args) {
		
		new Taschenrechner();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object quelle = e.getSource();
		String command = e.getActionCommand();
		if(quelle instanceof JButton)
		{
			JButton button = (JButton) quelle;
			
			if(button.getActionCommand().equals("="))
			{
				feld.setText(calculate(feld.getText()));

			}
			else if(button.getActionCommand().equals("CE"))
			{
				String s = feld.getText();
				s = s.substring(0, s.length()-1);
				feld.setText(s);
			
			}
			else if(button.getActionCommand().equals("C"))
			{
				feld.setText("");
			}
			else
			{
				feld.setText(feld.getText()+(command));
			}
		}
		
	}
	
	 public static String calculate(String expression) {
	      char[] arr = expression.toCharArray();
	      String operand1 = "";
	      String operand2 = "";
	      String operator = "";
	      double result = 0;

	      for (int i = 0; i < arr.length; i++) {
	         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') 
	         {
	            if(operator.isEmpty()){
	               operand1 += arr[i];
	            }else{
	               operand2 += arr[i];
	            }
	         }  

	         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') 
	         {
	            operator += arr[i];
	         }
	      }

	      if (operator.equals("+"))
	         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
	      else if (operator.equals("-"))
	         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
	      else if (operator.equals("/"))
	         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
	      else
	         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
	      return ""+result;
	   }    


}
