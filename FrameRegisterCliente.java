import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameRegisterCliente extends JFrame {

    int fieldWidth = 500;
    int fieldHeight = 50;

    public FrameRegisterCliente(JFrame parentFrame) {
        initialize(parentFrame);
    }

    private JTextField createTextField(){
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(fieldWidth, fieldHeight));
        textField.setMaximumSize(new Dimension(fieldWidth, fieldHeight));
        textField.setFont(new Font("Bahnschrift Light", Font.PLAIN, 20));
        return textField;
    } 

    private JButton createButton(String buttonText, String buttonIcon, int x, int y){
        JButton button = new JButton(buttonText);
        button.setBackground(Color.WHITE);
        button.setPreferredSize(new Dimension(x, y)); 
        button.setIcon(new ImageIcon(new ImageIcon(buttonIcon).getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH)));
        button.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));
        return button;
    }

    private JLabel createLabel(String text){
        JLabel label = new JLabel(text);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Bahnschrift Light", Font.PLAIN, 25));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    } 

    private JCheckBox createCheckBox(String text){
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setForeground(Color.WHITE);
        checkBox.setOpaque(false); // Hacer el checkbox transparente
        checkBox.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el checkbox
        checkBox.setFont(new Font("Bahnschrift Light", Font.PLAIN, 25));
        return checkBox;
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

        JLabel title = new JLabel("Registrarse", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000));
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

        JLabel nombreLabel = createLabel("Nombre: ");
        formPanel.add(nombreLabel);

        JTextField nombreField = createTextField();
        formPanel.add(nombreField);

        JLabel apellidoLabel = createLabel("Apellido: ");
        formPanel.add(apellidoLabel);

        JTextField apellidoField = createTextField();
        formPanel.add(apellidoField);

        JLabel dpiLabel = createLabel("DPI: ");
        formPanel.add(dpiLabel);

        JTextField dpiField = createTextField();
        formPanel.add(dpiField);           

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
        
        // Crear las etiquetas y los checkbox para el objetivo
        JLabel objectiveLabel = createLabel("Objetivo: ");
        formPanel.add(objectiveLabel);

        JCheckBox loseWeightCheckBox = createCheckBox("Bajar peso");
        JCheckBox maintainWeightCheckBox = createCheckBox("Bajar peso");
        JCheckBox gainWeightCheckBox = createCheckBox("Subir peso");

        // Agrupar las casillas de verificación
        ButtonGroup objectiveGroup = new ButtonGroup();
        objectiveGroup.add(loseWeightCheckBox);
        objectiveGroup.add(maintainWeightCheckBox);
        objectiveGroup.add(gainWeightCheckBox);

        // Agregar las casillas al panel de casillas
        formPanel.add(loseWeightCheckBox);
        formPanel.add(maintainWeightCheckBox);
        formPanel.add(gainWeightCheckBox);

        // Crear las etiquetas y los checkbox para el tipo de cliente
        JLabel planLabel = createLabel("Plan: ");
        formPanel.add(planLabel);

        JCheckBox basicCheckBox = createCheckBox("Basico");
        JCheckBox fitnessCheckBox = createCheckBox("Fitness");
        JCheckBox nutriCheckBox = createCheckBox("Nutricional");
        JCheckBox premiumCheckBox = createCheckBox("Premium");

        ButtonGroup planGroup = new ButtonGroup();
        planGroup.add(basicCheckBox);
        planGroup.add(fitnessCheckBox);
        planGroup.add(nutriCheckBox);
        planGroup.add(premiumCheckBox);

        formPanel.add(basicCheckBox);
        formPanel.add(fitnessCheckBox);
        formPanel.add(nutriCheckBox);
        formPanel.add(premiumCheckBox);

        // Agregar el formPanel al panel principal (panel)
        panel.add(Box.createVerticalGlue()); // Esto agrega espacio entre la imagen y el formulario
        panel.add(formPanel);

        // Botón de ingreso
        JButton loginButton = createButton("Ingresar","cliente.png", 500, 100);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openClienteFrame(parentFrame);
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.add(loginButton);
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el botón

        // Añadir componentes al panel principal
        panel.add(Box.createVerticalGlue()); // Esto agrega espacio entre el formulario y el botón
        panel.add(buttonPanel);

        // Crear el panel de desplazamiento con el panel principal
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

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