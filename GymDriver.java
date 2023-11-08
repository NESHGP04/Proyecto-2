import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GymDriver extends JFrame{

    public static void main(String[] main){
        SwingUtilities.invokeLater(() -> {
            FrameMain mainFrame = new FrameMain();
            mainFrame.setVisible(true);
        });
    }
}