import javax.swing.*;

public class pruebaBoxLayout extends JFrame {
    JPanel contenedor;
    public pruebaBoxLayout(){
        contenedor = new JPanel();
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));
        for (int i = 0; i <5 ; i++){
            contenedor.add(new JButton("Boton"+ (i+1)));
        }
        add(contenedor);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        pruebaBoxLayout p = new pruebaBoxLayout();
    }
}
