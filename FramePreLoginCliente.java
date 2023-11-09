import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FramePreLoginCliente extends JFrame {

    public FramePreLoginCliente(JFrame parentFrame) {
        initialize(parentFrame);
    }

    private void initialize(JFrame parentFrame) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Obtener las dimensiones de la imagen
        ImageIcon backgroundIcon = new ImageIcon("background.png");
        int width = backgroundIcon.getIconWidth();
        int height = backgroundIcon.getIconHeight();
        setPreferredSize(new Dimension(width, height));

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(width, height)); // Establecer el tamaño del panel igual al de la imagen

        // Crear el título con una franja negra
        JLabel title = new JLabel("Cliente", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        panel.add(title);

        // Crear los botones
        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBackground(Color.WHITE);
        loginButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));
        loginButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        ImageIcon clientIcon = new ImageIcon("cliente.png"); // Añade tu imagen aquí
        Image img = clientIcon.getImage();
        Image newimg = img.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen aquí
        loginButton.setIcon(new ImageIcon(newimg));

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openLoginClienteFrame(parentFrame);
                dispose();
            }
        });

        JButton registerButton = new JButton("Registrarse");
        registerButton.setBackground(Color.WHITE);
        registerButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));
        registerButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        ImageIcon employeeIcon = new ImageIcon("empleado.png"); // Añade tu imagen aquí
        img = employeeIcon.getImage();
        newimg = img.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen aquí
        registerButton.setIcon(new ImageIcon(newimg));

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRegisterClienteFrame(parentFrame);
                dispose();
            }
        });

        // Crear el panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.add(loginButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.add(registerButton);
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir el panel de botones al marco
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(buttonPanel);

        // Crear el panel de desplazamiento con el panel principal
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        //Mostrar marco
        getContentPane().add(scrollPane);
        pack();
        setVisible(true);
    }

    private void openLoginClienteFrame(JFrame parentFrame) {
        FrameLoginCliente frameLoginCliente = new FrameLoginCliente(parentFrame);
        frameLoginCliente.setVisible(true);
        this.setVisible(false);
    }

    private void openRegisterClienteFrame(JFrame parentFrame) {
        FrameRegisterCliente frameRegisterCliente = new FrameRegisterCliente(parentFrame);
        frameRegisterCliente.setVisible(true);
        this.setVisible(false);
    }
}
