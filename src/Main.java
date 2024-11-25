import java.util.ArrayList;

import bbdd.GestorEmpleados;
import pojos.Empleado;

public class Main {

	public static void main(String[] args) {
		GestorEmpleados gestor = new GestorEmpleados();
		
		String sql = "SELECT * FROM empleados";
        ArrayList<Empleado> empleados = gestor.obtenerEmpleados(sql);

        // Imprimir los empleados
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
	}

}
