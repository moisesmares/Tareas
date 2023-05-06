import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton btnPanel1;
    private JLabel etqPanel1;
    private JPanel panel2;
    private  JLabel etqPanel2;
    private JPanel panel3;
    private JComboBox<String> combitoPanel3;
    private JPanel panel4;
    private GridLayout layaout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        layaout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layaout);
        // Panel 1
        panel1 = new JPanel();
        this.getContentPane().add(panel1, 0);
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.setBackground(new Color(47, 197, 176));
        btnPanel1 = new JButton("Presioname");
        panel1.add(btnPanel1);
        etqPanel1 = new JLabel("...");
        panel1.add(etqPanel1);
        btnPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etqPanel1.setText("Hola, presionaste boton del Panel 1");
            }
        });

        // Panel 2
        String urlImagen = "https://ichef.bbci.co.uk/images/ic/256xn/p04bsbrg.jpg";
        panel2 = new JPanel();
        panel2.setBackground(new Color(104, 22, 129));
        panel2.setLayout(new FlowLayout());
        // Aquí se carga la imagen haha

        try {

            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(imagen);
            etqPanel2 = new JLabel(imageIcon);
            panel2.add(etqPanel2);
            this.getContentPane().add(panel2, 1);

        } catch (MalformedURLException me){
            System.out.println("URL no valdia");

        } catch(Exception e){
            System.out.println("Error al cargar la imagen");
        }



        // Panel 3
        panel3 = new JPanel();
        panel3.setBackground(new Color(207, 214, 71));

        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4"};
        combitoPanel3 = new JComboBox<>(elementos);
        combitoPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(combitoPanel3.getSelectedIndex());
            }
        });
        panel3.add(combitoPanel3);
        this.getContentPane().add(panel3, 2);


        // Panel 4
        panel4 = new JPanel();
        this.getContentPane().add(panel4, 3);
        panel4.setBackground(new Color(179, 22, 10));

        this.setVisible(true);
    }
}
