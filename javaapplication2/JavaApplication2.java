package javaapplication2;

import javax.swing.*;

public class JavaApplication2 {

    private JLabel label;
    private JButton mybuttom;
    
    public static void main(String[] args) {
        JavaApplication2 mytestprogram = new JavaApplication2();
        mytestprogram.instalalabel();
    }

    public void instalalabel() {
        JFrame frame = new JFrame("Ejemplo basico");
        //label = new JLabel("Hola mundo");
        //label.setHorizontalAlignment(SwingConstants.CENTER);
        //frame.add(label);
        mybuttom = new JButton("Ejemplo basico");
        mybuttom.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(mybuttom);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
