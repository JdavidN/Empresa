package controlador;

import modelo.Empleado;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener
{
    //----------------
    //Atributos
    //----------------
    private VentanaPrincipal venPrin;
    private Empleado model;

    //----------------
    //Metodos
    //----------------

    //Medodo constructor
    public Controlador(VentanaPrincipal pVenPrin, Empleado pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.btCrear.addActionListener(this);
        this.venPrin.miPanelOperaciones.btBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btSalir.addActionListener(this);
    }

    //Metodo de atención de eventos
    public void actionPerformed(ActionEvent ae)
    {   
        //Identificar el comando generado (hallarMayor, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("Crear"))
        {

        }
        if(comando.equals("borrar"))
        {

        }
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}