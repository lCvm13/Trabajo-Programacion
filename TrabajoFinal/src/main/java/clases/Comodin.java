package clases;

public class Comodin extends CosaConPrecio {
	
	private String funcion;
	
	

	public Comodin(String nombre, String descripcion, byte precio, String funcion) {
		super(nombre, descripcion, precio);
		this.funcion = funcion;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	@Override
	public String toString() {
		return super.toString()+" Funcion de este comodín: " + this.funcion;
	}
	
	
	
}
