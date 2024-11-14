
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.management.relation.Role;
import javax.swing.*;


public class Comp extends JFrame implements ActionListener{
    Container c;
    JLabel l1,l2;
    JRadioButton r1,r2;
    JComboBox cb;
    JTextArea ta,t1;
    Comp()
    {
        setTitle("example Components");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setLayout(null);
        l1=new JLabel("Name");
        l1.setBounds(20,50,80,30);
        c.add(l1);
        t1=new JTextArea();
        t1.setBounds(60,50,80,30);
        c.add(t1);
        l2=new JLabel("Gender");
        l2.setBounds(20,100,80,30);
        c.add(l2);
        ButtonGroup bg=new ButtonGroup();
        r1=new JRadioButton("Male");
        r1.setBounds(110,100,80,30);
        c.add(r1);
        r2=new JRadioButton("Female");
        r2.setBounds(190,100,80,30);
        c.add(r2);
        bg.add(r1);
        bg.add(r2);
        r2.setSelected(true);  //r2 by default selected
        JPasswordField p=new JPasswordField();
        p.setBounds(20,130,80,30);
        p.setEchoChar('*');   //password field type garda * auxa natra by default rakhxa
        c.add(p);
        JCheckBox c1=new JCheckBox("Advanced Java");
        c1.setBounds(20,160,150,30);
        JCheckBox c2=new JCheckBox("DWDM");
        c2.setBounds(20,190,80,30);
        JCheckBox c3=new JCheckBox("Management");
        c3.setBounds(20,220,100,30);
        c1.setSelected(true);
        c3.setEnabled(false);
        c.add(c3);
        c.add(c1);
        c.add(c2);
        JLabel l3=new JLabel("Country");
        l3.setBounds(20,250,80,30);
        c.add(l3);
        String []val={"Nepal","India","China","Pakistan","Bangladesh"};
        cb=new JComboBox(val);
        cb.setBounds(100,280,80,30);
        c.add(cb);
        ta=new JTextArea();
        ta.setBounds(100,320,200,200);
        c.add(ta);
        ta.setLineWrap(true);
        //cb.addActionListener(this);
        JButton b1=new JButton("Submit");
        b1.setBounds(10, 350, 80, 30);
        c.add(b1);
        b1.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
      ta.setText("Country-"+cb.getSelectedItem());
      String Name =t1.getText();
      String Country=ta.getText();
      String Gender=r1.getText();
      String Gender1=r2.getText();
      //String Course=c1.getText();



      try(BufferedWriter Writer=new BufferedWriter(new FileWriter("Reg.txt",true)))
      {
        Writer.write("Name="+Name);
        Writer.write("\nCountry="+Country);
        Writer.write("Gender="+Gender);
        Writer.write("Gender="+Gender1);
        //Writer.write("course="+Course);
      }
      catch(IOException ex)
      {
          System.out.println("Message"+ex.getMessage());
      }
          
    }
    public static void main(String[] args) {
        new Comp();
    }
    
}

