import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Doorsmeer {
    private JPanel panel1;
    private JTextField tfNama;
    private JTextField tfNomerplat;
    private JComboBox<String> cbJeni;
    private JComboBox<String> cbPaket;
    private JButton btnCekharga;
    private JTextField tfTotalharga;
    private JRadioButton rbDana;
    private JRadioButton rbQris;
    private JRadioButton rbCod;
    private JButton btnProses;
    private JButton btnBatal;
    private JLabel tFPlat;
    private JLabel cbJenis;

    String Nama,Jenis,Paket;
    int NomerPlat;




    public static void main(String[] args) {
        JFrame frame = new JFrame("Doorsmeer");
        frame.setContentPane(new Doorsmeer().tfNama);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Doorsmeer() {
        // Isi ComboBox jenis kendaraan hanya dengan "mobil"
//        cbJenis.addItem("mobil");

        // Isi ComboBox paket cucian
//        cbPaket.addItem("reguler");
//        cbPaket.addItem("premium");
//
//        // Group untuk radio button pembayaran
//        ButtonGroup group = new ButtonGroup();
//        group.add(rbDana);
//        group.add(rbQris);
//        group.add(rbCod);

        // Tombol Cek Harga
        btnCekHarga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String paket = cbPaket.getSelectedItem().toString();
                int harga = 0;

                if (paket.equals("reguler")) {
                    harga = 50000;
                } else if (paket.equals("premium")) {
                    harga = 70000;
                }

                tfTotal.setText("Rp " + String.format("%,d", harga) + ",00");
            }
        });

        // Tombol Proses
        btnProses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tfNama.getText();
                String plat = tfNomerplat.getText();
                String jenis = cbJenis.getSelectedItem().toString();
                String paket = cbPaket.getSelectedItem().toString();
                String bayar = rbDana.isSelected() ? "DANA"
                        : rbQris.isSelected() ? "QRIS"
                        : rbCod.isSelected() ? "COD"
                        : "Belum dipilih";
                String total = tfTotal.getText();

                JOptionPane.showMessageDialog(panelMain,
                        "Pesanan:\nNama: " + nama + "\nPlat: " + plat + "\nJenis: " + jenis +
                                "\nPaket: " + paket + "\nPembayaran: " + bayar + "\nTotal: " + total);
            }
        });

        // Tombol Batal
        btnBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfNama.setText("");
                tfNomerplat.setText("");
                cbJenis.setSelectedIndex(0);
                cbPaket.setSelectedIndex(0);
                tfTotal.setText("");
                group.clearSelection();
            }
        });
    }
}