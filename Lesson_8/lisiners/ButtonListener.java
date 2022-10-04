package Lesson_8.lisiners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    String a = "", b = "", operation = "";
    int i;
    private JTextField inputField;

    public ButtonListener(JTextField inputField){
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        String s = e.getActionCommand();
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9'){
            if (operation.equals("")){
                a = a + s;
            }else {
                b = b + s;
            }
            inputField.setText(a + operation + b);
        }
        else if (s.charAt(0) == '=') {

            if (operation.equals('+')) {
                i = Integer.parseInt(a) + Integer.parseInt(b);
            } else if (operation.equals('-')){
                i = Integer.parseInt(a) - Integer.parseInt(b);
            }else if (operation.equals('/')){
                i = Integer.parseInt(a) / Integer.parseInt(b);
            }else if (operation.equals('*')){
                i = Integer.parseInt(a) * Integer.parseInt(b);
            }
            a = String.valueOf(i);
            inputField.setText(a);
            operation = b = "";
        }else {
            if (operation.equals(""))
                operation = s;
            inputField.setText(a + operation + b);

        }


    }
}
