package component;

import swing.Button;
import swing.MyPasswordField;
import swing.MyTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.miginfocom.swing.MigLayout;

public class PanelLoginAndRegister extends JLayeredPane {

    private JPanel login;
    private JPanel register;

    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();

        // Default to show register panel
        login.setVisible(false);
        register.setVisible(true);
    }

    private void initRegister() {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));

        JLabel label = new JLabel("CREATE ACCOUNT");
        label.setFont(new Font("Century Gothic", Font.BOLD, 30));
        label.setForeground(new Color(0, 50, 93));
        register.add(label);

        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/user.png")));
        txtUser.setHint("Name");
        register.add(txtUser, "w 60%");

        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/mail.png")));
        txtEmail.setHint("Email");
        register.add(txtEmail, "w 60%");

        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/pass.png")));
        txtPass.setHint("Password");
        register.add(txtPass, "w 60%");

        Button cmd = new Button();
        cmd.setBackground(new Color(0, 50, 93));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("SIGN UP");
        register.add(cmd, "w 40%, h 40");

        cmd.addActionListener(e -> {
            // For now, open AboutUsWindow (you can replace with registration logic)
            window.AboutUsWindow aboutUsWindow = new window.AboutUsWindow();
            aboutUsWindow.setVisible(true);
        });
    }

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));

        JLabel label = new JLabel("SIGN IN");
        label.setFont(new Font("Century Gothic", Font.BOLD, 30));
        label.setForeground(new Color(0, 50, 93));
        login.add(label);

        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/mail.png")));
        txtEmail.setHint("Email");
        login.add(txtEmail, "w 60%");

        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/pass.png")));
        txtPass.setHint("Password");
        login.add(txtPass, "w 60%");

        JButton cmdForget = new JButton("Forgot your password?");
        cmdForget.setForeground(new Color(100, 100, 100));
        cmdForget.setFont(new Font("Century Gothic", Font.BOLD, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);

        // Open ForgotPasswordWindow when forgot password clicked
        cmdForget.addActionListener(e -> {
            window.ForgotPasswordWindow forgotPassWindow = new window.ForgotPasswordWindow();
            forgotPassWindow.setVisible(true);
        });

        Button cmd = new Button();
        cmd.setBackground(new Color(0, 50, 93));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("SIGN IN");
        login.add(cmd, "w 40%, h 40");

        // TODO: Add your sign-in button action listener here, to authenticate and show Dashboard
    }

    public void showRegister(boolean show) {
        register.setVisible(show);
        login.setVisible(!show);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        login = new JPanel();
        register = new JPanel();

        setLayout(new CardLayout());

        login.setBackground(Color.WHITE);
        register.setBackground(Color.WHITE);

        add(login, "login");
        add(register, "register");
    }
}
