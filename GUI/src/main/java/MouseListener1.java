
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

//MenuBar
public class MouseListener1 extends JFrame implements MouseListener  {
    JLabel l1;
    JTextArea ta;
    Container c;
    public MouseListener1()
    {
        setTitle("ItemListener Example");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setLayout(null);
        l1=new JLabel("Label");
        l1.setBounds(50,50,30,30);
        c.add(l1);
        l1.addMouseListener(this);
        ta=new  JTextArea();
        ta.setBounds(90,50,900,300);
        c.add(ta);
        
        setVisible(true);              
    }
    public static void main(String[] args) {
        new MouseListener1();
    }
    
    @Override
    public void mousePressed(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n Mouse is pressed");
    }
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n Mouse is clicked");
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n Mouse is released");
    }
    @Override
    public void mouseEntered(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n Mouse is enter");
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n Mouse is exit");
    }
    
}
