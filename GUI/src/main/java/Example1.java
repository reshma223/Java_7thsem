
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Example1 extends JFrame {
    JLabel l1;
    JTextField t1;
    Container C;
    Example1()
    {
        setTitle("Example");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        C=this.getContentPane();
        C.setLayout(null);
        //ImageIcon icon=new ImageIcon("C:\\Users\\Reshma Shrestha\\Desktop\\Screenshot_2.png");
        //l1=new JLabel();
        //l1=new JLabel(icon);
        Font f=new Font("Arial",Font.BOLD,20);
        l1=new JLabel("Example");
        //l1.setBounds(30, 100, icon.getIconWidth(),icon.getIconHeight());
        l1.setBounds(30, 100, 100, 20);
        l1.setFont(f);
        C.add(l1);
        t1=new JTextField("Example");
        t1.setBounds(30,130,200,50);
        t1.setForeground(Color.red);
        t1.setBackground(Color.blue);
        t1.setEditable(false);
        t1.setFont(f);
        C.add(t1);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Example1();
    }
    
}
