package Java_homework.Java_homework.Calculator.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private JTextField inputField;
    private String a = "0";
    private String b;
    private String s;
    private String operation;

    public ButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        s = e.getActionCommand();

        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            operation = s;
            a = inputField.getText();
            inputField.setText("");
        } else if (s.equals("=")) {
            b = inputField.getText();

            if (a.isEmpty()) {
                a = "0";
            }

            if (b.isEmpty()) {
                b = "0";
            }

            if (operation == null) {
                inputField.setText("" + b);
            } else if (operation.equals("+")) {
                double sum = Double.parseDouble(a) + Double.parseDouble(b);
                inputField.setText("" + sum);
            } else if (operation.equals("-")) {
                double sum = Double.parseDouble(a) - Double.parseDouble(b);
                inputField.setText("" + sum);
            } else if (operation.equals("*")) {
                double sum = Double.parseDouble(a) * Double.parseDouble(b);
                inputField.setText("" + sum);
            } else if (operation.equals("/")) {
                if (Double.parseDouble(b) != 0) {
                    double sum = Double.parseDouble(a) / Double.parseDouble(b);
                    inputField.setText("" + sum);
                } else {
                    inputField.setText("На 0 делить нельзя!");
                    a = "0";
                    b = "";
                }
            }
            operation = null;
        } else {
            inputField.setText(inputField.getText() + s);
        }
    }
}
