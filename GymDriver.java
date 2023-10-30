import javax.swing.*;
import java.awt.*;

public class GymDriver extends JFrame{

    final private Font mainFont = new Font("Arial", Font.BOLD, 18);
    JLabel lbBienvenida; 
    JTextField fieldTest;

    public void initialize(){

        /*******BIENVENIDA*******/
        lbBienvenida = new JLabel("ULTRAFIT", SwingConstants.CENTER);
        lbBienvenida.setFont(mainFont);

        JButton botonCliente = new JButton("Cliente");
        botonCliente.setFont(mainFont);

        JButton botonEmpleado = new JButton("Empleado");
        botonEmpleado.setFont(mainFont);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 10, 10));
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonsPanel.add(botonCliente);
        buttonsPanel.add(botonEmpleado);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(lbBienvenida, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        add(mainPanel);

        setTitle("ULTRAFIT");
        setSize(600,600);
        setMinimumSize(new Dimension(300, 300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] main){
        GymDriver myFrame = new GymDriver();
        myFrame.initialize();
    }
}