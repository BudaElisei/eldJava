package Lab10;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame("My Form");


        frame.setSize(300, 200);

        frame.setLayout(new FlowLayout());

        // Create form elements
        JLabel nameLabel = new JLabel("Nume:");
        JTextField nameField = new JTextField(10);

        JLabel ageLabel = new JLabel("Varsta:");
        JTextField ageField = new JTextField(10);

        JLabel genderLabel = new JLabel("Gen:");
        JComboBox genderList = new JComboBox(new String[] {"Masculin", "Feminin"});

        JLabel favoriteColorLabel = new JLabel("Culoare preferata:");
        JTextField favoriteColorField = new JTextField(10);

        JLabel termsLabel = new JLabel("Accept terms and conditions:");
        JCheckBox termsCheckbox = new JCheckBox();

        // Add form elements to the frame
        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(ageLabel);
        frame.add(ageField);

        frame.add(genderLabel);
        frame.add(genderList);

        frame.add(favoriteColorLabel);
        frame.add(favoriteColorField);

        frame.add(termsLabel);
        frame.add(termsCheckbox);

        // Make the frame visible
        frame.setVisible(true);

        // Exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



