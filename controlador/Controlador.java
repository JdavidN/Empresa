package controlador;

import modelo.Empleado;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;


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
        
        if(comando.equals("Empleado"))
        
        
        {
            String nomEmpleado = venPrin.miPanelEntradaDatos.getTfNomEmpleado();
            String apeEmpleado = venPrin.miPanelEntradaDatos.getTfNomEmpleado();
            int numHoras = Integer.parseInt(venPrin.miPanelEntradaDatos.getTfNumHoras());
            int fecNacimiento = Integer.parseInt(venPrin.miPanelEntradaDatos.getTfFechaNacimiento());

            //Creación del objeto tipo Carro
            model = new Empleado(nomEmpleado, apeEmpleado, numHoras, fecNacimiento );
                
            venPrin.miPanelResultado.mostrarResultado("Se ha creado un Empleado");
            venPrin.miPanelResultado.mostrarResultado("Su nombre es " + model.getNomEmpleado());
            venPrin.miPanelResultado.mostrarResultado("Su apellido es " + model.getApeEmpleado());
            venPrin.miPanelResultado.mostrarResultado("Sus Horas de trabajo en el mes (" + model.getNumHoras()+")" );
            venPrin.miPanelResultado.mostrarResultado("Su Edad " + model.getFechaNacimiento());
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