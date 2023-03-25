import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tabla extends JPanel implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public Tabla() {
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Nombre de usuario:"));
        usernameField = new JTextField();
        add(usernameField);
        add(new JLabel("Contraseña:"));
        passwordField = new JPasswordField();
        add(passwordField);
        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.addActionListener(this);
        add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        if (loginSuccessful(username, password)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
        } else {
            JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos");
        }
    }

    private boolean loginSuccessful(String username, String password) {
        String fileName = "ola.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String storedUsername = parts[0];
                String storedPassword = parts[1];
                if (storedUsername.equals(username) && storedPassword.equals(password)) {
                    return true;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel de inicio de sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tabla panel = new Tabla();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
