package View;

import javax.swing.*;
import java.awt.*;

public class JView {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prova GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationByPlatform(true);
        frame.setVisible(true); //put at the end, first create than visible
    }

}
