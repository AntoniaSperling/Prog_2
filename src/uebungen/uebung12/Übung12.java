package uebungen.uebung12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Übung12 extends JFrame{
	
	int meisteKlicks;
	MyPanel[][] panels;
	
	public Übung12(int hoehe, int breite)
	{
		super();
		this.setTitle("Klicks zählen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel center = initCenter(hoehe, breite);
		JPanel south = new JPanel();
		this.getContentPane().add(center, BorderLayout.CENTER);
		this.getContentPane().add(south, BorderLayout.SOUTH);
		
		this.setSize(300, 300);
		this.setLocation(200, 100);
		this.setVisible(true);
		this.meisteKlicks = 0;
	}
	
/*	private JPanel initSouth() 
    {
    	JPanel south = new JPanel();
    	JButton resetBtn = new JButton("reset");
    	//https://freiheit.f4.htw-berlin.de/prog2/ereignisse/#ereignisbehandlung-mit-anonymer-klasse
    	resetBtn.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				for(int zeile=0; zeile<Übung12.this.panels.length; zeile++)
				{
					for(int spalte=0; spalte<Übung12.this.panels[zeile].length; spalte++)
					{
						Übung12.this.panels[zeile][spalte].anzKicks = 0;
						Übung12.this.panels[zeile][spalte].label.setText("0"); 
						Übung12.this.panels[zeile][spalte].setBackground(Color.LIGHT_GRAY);
					}
				}
				Übung12.this.meisteKlicks=0;				
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
    		
    	});
    	south.add(resetBtn);
    	return south;
    }*/

	
	JPanel initCenter(int hoehe_panel, int breite_panel)
	{
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(hoehe_panel, breite_panel, 2, 2));
		center.setBackground(Color.LIGHT_GRAY);
		
		this.panels = new MyPanel[hoehe_panel][breite_panel];
		for(int i = 0; i < panels.length; i++)
		{
			for(int j = 0; j < panels[i].length; j++)
			{
				panels[i][j]= new MyPanel(hoehe_panel, breite_panel);
				center.add(panels[i][j]);
			}
		}
		
		return center;
	}
	
	private class MyPanel extends JPanel implements MouseListener
	{
		int anzKlicks;
		int zeile;
		int spalte;
		JLabel label;
	
		MyPanel(int zeile, int spalte)
		{
			this.zeile = zeile;
			this.spalte = spalte;
			this.anzKlicks = 0;
			this.label = new JLabel(String.valueOf(anzKlicks));
			this.label.setForeground(Color.WHITE);
			this.add(label);
			this.label.setFont(new Font("Verdana", Font.BOLD, 48));
			

			this.addMouseListener(this);
		}

		@Override
		public void mouseClicked(MouseEvent e) 
		{
			MyPanel mp = (MyPanel) e.getSource();
			mp.anzKlicks++;
			mp.label.setText(String.valueOf(anzKlicks));
			
			if(mp.anzKlicks > Übung12.this.meisteKlicks)
			{
				mp.setForeground(Color.RED);
				Übung12.this.meisteKlicks = mp.anzKlicks;
			}
			
			for(int i = 0; i < Übung12.this.panels.length; i++)
			{
				for(int j = 0; j < Übung12.this.panels[i].length; j++)
				{
					if(Übung12.this.panels[i][j].anzKlicks == Übung12.this.meisteKlicks)
					{
						Übung12.this.panels[i][j].setBackground(Color.RED);
					}
					else
					{
						Übung12.this.panels[i][j].setBackground(Color.LIGHT_GRAY);
					}

				}
			}
		}

		@Override
		public void mousePressed(MouseEvent e) 
		{
		
			
		}

		@Override
		public void mouseReleased(MouseEvent e) 
		{

			
		}

		@Override
		public void mouseEntered(MouseEvent e) 
		{
		
			
		}

		@Override
		public void mouseExited(MouseEvent e) 
		{}
		
	}
	
	public static void main(String[] args) {
		
		new Übung12(4,3);
	}

}
