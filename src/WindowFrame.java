import javax.swing.*;

public class WindowFrame extends JFrame {
    public WindowFrame() {
        setSize(500, 200);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        add(new CalculatorGUI());
        setVisible(true);
    }
}
