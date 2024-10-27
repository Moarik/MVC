import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");
    private JTextField result = new JTextField(10);

    public CalculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        calcPanel.add(new JLabel("Число 1:"));
        calcPanel.add(firstNumber);
        calcPanel.add(new JLabel("Число 2:"));
        calcPanel.add(secondNumber);
        calcPanel.add(addButton);
        calcPanel.add(subtractButton);
        calcPanel.add(multiplyButton);
        calcPanel.add(divideButton);
        calcPanel.add(new JLabel("Результат:"));
        calcPanel.add(result);

        this.add(calcPanel);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText());
    }

    public void setResult(String resultText) {
        result.setText(resultText);
    }

    public void addOperationListener(ActionListener listenForOperation) {
        addButton.addActionListener(listenForOperation);
        subtractButton.addActionListener(listenForOperation);
        multiplyButton.addActionListener(listenForOperation);
        divideButton.addActionListener(listenForOperation);
    }
}
