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


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(lbBienvenida);

        add(mainPanel, BorderLayout.NORTH);

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