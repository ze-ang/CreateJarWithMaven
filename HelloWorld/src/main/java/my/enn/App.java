package my.enn;

import javax.swing.*;

public class App extends JFrame
{
    public App(){
        setTitle("Hello World");
        setSize(600,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main( String[] args )
    {
        new App();
    }
}
