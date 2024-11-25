package pojos;

import java.time.LocalDate;

public class Empleado {
	private int empNo;
	private String apellido;
	private String oficio;
	private int dir;
	private LocalDate fechaAlt;
	private Double salario;
	private Double comision;
	private int depNo;
	
	//Getters y Setters
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	public int getDir() {
		return dir;
	}
	public void setDir(int dir) {
		this.dir = dir;
	}
	public LocalDate getFechaAlt() {
		return fechaAlt;
	}
	public void setFechaAlt(LocalDate fechaAlt) {
		this.fechaAlt = fechaAlt;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Double getComision() {
		return comision;
	}
	public void setComision(Double comision) {
		this.comision = comision;
	}
	public int getDepNo() {
		return depNo;
	}
	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}

	//To String
	@Override
	public String toString() {
		return "Empleado [Nombre = " + empNo + ", Apellido = " + apellido + ", Oficio = " + oficio + ", Direccion = " + dir
				+ ", Fecha de Alta = " + fechaAlt + ", Salario = " + salario + ", Comision = " + comision + ", Num. Departamento = " + depNo
				+ "]";
	}
}
