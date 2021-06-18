package uebungen.uebung10;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.*;

public class Uebung10 extends JFrame{

	public Uebung10()
	{
		super();
		this.setTitle("Übung10");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new Canvas());

		this.setSize(400, 300);
		this.setLocation(300, 200);
		this.setVisible(true);
	}

	private class Canvas extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			int abstand = this.getHeight()/20;
			int hoehe = this.getHeight()-(2*abstand);
			int breite = this.getWidth()-(2*abstand);

			//g2.drawRect(20, 30, 200, 100);
			Random r = new Random();
			int rot = r.nextInt(256);
			int gruen = r.nextInt(256);
			int blau = r.nextInt(256);
			g2.setColor(new Color (rot, gruen , blau));

			//g2.fillRect(abstand, abstand, breite-(2*abstand), hoehe-(2*abstand));
			if(hoehe <= breite)
			{
				int linksAbstand = (this.getWidth()-hoehe)/2;
				g2.fillRect(linksAbstand, abstand, hoehe, hoehe);
			}
			else
			{
				int ObenAbstand = (this.getHeight()-breite)/2;
				g2.setStroke(new BasicStroke(5.0f));
				g2.drawRect(abstand, ObenAbstand, breite, breite);
			}

		}
	}
	/*
	 * Jedes mal wenn sich was mit dem Fenster verändert, dann 
	 * ändert sich die Farbe und somit wird
	 * jeses mal auch die paintComponent()-Methode aufgerufen,
	 * weil es jedes mal neu gezeichnet wird 
	 */

	public static void main(String[] args) {

		new Uebung10();
	}
}

