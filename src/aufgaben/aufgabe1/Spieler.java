package aufgaben.aufgabe1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Spieler {
	
	private String name;
	private int aktPunktestand;
	
	public Spieler(String name) {
		super();
		this.name = name;
		this.aktPunktestand = 0;
	}
	
	public int wuerfelaugen()
	{
		Random r = new Random();
		int zahl = r.nextInt(6)+1;
		return zahl;
	}
	
	public boolean wuerfel()
	{
		int punkteVomVersuch = 0;
		int wuerfelaugen = 0;
		boolean ende = false;
		
		while(!ende)
		{
			wuerfelaugen = this.wuerfelaugen();
			System.out.printf("s% hat eine %d gewuerfelt %n", this.name, wuerfelaugen);
			
			// eine 6 wurde gewürfelt
			if(wuerfelaugen == 6)
			{
				this.aktPunktestand = 0;
				System.out.printf("Versuch zu Ende %n Aktueller Spielstand von %s : %d Punkte %n Der naechste Spieler ist dran %n", 
									this.name, this.aktPunktestand);
				ende = true;
			}
			// Spiel wurde gewonnen
			else if(this.aktPunktestand+wuerfelaugen+punkteVomVersuch >= Spiel.siegPunkte)
			{
				System.out.printf("Der Spieler %s hat %d Punkte erreicht und somit gewonnen! %n ", this.name, this.aktPunktestand+wuerfelaugen+punkteVomVersuch);
				return true;
			}
			// Es wurde eine 1-5 gewuerfelt
			else
			{
				punkteVomVersuch += wuerfelaugen;
				System.out.printf("in diesem Versuch bisher %d Punkte -- insgesamt %d Punkte %n", punkteVomVersuch, this.aktPunktestand+punkteVomVersuch);
				int dialogResult = JOptionPane.showConfirmDialog (null, this.name+ ", wollen Sie weiter wuerfeln? ", "Weiter wuerfeln?", JOptionPane.YES_NO_OPTION);
				ende = (dialogResult==JOptionPane.NO_OPTION);
				if(ende)
				{
					this.aktPunktestand += punkteVomVersuch;
				}
			}
			
		}
		
		return false;
	}

}
