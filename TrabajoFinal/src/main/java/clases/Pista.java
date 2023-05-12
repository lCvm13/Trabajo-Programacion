package clases;

public class Pista extends CosaConPrecio {
	private byte usosDisponibles;

	public Pista(String nombre, String descripcion, byte precio, byte usosDisponibles) {
		super(nombre, descripcion, precio);
		this.usosDisponibles = usosDisponibles;
	}

	public byte getUsosDisponibles() {
		return usosDisponibles;
	}

	public void setUsosDisponibles(byte usosDisponibles) {
		this.usosDisponibles = usosDisponibles;
	}

	@Override
	public String toString() {
		return super.toString()+" [usosDisponibles=" + usosDisponibles + "]";
	}
	
	
}
