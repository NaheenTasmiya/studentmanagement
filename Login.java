import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JTextField user;
    JPasswordField pass;
    JButton login;

    Login() {
        setTitle("Login");
        setSize(300,200);
        setLayout(null);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(30,30,100,30);
        add(l1);

        user = new JTextField();
        user.setBounds(120,30,120,30);
        add(user);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(30,70,100,30);
        add(l2);

        pass = new JPasswordField();
        pass.setBounds(120,70,120,30);
        add(pass);

        login = new JButton("Login");
        login.setBounds(90,120,100,30);
        login.addActionListener(this);
        add(login);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?"
            );
            ps.setString(1, user.getText());
            ps.setString(2, new String(pass.getPassword()));

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                new MainMenu();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Login");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
