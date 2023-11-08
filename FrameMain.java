import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameMain extends JFrame {

    public FrameMain() {
        initialize();
    }

    private void initialize() {
        /*******BIENVENIDA*******/
        // Crear el marco
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 400);

        // Establecer la imagen de fondo
        ImageIcon backgroundIcon = new ImageIcon("background.png");
        JLabel background = new JLabel(backgroundIcon);
        setContentPane(background);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Crear el título con una franja negra
        JLabel title = new JLabel("¡Bienvenido!", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        add(title);

        // Crear los botones
        JButton clientButton = new JButton("Cliente");
        clientButton.setBackground(Color.WHITE);
        clientButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));
        clientButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        ImageIcon clientIcon = new ImageIcon("cliente.png"); // Añade tu imagen aquí
        Image img = clientIcon.getImage();
        Image newimg = img.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen aquí
        clientButton.setIcon(new ImageIcon(newimg));

        clientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPreLoginClienteFrame();
                //frame.dispose();
            }
        });

        JButton employeeButton = new JButton("Empleado");
        employeeButton.setBackground(Color.WHITE);
        employeeButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));
        employeeButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        ImageIcon employeeIcon = new ImageIcon("empleado.png"); // Añade tu imagen aquí
        img = employeeIcon.getImage();
        newimg = img.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen aquí
        employeeButton.setIcon(new ImageIcon(newimg));

        // Crear el panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.add(clientButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.add(employeeButton);
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir el panel de botones al marco
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(buttonPanel);

        // Hacer visible el marco
        pack();
        setVisible(true);
    }

    private void openPreLoginClienteFrame() {
        FramePreLoginCliente framePreloginCliente = new FramePreLoginCliente(this);
        framePreloginCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        framePreloginCliente.setVisible(true);
        this.dispose();
    }
}
