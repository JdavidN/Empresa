package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{

    //--------------
    //Atributos
    //-----------------
    private JLabel lbTitulo;
    private JLabel lbNomEmpleado;
    private JLabel lbApeEmpleado;
    private JLabel lbNumHoras;
    private JLabel lbFechaNacimiento;
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JTextField tfNomEmpleado;
    private JTextField tfApeEmpleado;
    private JTextField tfNumHoras;
    private JTextField tfFechaNacimiento;
    

    




    //-------------
    //Metodos
    //------------

    //Metodo COnstructor
    public PanelEntradaDatos()

    {
        //definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        // crear y agregar etiqueta para titulo
        lbTitulo = new JLabel("Empleado", JLabel.CENTER);
        lbTitulo.setForeground(Color.black);
        lbTitulo.setFont(new Font("Arial", Font.BOLD,18));
        lbTitulo.setBounds(10, 10, 465 , 20);
        this.add(lbTitulo);

        //creacion y edicion de imagen a panel.
        iImagen= new ImageIcon(getClass().getResource("/vista/empleado.jpg"));
        lbImagen =new JLabel(iImagen);
        lbImagen.setBounds(250, 40 , 200, 300);
        this.add(lbImagen);

        //Etiqueta Nombre
        lbNomEmpleado = new JLabel("Nombre =");
        lbNomEmpleado.setForeground(Color.black);
        lbNomEmpleado.setFont(new Font("Arial", Font.BOLD,15));
        lbNomEmpleado.setBounds(20, 50, 465 , 20);
        this.add(lbNomEmpleado);

        //Campo de Texto Nombre
        tfNomEmpleado = new JTextField();
        tfNomEmpleado.setForeground(Color.black);
        tfNomEmpleado.setFont(new Font("Arial", Font.BOLD,15));
        tfNomEmpleado.setBounds(100, 50, 100 , 20);
        this.add(tfNomEmpleado);

        //Etiqueta Apellido
        lbApeEmpleado = new JLabel("Apellido = ");
        lbApeEmpleado.setForeground(Color.black);
        lbApeEmpleado.setFont(new Font("Arial", Font.BOLD,15));
        lbApeEmpleado.setBounds(20, 100, 465 , 20);
        this.add(lbApeEmpleado);

        
         //Campo de Texto Apellido
        tfApeEmpleado = new JTextField();
        tfApeEmpleado.setForeground(Color.black);
        tfApeEmpleado.setFont(new Font("Arial", Font.BOLD,15));
        tfApeEmpleado.setBounds(100, 100, 100 , 20);
        this.add(tfApeEmpleado);
        

        //Etiqueta Numero Horas
        lbNumHoras = new JLabel("Horas =");
        lbNumHoras.setForeground(Color.black);
        lbNumHoras.setFont(new Font("Arial", Font.BOLD,15));
        lbNumHoras.setBounds(20, 150, 465 , 20);
        this.add(lbNumHoras);

        //Campo de Texto Numero Horas
        tfNumHoras = new JTextField();
        tfNumHoras.setForeground(Color.black);
        tfNumHoras.setFont(new Font("Arial", Font.BOLD,15));
        tfNumHoras.setBounds(80, 150, 100 , 20);
        this.add(tfNumHoras);

         //Etiqueta Fecha Nacimiento
         lbFechaNacimiento = new JLabel("Nacimeinto =");
         lbFechaNacimiento.setForeground(Color.black);
         lbFechaNacimiento.setFont(new Font("Arial", Font.BOLD,15));
         lbFechaNacimiento.setBounds(20, 200, 465 , 20);
         this.add(lbFechaNacimiento);
 
         //Campo de Texto Fecha Nacimiento
         tfFechaNacimiento = new JTextField();
         tfFechaNacimiento.setForeground(Color.black);
         tfFechaNacimiento.setFont(new Font("Arial", Font.BOLD,15));
         tfFechaNacimiento.setBounds(120, 200, 100 , 20);
         this.add(tfFechaNacimiento);


        //Borde  y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.black);
        this.setBorder(borde);
    }

    //ACCESO A LA iNFORMACION
    public String getTfNomEmpleado()
    {
        return tfNomEmpleado.getText();
    }

    public String getTApeEmpleado()
    {
        return tfApeEmpleado.getText();
    }

    public String getTfNumHoras()
    {
        return tfNumHoras.getText();
    }

    public String getTfFechaNacimiento()
    {
        return tfFechaNacimiento.getText();
    }

    //Borrar caja de textos
    
    public void borrar()
        {
            tfNomEmpleado.setText("");
            tfApeEmpleado.setText("");
            tfNumHoras.setText("");
            tfFechaNacimiento.setText("");
        }
    
}

  