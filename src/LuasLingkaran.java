import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LuasLingkaran {
    private JPanel LingkaranPanel;
    private JTextField tfjarijari;
    private JTextField tfluas;
    private JButton hitungButton;
    private JButton batalButton;
    private JButton keluarButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("LuasLingkaran");
        frame.setContentPane(new LuasLingkaran().LingkaranPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public LuasLingkaran(){
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double JariJari, Luas;
                double phi = 3.14;

                JariJari = Double.parseDouble(tfjarijari.getText());
                Luas = phi * (JariJari*JariJari);

                tfluas.setText(String.valueOf(Luas));
            }
        });
        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfjarijari.setText("");
                tfluas.setText("");
                tfjarijari.requestFocus();
            }
        });

        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);}
        });
    }
    private void createUIcomponents() {
        // TODE: place custom component creation code here
    }
    }