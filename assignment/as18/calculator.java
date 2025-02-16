import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener{
    JLabel j1,j2,j3;
    JTextField jt1,jt2,jt3;
    JButton b1,b2,b3,b4,b5;

    calculator(){
        JFrame jf = new JFrame();
        j1 = new JLabel("First Number:");
        j1.setBounds(30,30,150,40);
        jf.add(j1);
        jt1 = new JTextField();
        jt1.setBounds(230,30,150,40);
        jf.add(jt1);
        j2 = new JLabel("Second Number:");
        j2.setBounds(30,100,150,40);
        jf.add(j2);
        jt2 = new JTextField();
        jt2.setBounds(230,100,150,40);
        jf.add(jt2);
        j3 = new JLabel("Result:");
        j3.setBounds(30,170,150,40);
        jf.add(j3);;
        jt3 = new JTextField();
        jt3.setBounds(230,170,150,40);
        jf.add(jt3);
        b1 = new JButton("ADD");
        b1.setBounds(30,260,80,40);
        jf.add(b1);
        b2 = new JButton("SUB");
        b2.setBounds(140,260,80,40);
        jf.add(b2);
        b3 = new JButton("MUL");
        b3.setBounds(250,260,80,40);
        jf.add(b3);
        b4 = new JButton("DIV");
        b4.setBounds(360,260,80,40);
        jf.add(b4);
        b5 = new JButton("CLR");
        b5.setBounds(200,350,80,40);
        jf.add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        jf.setSize(600,600);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        //invoked when an action event occurs
        double x = Double.parseDouble(jt1.getText());
        double y = Double.parseDouble(jt2.getText());
        double z = 0;
        
        if(ae.getSource()==b1){
            z = x + y;
            jt3.setText(String.valueOf(z));
        }
        else if(ae.getSource()==b2){
            z = x - y;
            jt3.setText(String.valueOf(z));
        }
        else if(ae.getSource()==b3){
            z = x * y;
            jt3.setText(String.valueOf(z));
        }
        else if(ae.getSource()==b4){
            z = x / y;
            jt3.setText(String.valueOf(z));
        }
        else if(ae.getSource()==b5){
            jt1.setText("");
            jt2.setText("");
            jt3.setText("");
        }
    }
}

class cal{
    public static void main(String args[]){
        new calculator();
    }
}