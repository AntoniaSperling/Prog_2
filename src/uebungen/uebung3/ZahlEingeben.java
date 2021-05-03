package uebungen.uebung3;

import javax.swing.JOptionPane;

public class ZahlEingeben {

	public static int divison(int a, int b) throws ArithmeticException
	{
		return a/b;
	}

	public static void zahlEingabe()
	{
		int a = 0;
		int b = 0;
		int result = 0;
		boolean inputOk = false;
		boolean inputOK2 = false;
		String message = "Zahl 1 :";
		String message2 = "Zahl 2 :";
		while(!inputOk)
		{
			try
			{
				String input = JOptionPane.showInputDialog(message);
				inputOk = true;
				a = Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{

				message = "Die Eingabe muss eine Zahl sein! Bitte eine Zahl eingeben!";
				inputOk = false;
			}
		}
		while(!inputOK2)
		{
			try
			{
				String input = JOptionPane.showInputDialog(message2);
				b = Integer.parseInt(input);
				result = divison(a,b);
				inputOK2 = true;
			}
			catch(NumberFormatException e)
			{
				message2 = "Die Eingabe muss eine Zahl sein! Bitte geben Sie eine Zahl ein! ";
				inputOK2 = false;
			}
			catch(ArithmeticException e)
			{
				message2 = "Die 2. Zahl darf nicht 0 sein!";
				inputOK2 = false;
			}
		}
		System.out.println(a + " / " + b + " = " + result);
	}

	public static void printSeconds()
	{
		int seconds = 0;
		String message = "Geben Sie eine Zahl ein!";
		boolean inputOk = false;
		while(!inputOk)
		{
			try
			{
				String input = JOptionPane.showInputDialog(message);
				inputOk = true;
				seconds = Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{

				message = "Die Eingabe muss eine Zahl sein! Bitte eine Zahl eingeben!";
				inputOk = false;
			}
		}
		int tag= seconds/86400;
		int stunden = (seconds - tag * 86400)/ 3600;
		int minuten = (seconds - tag * 86400-  stunden*3600) / 60;
		int sekunden = (seconds - tag * 86400-  stunden*3600- minuten* 60);

		String s = seconds + " Sekunden sind ";
		if (tag>1)
		{
			s+= tag + " Tage, ";
		}
		else if (tag == 1)
		{
			s+= "1 Tag, ";
		}
		if (stunden >1)
		{
			s+= stunden + " Stunden, ";
		}
		else if (stunden == 1)
		{
			s+= "1 Stunde";
		}
		if(sekunden > 1)
		{
			s+= "und "+sekunden + " Sekunden.";
		}
		else if(sekunden == 1)
		{
			s+= "und 1 Sekunde.";
		}
		System.out.println(s);
	}

	public static void main(String[] args) 
	{
		zahlEingabe();
		printSeconds();
	}
}


