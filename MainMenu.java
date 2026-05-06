import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JFrame implements ActionListener {

    JMenuItem add, view, update, delete, exit;

    MainMenu() {
        setTitle("Employee Management System");
        setSize(500,400);

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        add = new JMenuItem("Add Employee");
        view = new JMenuItem("View Employee");
        update = new JMenuItem("Update Employee");
        delete = new JMenuItem("Delete Employee");
        exit = new JMenuItem("Exit");

        add.addActionListener(this);
        view.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        exit.addActionListener(this);

        menu.add(add);
        menu.add(view);
        menu.add(update);
        menu.add(delete);
        menu.add(exit);

        mb.add(menu);
        setJMenuBar(mb);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) new AddEmployee();
        if (e.getSource() == view) new ViewEmployee();
        if (e.getSource() == update) new UpdateEmployee();
        if (e.getSource() == delete) new DeleteEmployee();
        if (e.getSource() == exit) System.exit(0);
    }
}
