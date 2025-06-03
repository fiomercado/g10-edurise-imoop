package window;

import javax.swing.*;
import java.awt.*;

public class RegistrationFormWindow extends JFrame {
    public RegistrationFormWindow() {
        setTitle("EduRise Scholarship Registration");
        setSize(1366, 768);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Background Panel
        JPanel bgPanel = new JPanel() {
            Image bg = new ImageIcon(getClass().getResource("/icon/stubg.png")).getImage();

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int panelWidth = this.getWidth();
                int panelHeight = this.getHeight();
                int imgWidth = bg.getWidth(null);
                int imgHeight = bg.getHeight(null);

                double imgAspect = (double) imgWidth / imgHeight;
                double panelAspect = (double) panelWidth / panelHeight;

                int drawWidth, drawHeight;

                if (panelAspect > imgAspect) {
                    drawHeight = panelHeight;
                    drawWidth = (int) (panelHeight * imgAspect);
                } else {
                    drawWidth = panelWidth;
                    drawHeight = (int) (panelWidth / imgAspect);
                }

                int x = (panelWidth - drawWidth) / 2;
                int y = (panelHeight - drawHeight) / 2;

                g.drawImage(bg, x, y, drawWidth, drawHeight, this);
            }
        };
        bgPanel.setLayout(null);
        bgPanel.setBounds(0, 0, 1366, 768);

        // Move this down to the white area
        JLabel personalInfoLabel = new JLabel("PERSONAL INFORMATION");
        personalInfoLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
        personalInfoLabel.setBounds(80, 220, 400, 30);
        bgPanel.add(personalInfoLabel);

        JLabel fullNameLabel = new JLabel("Full Name");
        fullNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        fullNameLabel.setBounds(80, 270, 150, 25);
        bgPanel.add(fullNameLabel);

        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(80, 300, 200, 25);
        bgPanel.add(firstNameField);

        JTextField middleNameField = new JTextField();
        middleNameField.setBounds(290, 300, 200, 25);
        bgPanel.add(middleNameField);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(500, 300, 200, 25);
        bgPanel.add(lastNameField);

        JTextField suffixField = new JTextField();
        suffixField.setBounds(710, 300, 100, 25);
        bgPanel.add(suffixField);

        JLabel birthdateLabel = new JLabel("Birthdate");
        birthdateLabel.setFont(new Font("Arial", Font.BOLD, 16));
        birthdateLabel.setBounds(80, 340, 150, 25);
        bgPanel.add(birthdateLabel);

        String[] months = {"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
        JComboBox<String> monthBox = new JComboBox<>(months);
        monthBox.setBounds(80, 370, 130, 25);
        bgPanel.add(monthBox);

        String[] dates = new String[32];
        dates[0] = "Date";
        for(int i=1;i<=31;i++) dates[i] = String.valueOf(i);
        JComboBox<String> dateBox = new JComboBox<>(dates);
        dateBox.setBounds(220, 370, 80, 25);
        bgPanel.add(dateBox);

        String[] years = new String[51];
        years[0] = "Year";
        for(int i=1;i<=50;i++) years[i] = String.valueOf(2025-i);
        JComboBox<String> yearBox = new JComboBox<>(years);
        yearBox.setBounds(310, 370, 100, 25);
        bgPanel.add(yearBox);

        JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        ageLabel.setBounds(430, 340, 50, 25);
        bgPanel.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(430, 370, 50, 25);
        bgPanel.add(ageField);

        JLabel sexLabel = new JLabel("Sex");
        sexLabel.setFont(new Font("Arial", Font.BOLD, 16));
        sexLabel.setBounds(500, 340, 50, 25);
        bgPanel.add(sexLabel);

        String[] sexes = {"Sex","Male","Female"};
        JComboBox<String> sexBox = new JComboBox<>(sexes);
        sexBox.setBounds(500, 370, 100, 25);
        bgPanel.add(sexBox);

        JLabel houseLabel = new JLabel("House Type");
        houseLabel.setFont(new Font("Arial", Font.BOLD, 16));
        houseLabel.setBounds(80, 410, 150, 25);
        bgPanel.add(houseLabel);

        String[] houses = {"Select","Rental","Owned"};
        JComboBox<String> houseBox = new JComboBox<>(houses);
        houseBox.setBounds(80, 440, 150, 25);
        bgPanel.add(houseBox);

        JLabel schoolInfoLabel = new JLabel("SCHOOL INFORMATION");
        schoolInfoLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
        schoolInfoLabel.setBounds(80, 490, 400, 30);
        bgPanel.add(schoolInfoLabel);

        JButton nextButton = new JButton("NEXT");
        nextButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
        nextButton.setBackground(new Color(242, 189, 43));
        nextButton.setBounds(1230, 50, 100, 35);
        bgPanel.add(nextButton);

        add(bgPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationFormWindow();
    }
}
