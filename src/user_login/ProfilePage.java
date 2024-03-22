package user_login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProfilePage extends JFrame {

    private String name, dept, password = "admin", email = "admin";
    private int id;
    private JPanel rootPanel = new JPanel();
    private JLabel nameLabel = new JLabel();
    private JLabel deptLabel = new JLabel();
    private JLabel idLabel = new JLabel();
    private JLabel imageLabel;
    private ImageIcon image;

    public ProfilePage() {

        image = new ImageIcon(new ImageIcon("image.png").getImage().getScaledInstance(100, 110, Image.SCALE_DEFAULT));
        imageLabel = new JLabel();
        imageLabel.setIcon(image);
        imageLabel.setBounds(115, 50, 100, 110);

        nameLabel = new JLabel("Name: " + "Rahat H. Himel");
        nameLabel.setBounds(60, 190, 200, 20);
        nameLabel.setFont(new Font(null, Font.PLAIN, 16));

        deptLabel = new JLabel("Dept: " + "CSE");
        deptLabel.setBounds(60, 220, 200, 20);
        deptLabel.setFont(new Font(null, Font.PLAIN, 16));

        idLabel = new JLabel("ID: " + "231902018");
        idLabel.setBounds(60, 250, 200, 20);
        idLabel.setFont(new Font(null, Font.PLAIN, 16));

        rootPanel.setBackground(Color.WHITE);
        rootPanel.setLayout(null);
        rootPanel.setBounds(0, 0, 360, 360);

        rootPanel.add(nameLabel);
        rootPanel.add(deptLabel);
        rootPanel.add(idLabel);
        rootPanel.add(imageLabel);

        this.add(rootPanel);

        this.setTitle("Profile");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(360, 360);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
