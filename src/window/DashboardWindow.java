package window;

import javax.swing.*;
import java.awt.*;

public class DashboardWindow extends JFrame {

    public DashboardWindow(String email, String appId, String appDate, String appStatus) {
        setTitle("EduRise - Dashboard");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only dashboard window
        setLayout(null);

        // Welcome Label
        JLabel welcomeLabel = new JLabel("Welcome, " + email + "!");
        welcomeLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
        welcomeLabel.setBounds(30, 30, 500, 30);
        add(welcomeLabel);

        // Application ID
        JLabel appIdLabel = new JLabel("Application ID: " + appId);
        appIdLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        appIdLabel.setBounds(30, 80, 500, 25);
        add(appIdLabel);

        // Application Date
        JLabel appDateLabel = new JLabel("Application Date: " + appDate);
        appDateLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        appDateLabel.setBounds(30, 120, 500, 25);
        add(appDateLabel);

        // Application Status
        JLabel appStatusLabel = new JLabel("Application Status: " + appStatus);
        appStatusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        appStatusLabel.setBounds(30, 160, 500, 25);
        add(appStatusLabel);

        setVisible(true);
    }
}
