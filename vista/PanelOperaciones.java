package vista;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{

    //Atributos
    public JButton btCrear;
    public JButton btBorrar;
    public JButton btSalir;
    
    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //crear y Agregar boton HallarMAyor
        btCrear = new JButton("Empleado");
        btCrear.setBounds(7,20, 145, 20);
        btCrear.setActionCommand("hallarMayor");
        this.add(btCrear);

        //crear y Agregar boton HallarBorrar
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(160,20, 145, 20);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);

        //crear y Agregar boton HallarSalir
        btSalir = new JButton("Salir");
        btSalir.setBounds(315,20, 145, 20);
        btSalir.setActionCommand("salir");
        this.add(btSalir);



         
        
        //Borde  y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
    }


}
