package window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import window.RegistrationFormWindow;  // <-- added import

public class AboutUsWindow extends JFrame {

    public AboutUsWindow() {
        setTitle("About Us - EduRise");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new ImageBackgroundPanel();
        mainPanel.setLayout(null);
        setContentPane(mainPanel);

        Font headingFont = new Font("Century Gothic", Font.BOLD, 36);

        JLabel shadowLabel = new JLabel("ABOUT US", SwingConstants.CENTER);
        shadowLabel.setFont(headingFont);
        shadowLabel.setForeground(new Color(0, 0, 0, 150));
        shadowLabel.setBounds(2, 32, getWidth(), 50);
        shadowLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(shadowLabel);

        JLabel titleLabel = new JLabel("ABOUT US", SwingConstants.CENTER);
        titleLabel.setFont(headingFont);
        titleLabel.setForeground(Color.decode("#00325D"));
        titleLabel.setBounds(0, 30, getWidth(), 50);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(titleLabel);

        JButton agreeButton = new JButton("I Agree and Continue") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
                super.paintComponent(g);
                g2.dispose();
            }

            @Override
            protected void paintBorder(Graphics g) {}
        };

        agreeButton.setBounds(320, 510, 260, 45);
        agreeButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
        agreeButton.setForeground(Color.WHITE);
        agreeButton.setBackground(Color.decode("#00325D"));
        agreeButton.setFocusPainted(false);
        agreeButton.setBorderPainted(false);
        agreeButton.setContentAreaFilled(false);
        agreeButton.setOpaque(false);
        agreeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(agreeButton);

        // Updated action to open RegistrationFormWindow
        agreeButton.addActionListener((ActionEvent e) -> {
            new RegistrationFormWindow().setVisible(true);
            dispose();
        });
    }

    class ImageBackgroundPanel extends JPanel {
        private Image backgroundImage;

        public ImageBackgroundPanel() {
            backgroundImage = new ImageIcon(getClass().getResource("/icon/aboutbg.png")).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AboutUsWindow().setVisible(true));
    }
}
