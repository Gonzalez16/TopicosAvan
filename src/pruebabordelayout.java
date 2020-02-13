import javax.swing.*;
import java.awt.*;

public class pruebabordelayout extends JFrame {
    JPanel contenedor;
    public pruebabordelayout(){
        contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(new JButton("BOTON NORTE"), BorderLayout.NORTH);
        contenedor.add(new JButton("BOTON SUR"), BorderLayout.SOUTH);
        contenedor.add(new JButton("BOTON ESTE"), BorderLayout.EAST);
        contenedor.add(new JButton("BOTON OESTE"), BorderLayout.WEST);
        contenedor.add(new JButton("BOTON CENTRO"), BorderLayout.CENTER);
        add(contenedor);
        //Setting size
        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[] args) {
        pruebabordelayout p=new pruebabordelayout();

    }

}
