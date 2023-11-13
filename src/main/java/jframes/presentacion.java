package jframes;

/**
 *
 * @author eduar
 */
public class presentacion {
    // decidi hacerlo con jframe, las clases en datos implementan la logica
    // pero se muestran en jframes y no en joptionpane
    
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
    }
}
