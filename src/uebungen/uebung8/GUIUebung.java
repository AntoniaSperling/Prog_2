package uebungen.uebung8;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

//import


public class GUIUebung extends JFrame
{

  public GUIUebung()
  {
      super();

      
      this.setTitle("My first window");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(400, 300);	
      this.setVisible(true);

  }

  private JPanel initContent()
  {
      //Ein paar Tipps:       
      //mehrere Panels verwenden
      //JTextField hat verschiedene Konstruktoren, nicht nur JTextField(int columns)
      //Rahmen k�nnen mit BorderFactory erzeugt werden
      //Beim FlowLayout �ndert sich die Gr��e der Steuerelemente nicht,
      //bei GridLayout passt sich die Gr��e an den Container an

	  JPanel main = new JPanel();
	  return main;
  }

  public static void main(String[] args) 
  {
      new GUIUebung();
  }

}

