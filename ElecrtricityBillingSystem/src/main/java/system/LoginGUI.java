package system;
import javax.swing.*;

public class LoginGUI {

    public LoginGUI() {

        JFrame f = new JFrame("Login");
        f.setSize(300, 200);
        f.setLayout(null);

        JLabel l1 = new JLabel("Email");
        l1.setBounds(20, 20, 80, 25);
        f.add(l1);

        JTextField email = new JTextField();
        email.setBounds(100, 20, 150, 25);
        f.add(email);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(20, 60, 80, 25);
        f.add(l2);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 60, 150, 25);
        f.add(pass);

        JButton login = new JButton("Login");
        login.setBounds(100, 100, 80, 30);
        f.add(login);

        login.addActionListener(e -> {

            String em = email.getText();
            String pw = new String(pass.getPassword());

            if (em.equals("admin@mail.com")) {
           /*  new AdminGUI(); */
                f.dispose();
            } else {
                JOptionPane.showMessageDialog(f, "Invalid Login");
            }
        });

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
