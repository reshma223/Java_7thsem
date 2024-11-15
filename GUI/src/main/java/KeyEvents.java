import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class KeyEvents extends JFrame implements KeyListener {

    JLabel l1;
    JTextArea ta;
    Container c;

    public KeyEvents() {
        setTitle("Key Listener Example");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = this.getContentPane();
        c.setLayout(null);

        l1 = new JLabel("Press any key");
        l1.setBounds(10, 40, 100, 30);
        c.add(l1);

        ta = new JTextArea();
        ta.setBounds(90, 50, 300, 300);
        ta.addKeyListener(this);  // Add KeyListener to the JTextArea
        c.add(ta);

        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEvents();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText() + "\nKey Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText() + "\nKey Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText() + "\nKey Released: " + e.getKeyChar());
    }
}
