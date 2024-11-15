
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

//MenuBar
public class MenuBar extends JFrame {
    JMenuBar menubar,m2;
    JMenu menu;
    JMenuItem i1,i2,i3,i4;
    Container c;
  
    public MenuBar()
    {
        setTitle("ItemListener Example");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //c=this.getContentPane();
        setLayout(null);
        menubar=new JMenuBar();
        JMenu  menu=new JMenu("File");
        JMenu  m2=new JMenu("Edit");
        menubar.add(menu);
        menubar.add(m2);
        i1=new JMenuItem("Open");
        i2=new JMenuItem("New");
        i3=new JMenuItem("Save as");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
                     

        setJMenuBar(menubar);
        setVisible(true);
        
                
    }
//    public void itemStateChanged(ItemEvent e)
//    {
//        String str=cb.getSelectedItem().toString();
//        //radio button,checkboc
//        //String str=cb.isSelectedItem().toString();
//        ta.setText(str);
//    }
    public static void main(String[] args) {
        new MenuBar();
    }
    
}
