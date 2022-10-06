package ejecutable;

import controlador.Controlador;
import modelo.Empleado;
import vista.VentanaPrincipal;



public class Test {

    public static void main(String[] args) 
    {
        Empleado miEmpleado = new Empleado(null, null, 0, 0);
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentana, miEmpleado);
            Empleado empleado1 = new Empleado();
            
           empleado1.setNomEmpleado("Javier David");
            //empleado1.setApeEmpleado("Niño Ruiz");
            System.out.println("Nombre: " + empleado1.getNomEmpleado());
            System.out.println("Apellido: " + empleado1.getApeEmpleado());
            //System.out.println("Numero Horas: " + empleado1.getNumHoras());
            System.out.println("Salario: " + empleado1.getSalario());
            System.out.println("Edad: " + empleado1.getFechaNacimiento());
            System.out.println(empleado1);

            System.out.println("--------------------------------------");
            System.out.println(empleado1);
            System.out.println("--------------------------------------");

           

            Empleado empleado2 = new Empleado("Anderson", "Fonseca", 72, 0, 2003);
            empleado2.pago(72, 0, 0);
            empleado2.edad(2003);
            System.out.println(empleado2);

            


    
}
}
