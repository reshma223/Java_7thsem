//Jframe

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Example extends JFrame implements ActionListener
{
    Container C;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton addButton,b2;
    public Example()
    {
        setSize(500,700);
        setTitle("GUIProgram");
        setLocationRelativeTo(null);
        //setLocation(120,250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        C=this.getContentPane();
        C.setBackground(Color.red);
        C.setLayout(null);
        l1=new JLabel("First Number");
        l1.setBounds(50,50,100,20); //xaxis,yaxis,length,height
        C.add(l1);
        t1=new JTextField();
        t1.setBounds(130, 50, 80, 30);
        C.add(t1);
        
        l2=new JLabel("Second Number");
        l2.setBounds(50,100,100,20); //xaxis,yaxis,length,height
        C.add(l2);
        t2=new JTextField();
        t2.setBounds(145, 100, 80, 30);
        C.add(t2);
        
        addButton=new JButton("ADD");
        addButton.setBounds(100, 150, 80, 30);
        C.add(addButton);
        
        l3=new JLabel();
        l3.setBounds(20,200,100,20); //xaxis,yaxis,length,height
        C.add(l3);
        
        
        b2=new JButton("RESET");
        b2.setBounds(10, 150, 80, 30);
        C.add(b2);
        
        
        addButton.addActionListener(this);
        b2.addActionListener(this);
        ////
        setVisible(true);     //constructor ko last line ma lekhne
    }
    
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2){
            t1.setText("");
            t2.setText("");
        }
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a+b;
        l3.setText("Sum="+c);
    }
    public static void main(String[] args) {
        new Example();
    }
    
}
