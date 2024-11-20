import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ProjTable2_AddUpdateDelete extends JFrame {
   private Container c;
   private  JTable tb;
   private JTextField t1, t2, t3;
   private JButton b1, b2, b3;
   public  ProjTable2_AddUpdateDelete(){
      setTitle("JTable");
      setSize(600, 600);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Object [][] data = {{101, "Chris", 35}, {102, "Tom", 45}, {103, "Harry", 25}};
      String []colname = {"RollName", "Name", "Age"};
      DefaultTableModel model = new DefaultTableModel(data, colname);
//      add(new JScrollPane((model)));
      tb = new JTable(model);
      setLayout(new GridLayout(3,1));
      JPanel panel = new JPanel();
      add(new JScrollPane(tb));
      add(new JPanel());
      add(panel);

      JTextField t1 = new JTextField();
      JTextField t2 = new JTextField();
      JTextField t3 = new JTextField();
      JButton b1 = new JButton("Add");
      JButton b2 = new JButton("Update");
      JButton b3 = new JButton("Delete");

   panel.setLayout(new GridLayout(3, 3));
      panel.add(new JLabel("RollNo"));
      panel.add(t1);
      panel.add(b1);

      panel.add(new JLabel("Name"));
      panel.add(t2);
      panel.add(b2);

      panel.add(new JLabel("Age"));
      panel.add(t3);
      panel.add(b3);

      b1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

            if(t1.getText().isEmpty()|| t2.getText().isEmpty()|| t3.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
            int rollno = Integer.parseInt(t1.getText());
            String name = t2.getText();
            int age = Integer.parseInt(t3.getText());

            Object [] newRow = {rollno, name, age};
            model.addRow(newRow);
               t1.setText(null);
               t2.setText(null);
               t3.setText(null);
         }
      }
   });
      
      b2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

            if(t1.getText().toString().isEmpty()|| t2.getText().toString().isEmpty()|| t3.getText().toString().isEmpty()){
               JOptionPane.showMessageDialog(null, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
            int rollno = Integer.parseInt(t1.getText().toString());
            String name = t2.getText().toString();
            int age = Integer.parseInt(t3.getText().toString());
            int row=tb.getSelectedRow();
            model.setValueAt(rollno, row, 0);
            model.setValueAt(name, row, 1);
            model.setValueAt(age, row, 2);

            
               t1.setText(null);
               t2.setText(null);
               t3.setText(null);
         }
      }
   });
      
      b3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

            if(tb.getSelectedRow()==-1)
            {
               JOptionPane.showMessageDialog(null, "Please select a row", "Message", JOptionPane.INFORMATION_MESSAGE);}
               int sel=JOptionPane.showConfirmDialog(null, "Are u sure?", "Confirm", JOptionPane.YES_NO_OPTION);
               if(sel==JOptionPane.YES_NO_OPTION){
               model.removeRow(tb.getSelectedRow());
               t1.setText(null);
               t2.setText(null);
               t3.setText(null);
}}});
        tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
      tb.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
          int rowindex = tb.getSelectedRow();
          int rollno = (int)model.getValueAt(rowindex,0 );
          String name = (String)model.getValueAt(rowindex,1 );
          int age = (int)model.getValueAt(rowindex,2 );
          t1.setText(String.valueOf(rollno));
          t2.setText(name);
          t3.setText(String.valueOf(age));
          
          
         }

        
      });


      setVisible(true);
      validate();

      
   }

   public static void main(String[] args) {
      new ProjTable2_AddUpdateDelete();
   }
   
}