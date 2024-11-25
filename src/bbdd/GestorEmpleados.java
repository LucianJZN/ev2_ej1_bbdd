package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import pojos.Empleado;
import utils.DBUtils;

public class GestorEmpleados {
	
	 /**
     * Funcion para obtener empleados mediante una consulta SQL.
     * @param sql Consulta SQL (por ejemplo, "SELECT * FROM empleados").
     * @return ArrayList de objetos Empleado.
     */
	public ArrayList<Empleado> obtenerEmpleados(String sql) {
		ArrayList<Empleado> empleados = new ArrayList<>();

		// Conexión a la base de datos
		try (Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql)) {

			// Procesar resultados
			while (resultSet.next()) {

				// Creamos el empleado
				Empleado empleado = new Empleado();

				// Asignamos los atributos al empleado
				empleado.setEmpNo(resultSet.getInt("emp_no"));
				empleado.setApellido(resultSet.getString("apellido"));
				empleado.setOficio(resultSet.getString("oficio"));

				int dir = resultSet.getInt("dir");
				if (resultSet.wasNull()) {
					empleado.setDir(0); // Valor predeterminado si dir es NULL
				} else {
					empleado.setDir(dir);
				}
				empleado.setFechaAlt(resultSet.getDate("fecha_alt").toLocalDate());
				empleado.setSalario(resultSet.getDouble("salario"));
				Double comision = resultSet.getDouble("comision");

				if (resultSet.wasNull()) {
					empleado.setComision(null); // Dejar como null si no tiene valor
				} else {
					empleado.setComision(comision);
				}
				empleado.setDepNo(resultSet.getInt("dept_no"));

				// Añadimos el objeto a la lista
				empleados.add(empleado);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return empleados;
	}
}