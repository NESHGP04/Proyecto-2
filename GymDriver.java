import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GymDriver extends JFrame{

    final private Font mainFont = new Font("Arial", Font.BOLD, 18);
    JLabel lbBienvenida; 
    JTextField fieldTest;

    public void initialize(){
        /*******BIENVENIDA*******/
        // Crear el marco
        JFrame frame = new JFrame("Pantalla Principal");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);

        // Establecer la imagen de fondo
        ImageIcon backgroundIcon = new ImageIcon("background.png");
        JLabel background = new JLabel(backgroundIcon);
        frame.setContentPane(background);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Crear el título con una franja negra
        JLabel title = new JLabel("¡Bienvenido!", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        frame.add(title);

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
                framePreloginCliente(frame);
                frame.dispose();
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
        frame.add(Box.createRigidArea(new Dimension(0, 10)));
        frame.add(buttonPanel);

        // Hacer visible el marco
        frame.pack();
        frame.setVisible(true);
    }

    public void framePreloginCliente(JFrame mainFrame){
        /*******BIENVENIDA*******/
        // Crear el marco
        JFrame frame = new JFrame("Pantalla Principal");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);

        // Establecer la imagen de fondo
        ImageIcon backgroundIcon = new ImageIcon("background.png");
        JLabel background = new JLabel(backgroundIcon);
        frame.setContentPane(background);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Crear el título con una franja negra
        JLabel title = new JLabel("Cliente", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        frame.add(title);

        // Crear los botones
        JButton clientButton = new JButton("Iniciar sesión");
        clientButton.setBackground(Color.WHITE);
        clientButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));
        clientButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        ImageIcon clientIcon = new ImageIcon("cliente.png"); // Añade tu imagen aquí
        Image img = clientIcon.getImage();
        Image newimg = img.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen aquí
        clientButton.setIcon(new ImageIcon(newimg));

        clientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frameLoginCliente(frame);
                frame.dispose();
            }
        });

        JButton employeeButton = new JButton("Registrarse");
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
        frame.add(Box.createRigidArea(new Dimension(0, 10)));
        frame.add(buttonPanel);

        // Hacer visible el marco
        frame.pack();
        frame.setVisible(true);
    }

    public static void frameLoginCliente(JFrame mainFrame){
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);

        ImageIcon backgroundIcon = new ImageIcon("background.png");
        JLabel background = new JLabel(backgroundIcon);
        frame.setContentPane(background);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Crear el título con una franja negra
        JLabel title = new JLabel("Iniciar sesión", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        frame.add(title);

        
        // Crear un panel con opacidad baja
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0, 200)); // El último número es el nivel de transparencia (0-255)
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel correoLabel = new JLabel("Correo:");
        correoLabel.setForeground(Color.WHITE);
        correoLabel.setFont(new Font("Bahnschrift Light", Font.PLAIN, 36));
        correoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(correoLabel);

        JTextField correoField = new JTextField();
        correoField.setMaximumSize(new Dimension(500, 50));
        correoField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(correoField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Bahnschrift Light", Font.PLAIN, 36));
        passwordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setMaximumSize(new Dimension(500, 50));
        passwordField.setPreferredSize(new Dimension(500, 100));
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(passwordField);

        JButton loginButton = new JButton("Ingresar");
        loginButton.setBackground(Color.WHITE);
        loginButton.setPreferredSize(new Dimension(500, 100));
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.add(loginButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        // Obtener las dimensiones de la imagen
        int width = backgroundIcon.getIconWidth();
        int height = backgroundIcon.getIconHeight();

        // Establecer el tamaño de la ventana en función de las dimensiones de la imagen
        frame.setPreferredSize(new Dimension(width, height));
        frame.pack();
        
        // Crear el panel para los botones
        JPanel sizePanel = new JPanel();
        sizePanel.setOpaque(false);
        sizePanel.add(Box.createRigidArea(new Dimension(10, 0)));
        sizePanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir el panel de botones al marco
        frame.add(Box.createRigidArea(new Dimension(0, 10)));
        frame.add(panel);
        frame.add(buttonPanel);
        frame.add(sizePanel);

        // Hacer visible el marco
        frame.pack();
        frame.setVisible(true);
    }

    public static void frameRegisterCliente(JFrame mainFrame){
        JFrame frame = new JFrame("Register");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);

        ImageIcon backgroundIcon = new ImageIcon("background.png");
        JLabel background = new JLabel(backgroundIcon);
        frame.setContentPane(background);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Crear el título con una franja negra
        JLabel title = new JLabel("Registrarse", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        frame.add(title);

        
        // Crear un panel con opacidad baja
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0, 200)); // El último número es el nivel de transparencia (0-255)
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel correoLabel = new JLabel("Correo:");
        correoLabel.setForeground(Color.WHITE);
        correoLabel.setFont(new Font("Bahnschrift Light", Font.PLAIN, 36));
        correoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(correoLabel);

        JTextField correoField = new JTextField();
        correoField.setMaximumSize(new Dimension(500, 50));
        correoField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(correoField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Bahnschrift Light", Font.PLAIN, 36));
        passwordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setMaximumSize(new Dimension(500, 50));
        passwordField.setPreferredSize(new Dimension(500, 100));
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(passwordField);

        JButton loginButton = new JButton("Ingresar");
        loginButton.setBackground(Color.WHITE);
        loginButton.setPreferredSize(new Dimension(500, 100));
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.add(loginButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        // Obtener las dimensiones de la imagen
        int width = backgroundIcon.getIconWidth();
        int height = backgroundIcon.getIconHeight();

        // Establecer el tamaño de la ventana en función de las dimensiones de la imagen
        frame.setPreferredSize(new Dimension(width, height));
        frame.pack();
        
        // Crear el panel para los botones
        JPanel sizePanel = new JPanel();
        sizePanel.setOpaque(false);
        sizePanel.add(Box.createRigidArea(new Dimension(10, 0)));
        sizePanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir el panel de botones al marco
        frame.add(Box.createRigidArea(new Dimension(0, 10)));
        frame.add(panel);
        frame.add(buttonPanel);
        frame.add(sizePanel);

        // Hacer visible el marco
        frame.pack();
        frame.setVisible(true);
    }

    public static void frameCliente(JFrame mainFrame){
        JFrame clientFrame = new JFrame("Cliente");
        clientFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        clientFrame.setSize(400, 400);

        // Establecer la imagen de fondo
        ImageIcon backgroundIcon = new ImageIcon("background.png");
        JLabel background = new JLabel(backgroundIcon);
        clientFrame.setContentPane(background);
        clientFrame.setLayout(new BoxLayout(clientFrame.getContentPane(), BoxLayout.Y_AXIS));

        // Crear el título con una franja negra
        JLabel title = new JLabel("¡Bienvenido!", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        clientFrame.add(title);

        // Crear los botones
        JButton routinesButton = new JButton("Rutinas");
        routinesButton.setBackground(Color.WHITE);
        routinesButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        routinesButton.setIcon(new ImageIcon(new ImageIcon("rutina.png").getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))); // Añade tu imagen aquí
        routinesButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));

        JButton schedulesButton = new JButton("Horarios");
        schedulesButton.setBackground(Color.WHITE);
        schedulesButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        schedulesButton.setIcon(new ImageIcon(new ImageIcon("horario.png").getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))); // Añade tu imagen aquí
        schedulesButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));

        JButton foodButton = new JButton("Alimentacion");
        foodButton.setBackground(Color.WHITE);
        foodButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        foodButton.setIcon(new ImageIcon(new ImageIcon("alimentacion.png").getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))); // Añade tu imagen aquí
        foodButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));

        JButton pricesButton = new JButton("Precios");
        pricesButton.setBackground(Color.WHITE);
        pricesButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        pricesButton.setIcon(new ImageIcon(new ImageIcon("precio.png").getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))); // Añade tu imagen aquí
        pricesButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));

        JButton availabilityButton = new JButton("Disponibilidad");
        availabilityButton.setBackground(Color.WHITE);
        availabilityButton.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        availabilityButton.setIcon(new ImageIcon(new ImageIcon("disponibilidad.png").getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))); // Añade tu imagen aquí
        availabilityButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));

        JButton returnButton = new JButton("Regresar");
        returnButton.setBackground(Color.WHITE);
        returnButton.setPreferredSize(new Dimension(300, 100)); // Ajusta el tamaño horizontal aquí
        returnButton.setIcon(new ImageIcon(new ImageIcon("regresar.png").getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))); // Añade tu imagen aquí
        returnButton.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));

        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clientFrame.dispose(); // Cierra la ventana del cliente
                mainFrame.setVisible(true); // Muestra la ventana principal
            }
        });

        // Crear los paneles para los botones
        JPanel firstRowPanel = new JPanel();
        firstRowPanel.setOpaque(false);
        firstRowPanel.add(routinesButton);
        firstRowPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        firstRowPanel.add(schedulesButton);
        firstRowPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel secondRowPanel = new JPanel();
        secondRowPanel.setOpaque(false);
        secondRowPanel.add(foodButton);
        secondRowPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        secondRowPanel.add(pricesButton);
        secondRowPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel thirdRowPanel = new JPanel();
        thirdRowPanel.setOpaque(false);
        thirdRowPanel.add(availabilityButton);
        thirdRowPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir los paneles de botones al marco
        clientFrame.add(Box.createRigidArea(new Dimension(0, 10)));
        clientFrame.add(firstRowPanel);
        clientFrame.add(Box.createRigidArea(new Dimension(0, 10)));
        clientFrame.add(secondRowPanel);
        clientFrame.add(Box.createRigidArea(new Dimension(0, 10)));
        clientFrame.add(thirdRowPanel);
        clientFrame.add(returnButton, BorderLayout.WEST);

        // Hacer visible el marco
        clientFrame.pack();
        clientFrame.setVisible(true);
    }

    public static void main(String[] main){
        GymDriver myFrame = new GymDriver();
        myFrame.initialize();
    }
}