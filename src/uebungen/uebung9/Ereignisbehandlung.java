package uebungen.uebung9;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

public class Ereignisbehandlung extends JFrame implements ActionListener{
	
	JTextField text;
	JButton b1;
	JButton b2;
	JPanel unten ;
	List<JLabel> labels = new ArrayList<>();

	
	public Ereignisbehandlung()
	{
		super();
		this.setTitle("Elemente hinzufügen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = this.initContent();
		this.getContentPane().add(panel);  // Steuerelemente hinzufügen
		
		this.setSize(400, 100);	
		this.setLocation(200, 100);
	    this.setVisible(true);
	}
	
	private JPanel initContent()
	{
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2,1));
		
		JPanel oben = new JPanel();
		
		this.text = new JTextField(10);
		this.b1 = new JButton("add");
		this.b2 = new JButton("remove");
		
		oben.setBackground(Color.YELLOW);
		oben.add(this.text);
		oben.add(this.b1);
		oben.add(this.b2);
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		
		unten = new JPanel();
		unten.setBackground(Color.CYAN);
		
		mainPanel.add(oben);
		mainPanel.add(unten);
		return mainPanel;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Button geklickt...");
		
		Object quelle = e.getSource(); //Wer hat eine Action ausgelöst?
		if(quelle instanceof JButton) // Ist die Quelle ein Button
		{
			JButton button = (JButton)quelle;
			if(button.getActionCommand().equals("add")) // getActionCommand() besser als getText()
			{
				JLabel neu = new JLabel(this.text.getText());
				neu.setOpaque(true);
				neu.setBackground(Color.RED);
				this.labels.add(neu);
				this.unten.add(neu);
				System.out.println("add");
			}else if(button.getActionCommand().equals("remove"))
			{
				String inputText = this.text.getText();
				Iterator<JLabel> it = this.labels.iterator();
				while(it.hasNext())
				{
					JLabel aktLabel = it.next();
					if(aktLabel.getText().equals(inputText))
					{
						it.remove();
						this.unten.remove(aktLabel); // wird aus JPanel gelöscht
					}
				}
			}
		}
		this.unten.revalidate();
		this.unten.repaint();
	}
	
	public static void main(String[] args) {
		
		new Ereignisbehandlung();
		
	}


}
