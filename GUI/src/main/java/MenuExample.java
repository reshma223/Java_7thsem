//Exam
import javax.swing.*;

class MenuExample {

    MenuExample() {
        JFrame f = new JFrame("Menu and Menu Item Example");

        // Create a menu bar
        JMenuBar mb = new JMenuBar();

        // Create the main menu
        JMenu menu = new JMenu("Menu");

        // Create a submenu
        JMenu submenu = new JMenu("Sub Menu");

        // Create menu items
        JMenuItem i1 = new JMenuItem("Item 1");
        JMenuItem i2 = new JMenuItem("Item 2");
        JMenuItem i3 = new JMenuItem("Item 3");
        JMenuItem i4 = new JMenuItem("Item 4");

        // Add items to the submenu
        submenu.add(i3);
        submenu.add(i4);

        // Add items to the main menu
        menu.add(i1);
        menu.add(i2);
        menu.add(submenu);

        // Add the menu to the menu bar
        mb.add(menu);

        // Set the menu bar on the frame
        f.setJMenuBar(mb);

        // Frame settings
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
