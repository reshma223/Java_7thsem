
   import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;

public class BorderLayoutExample{
          public static void main(String []args)
          {
              JFrame jf=new JFrame("Border Layout Example");
              jf.setBounds(300,200,500,500);
                  
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              Container c=jf.getContentPane();
             JButton b1=new JButton("PAGE_START");
JButton b2=new JButton("PAGE_END");
JButton b3=new JButton ("LINE_START");
JButton b4=new JButton("LINE_END");
JButton b5=new JButton("CENTER");
//c.setLayout(null);
//BorderLayout b=new BorderLayout();
c.setLayout(new BorderLayout(20,30));
c.add(b1,BorderLayout.PAGE_START);// we can also use c.add(b4,BorderLayout.NORTH);
c.add(b2,BorderLayout.PAGE_END);
c.add(b3,BorderLayout.LINE_START);
c.add(b4,BorderLayout.LINE_END);
c.add(b5,BorderLayout.CENTER);
//b1.setBounds(20,30,80,30);
//b2.setBounds(100,30,80,30);
//b3.setBounds(180,30,80,30);
//b4.setBounds(260,30,80,30);
//b5.setBounds(340,30,80,30);
//c.add(b1);
//c.add(b2);
//c.add(b3);
//c.add(b4);
//c.add(b5);
jf.setVisible(true);
}
} 

