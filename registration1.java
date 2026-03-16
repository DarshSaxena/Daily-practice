import java.awt.GridLayout;
import javax.swing.*;

public class Student {
    public static void main(String[] args) {

        JFrame f = new JFrame("Student Registration");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);

        f.setLayout(new GridLayout(6, 2, 10, 10));

        // Name
        f.add(new JLabel("Enter Name:"));
        JTextField nameField = new JTextField();
        f.add(nameField);

        // SAP ID
        f.add(new JLabel("Enter SAP ID:"));
        JTextField sapField = new JTextField();
        f.add(sapField);

        // Roll No
        f.add(new JLabel("Enter Roll No.:"));
        JTextField rollField = new JTextField();
        f.add(rollField);

        // Semester
        f.add(new JLabel("Enter Semester:"));
        JTextField semField = new JTextField();
        f.add(semField);

        // Batch
        f.add(new JLabel("Enter Batch:"));
        JTextField batchField = new JTextField();
        f.add(batchField);

        // Submit Button
        f.add(new JLabel()); // Empty label to adjust layout
        JButton button = new JButton("Submit");
        f.add(button);

        // Optional: Button action to show entered data
        button.addActionListener(e -> {
            String info = "Name: " + nameField.getText()
                        + "\nSAP ID: " + sapField.getText()
                        + "\nRoll No: " + rollField.getText()
                        + "\nSemester: " + semField.getText()
                        + "\nBatch: " + batchField.getText();

            JOptionPane.showMessageDialog(f, info, "Submitted Data", JOptionPane.INFORMATION_MESSAGE);
        });

        f.setVisible(true);
    }
