// A simple swing application

import javax.swing.*;

class SwingDemo{
    SwingDemo(){
        
        //Create a new JFrame container
        JFrame jf = new JFrame("A Simple Swing application");

        //Give the frame an initial size
        jf.setSize(500,500);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Hi I am Jisnoo");

        jf.add(jlab);
        jf.setVisible(true);
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new SwingDemo();
            }            
        });
    }
}