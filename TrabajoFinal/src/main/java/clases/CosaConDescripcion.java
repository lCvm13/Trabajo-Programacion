package clases;

public class CosaConDescripcion extends CosaConNombre {
	private String descripcion;

	

	public CosaConDescripcion(String nombre, String descripcion) {
		super(nombre);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Descripcion "+this.descripcion;
	}
	
	
}
