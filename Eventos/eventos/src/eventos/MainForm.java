package eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainForm {
    private JPanel taxPanel;
    private JButton buttonCalculate;
    private JTextField total;
    private JTextField tax;
    private JTextField price;

    public MainForm() {
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonCalculate.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            double p = Double.parseDouble(price.getText());
                            double t = Double.parseDouble(tax.getText());

                            double result = p + (p / 100 * t);
                            total.setText(Double.toString(result));
                        } catch(Exception a) {
                            System.out.println("Not a valid parameter");

                        }
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swintax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);
    }
}
