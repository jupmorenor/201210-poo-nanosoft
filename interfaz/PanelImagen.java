package ud.poo.interfaz;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelImagen extends JPanel {
	
    public PanelImagen( )
    {
    	setLayout(null);
		setBorder( new LineBorder( Color.BLACK ) );
		this.setBounds(10, 20, 320, 410);
        JLabel imagen = new JLabel( );
        ImageIcon icono = new ImageIcon( "data/trans.png" );
       
        // La agrega a la etiqueta
        imagen = new JLabel( "" );
        imagen.setIcon( icono );
        add( imagen );
        imagen.setBounds(0, 0, 320, 410);

       // setBackground( Color.WHITE );
        setBorder( new LineBorder( Color.BLACK ) );
    }

}

