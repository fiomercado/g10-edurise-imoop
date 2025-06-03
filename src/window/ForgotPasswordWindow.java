package window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPasswordWindow extends JFrame {
    private JTextField emailField;
    private JPasswordField newPasswordField;
    private JButton updateBtn;

    public ForgotPasswordWindow() {
        setTitle("Forgot Password - EduRise");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(30, 30, 100, 25);
        add(lblEmail);

        emailField = new JTextField();
        emailField.setBounds(140, 30, 200, 25);
        add(emailField);

        JLabel lblNewPass = new JLabel("New Password:");
        lblNewPass.setBounds(30, 80, 100, 25);
        add(lblNewPass);

        newPasswordField = new JPasswordField();
        newPasswordField.setBounds(140, 80, 200, 25);
        add(newPasswordField);

        updateBtn = new JButton("Update Password");
        updateBtn.setBounds(140, 130, 150, 30);
        add(updateBtn);

        // When button clicked, do something (for now, just show message)
        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String newPass = new String(newPasswordField.getPassword());

                // TODO: Add your password update logic here (DB update)

                if (email.isEmpty() || newPass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                } else {
                    JOptionPane.showMessageDialog(null, "Password updated successfully for " + email);
                    dispose(); // close window after update
                }
            }
        });

        setVisible(true);
    }
}
