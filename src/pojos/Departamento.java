package pojos;

public class Departamento {
	private int deptNo;
	private String dNombre;
	private String loc;
	
	//Getters y Setters
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getdNombre() {
		return dNombre;
	}
	public void setdNombre(String dNombre) {
		this.dNombre = dNombre;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	//To String
	@Override
	public String toString() {
		return "Departamento [Numero departamento = " + deptNo + ", Nombre departamento = " + dNombre + ", Localizacion = " + loc + "]";
	}
}
