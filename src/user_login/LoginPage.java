package user_login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {

    private String email, password;
    private JPanel rootPanel = new JPanel();
    private JLabel l1 = new JLabel();
    private JButton loginButton = new JButton("LOGIN");
    private JTextField emailField = new JTextField();
    private JPasswordField passField = new JPasswordField();

    public LoginPage() {
        emailField.setBounds(60, 90, 220, 40);
        emailField.setFont(new Font(null, Font.PLAIN, 16));
        emailField.setBorder(BorderFactory.createCompoundBorder(
                emailField.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        passField.setBounds(60, 150, 220, 40);
        passField.setFont(new Font(null, Font.PLAIN, 16));
        passField.setBorder(BorderFactory.createCompoundBorder(
                passField.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        l1.setText("Welcome back!");
        l1.setFont(new Font(null, Font.PLAIN, 24));
        l1.setBounds(90, 20, 200, 40);

        loginButton.setBounds(90, 210, 160, 40);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        rootPanel.setBackground(Color.WHITE);
        rootPanel.setLayout(null);
        rootPanel.setBounds(0, 0, 360, 360);

        rootPanel.add(l1);
        rootPanel.add(emailField);
        rootPanel.add(passField);
        rootPanel.add(loginButton);

        this.add(rootPanel);

        this.setTitle("Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(360, 360);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent clicked) {
        if (clicked.getSource() == loginButton) {
            email = emailField.getText();
            password = String.valueOf(passField.getPassword());
            ProfilePage profilePage = new ProfilePage();
            if (profilePage.getEmail().equals(email) && profilePage.getPassword().equals(password)) {
                this.dispose();
                profilePage.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid 'Email' or 'Password.'", "Wrong Information", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}
