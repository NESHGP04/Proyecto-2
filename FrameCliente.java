import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameCliente extends JFrame {

    public FrameCliente(JFrame parentFrame) {
        initialize(parentFrame);
    }

    private JButton createButton(String buttonText, String buttonIcon){
        JButton button = new JButton(buttonText);
        button.setBackground(Color.WHITE);
        button.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        button.setIcon(new ImageIcon(new ImageIcon(buttonIcon).getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))); // Añade tu imagen aquí
        button.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));
        return button;
    }

    private void initialize(JFrame parentFrame) {
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
        JButton routinesButton = createButton("Rutinas", "rutina.png");

        JButton schedulesButton = createButton("Horarios", "horario.png");

        JButton foodButton = createButton("Alimentacion", "alimentacion.png");

        JButton pricesButton = createButton("Precios", "precio.png");

        JButton availabilityButton = createButton("Disponibilidad", "disponibilidad.png");

        JButton returnButton = createButton("Regresar", "regresar.png");

        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana del cliente
                parentFrame.setVisible(true); // Muestra la ventana principal
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
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(firstRowPanel);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(secondRowPanel);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(thirdRowPanel);
        add(returnButton, BorderLayout.WEST);

        // Hacer visible el marco
        pack();
        setVisible(true);
    }
}
