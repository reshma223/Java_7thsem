
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//Item Event -Combo Box
public class MyFrameComboBox extends JFrame implements ItemListener {
    JComboBox cb;
    JTextArea ta;
    Container c;
  
    public MyFrameComboBox()
    {
        setTitle("ItemListener Example");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setLayout(null);
        String []data={"Nepal","USA","India"};
        cb=new JComboBox(data);
        cb.setBounds(30,50,100,80);
        c.add(cb);
        cb.addItemListener(this);
        ta=new JTextArea();
        ta.setBounds(130,50,300,300);
        c.add(ta);
        setVisible(true);
        
                
    }
    public void itemStateChanged(ItemEvent e)
    {
        String str=cb.getSelectedItem().toString();
        //radio button,checkboc
        //String str=cb.isSelectedItem().toString();
        ta.setText(str);
    }
    public static void main(String[] args) {
        new MyFrameComboBox();
    }
    
}
