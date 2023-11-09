import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameHorarios extends JFrame {

    public FrameHorarios(JFrame parentFrame) {
        initialize(parentFrame);
    }

    private JButton createButton(String buttonText){
        JButton button = new JButton(buttonText);
        button.setBackground(Color.WHITE);
        button.setPreferredSize(new Dimension(500, 100)); // Ajusta el tamaño horizontal aquí
        button.setFont(new Font("Bahnschrift Light", Font.BOLD, 30));
        return button;
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
        JLabel title = new JLabel("¡Bienvenido!", SwingConstants.CENTER);
        title.setFont(new Font("Bahnschrift Light", Font.PLAIN, 72));
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2000)); // Ajusta el tamaño vertical aquí
        panel.add(title);

        // Crear los botones
        JButton routinesButton = createButton("Lunes");

        JButton schedulesButton = createButton("Martes");

        JButton foodButton = createButton("Miercoles");

        JButton pricesButton = createButton("Jueves");

        JButton availabilityButton = createButton("Viernes");

        JButton returnButton = createButton("Sabado");

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
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(firstRowPanel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(secondRowPanel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(thirdRowPanel);
        panel.add(returnButton, BorderLayout.WEST);

        // Crear el panel de desplazamiento con el panel principal
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Hacer visible el marco
        getContentPane().add(scrollPane);

        // Hacer visible el marco
        pack();
        setVisible(true);
    }
}
