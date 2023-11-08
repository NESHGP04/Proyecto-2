import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameLoginCliente extends JFrame {

    int fieldWidth = 400;
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
        setSize(400, 400);

        ImageIcon backgroundIcon = new ImageIcon("background.png");
        JLabel background = new JLabel(backgroundIcon);
        setContentPane(background);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Crear el título con una franja negra
        JLabel title = new JLabel("Iniciar sesión", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        add(title);

        
        // Crear un panel con opacidad baja
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0, 200)); // El último número es el nivel de transparencia (0-255)
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel correoLabel = createLabel("Correo: ");
        panel.add(correoLabel);

        JTextField correoField = createTextField();
        panel.add(correoField);

        JLabel passwordLabel = createLabel("Contraseña: ");
        panel.add(passwordLabel);

        JPasswordField passwordField = createTextField();
        panel.add(passwordField);

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

        // Obtener las dimensiones de la imagen
        int width = backgroundIcon.getIconWidth();
        int height = backgroundIcon.getIconHeight();

        // Establecer el tamaño de la ventana en función de las dimensiones de la imagen
        setPreferredSize(new Dimension(width, height));
        pack();
        
        // Crear el panel para los botones
        JPanel sizePanel = new JPanel();
        sizePanel.setOpaque(false);
        sizePanel.add(Box.createRigidArea(new Dimension(10, 0)));
        sizePanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir el panel de botones al marco
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(panel);
        add(buttonPanel);
        add(sizePanel);

        // Hacer visible el marco
        pack();
        setVisible(true);
    }

    private void openClienteFrame(JFrame parentFrame) {
        FrameCliente frameCliente = new FrameCliente(parentFrame);
        frameCliente.setVisible(true);
        this.setVisible(false);
    }
}
