import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorGUI extends JPanel {
    private TextField divisible;
    private TextField divisor;
    private TextField result;
    private JButton equals;


    CalculatorGUI() {
        divisible = new TextField(25);
        divisor = new TextField(25);
        result = new TextField(45);
        result.setEditable(false);

        equals = new JButton("=");
        equals.setBounds(10, 190, 50, 50);

        add(divisible);
        add(divisor);
        add(result);
        add(equals);

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    result.setText(Calculator.getResult(divisible.getText(), divisor.getText()));
                }catch (IllegalArgumentException | NullPointerException e){
                    result.setText(e.getMessage());
                }

            }
        });

    }
}
