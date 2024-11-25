import java.util.ArrayList;

import bbdd.GestorEmpleados;
import pojos.Empleado;

public class Main {

	public static void main(String[] args) {
		GestorEmpleados gestor = new GestorEmpleados();
		
		//Más adelante podria agregar la opcion de introducir la consulta por uno mismo.
		String sql = "SELECT * FROM empleados";
		
        ArrayList<Empleado> empleados = gestor.obtenerEmpleados(sql);

        // Imprimir los empleados
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
	}

}
