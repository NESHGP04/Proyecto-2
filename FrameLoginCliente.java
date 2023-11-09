import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameLoginCliente extends JFrame {

    int fieldWidth = 500;
    int fieldHeight = 50;

    public FrameLoginCliente(JFrame parentFrame) {
        initialize(parentFrame);
    }

    private JTextField createTextField(){
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(fieldWidth, fieldHeight));
        textField.setMaximumSize(new Dimension(fieldWidth, fieldHeight));
        textField.setFont(new Font("Bahnschrift Light", Font.PLAIN, 20));
        return textField;
    } 

    private JLabel createLabel(String text){
        JLabel label = new JLabel(text);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Bahnschrift Light", Font.PLAIN, 25));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
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
        JLabel title = new JLabel("Iniciar sesion - Cliente", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        panel.add(title);

        // Crear un panel para los elementos del formulario con un fondo opaco
        JPanel formPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(0, 0, 0, 200)); // Color de fondo opaco
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setOpaque(false); // Hacerlo transparente para mostrar el fondo pintado
        //formPanel.setPreferredSize(new Dimension(width, height)); // Tamaño igual al de la imagen

        JLabel correoLabel = createLabel("Correo: ");
        formPanel.add(correoLabel);

        JTextField correoField = createTextField();
        formPanel.add(correoField);

        JLabel passwordLabel = createLabel("Contraseña: ");
        formPanel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setMaximumSize(new Dimension(fieldWidth, fieldHeight));
        passwordField.setPreferredSize(new Dimension(fieldWidth, fieldHeight));
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);
        passwordField.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));
        formPanel.add(passwordField);

        JButton loginButton = new JButton("Ingresar");
        loginButton.setBackground(Color.WHITE);
        loginButton.setPreferredSize(new Dimension(500, 100));
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openClienteFrame(parentFrame);
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.add(loginButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        pack();
        
        // Crear el panel para los botones
        JPanel sizePanel = new JPanel();
        sizePanel.setOpaque(false);
        sizePanel.add(Box.createRigidArea(new Dimension(10, 0)));
        sizePanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir el panel de botones al marco
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(formPanel);
        panel.add(buttonPanel);

        // Crear el panel de desplazamiento con el panel principal
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Hacer visible el marco
        getContentPane().add(scrollPane);
        pack();
        setVisible(true);
    }

    private void openClienteFrame(JFrame parentFrame) {
        FrameCliente frameCliente = new FrameCliente(parentFrame);
        frameCliente.setVisible(true);
        this.setVisible(false);
    }
}
