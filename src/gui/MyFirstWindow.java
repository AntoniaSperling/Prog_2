package gui;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFirstWindow 
{

    public MyFirstWindow()
    {
        JFrame window = new JFrame();
        window.setTitle("My first window");
//        window.setBackground(Color.CYAN);
        window.getContentPane().setBackground(Color.CYAN);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setLocation(300,200);
        window.setVisible(true);
    }

  public static void main(String[] args) 
    {
        new MyFirstWindow();
    }

}

