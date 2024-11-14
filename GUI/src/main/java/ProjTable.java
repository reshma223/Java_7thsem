
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ProjTable extends JFrame{
    private Cointainer c;
    private JTable tb;
    private JTextField t1,t2,t3;
    private JButton b1,b2,b3;
    public ProjTable()
    {
     setTitle("JTableExample");
     setSize(600,600);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     String [][]data={{"101","Ram","21"},{"102","Shyam","23"},{"103","Hari","25"}};
     //Object [][]data={{101,"Ram",21},{102,"Shyam",23},{103,"Hari",25}};
     String []colname={"RollNo","Name","Age"};
     DefaultTableModel model=new DefaultTableModel(data,colname);
     tb=new JTable(model);
     setLayout(new GridLayout(3,1));
     JPanel panel=new JPanel();
     add(new JScrollPane(tb));
     add (new JPanel());
     add(panel);
     t1=new JTextField();
     t2=new JTextField();
     t3=new JTextField();
     b1=new JButton("Add");
     b2=new JButton("Update");
     b3=new JButton("Delete");
     panel.setLayout(new GridLayout(3,3));
     panel.add(new JLabel("Roll No"));
     panel.add(t1);
     panel.add(b1);
     panel.add(new JLabel ("Name"));
     panel.add(t2);
     panel.add(b2);
     panel.add(new JLabel ("Age"));
     panel.add(t3);
     panel.add(b3);
     b1.addActionListener(new ActionListener()
     {
     public void actionPerformed(ActionEvent e)
     {
         if(t1.getText().toString().isEmpty()||t2.getText().toString().isEmpty()||t3.getText().toString().isEmpty())
         {
             JOptionPane.showMessageDialog(null,"Plz fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
         }
         else
         {
             int rollno=Integer.parseInt(t1.getText().toString());
             String name=t2.getText().toString();
             int age=Integer.parseInt(t3.getText().toString());
             Object[]newrow={rollno,name,age};
             model.addRow(newrow);
             t1.setText(null);
             t2.setText(null);
             t3.setText(null);
     }}
     });
     setVisible(true);
     validate();
     
    }
    public static void main(String[] args) {
        new ProjTable();
    }
}
