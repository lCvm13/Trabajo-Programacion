package clases;

public class CosaConPrecio extends CosaConDescripcion{
	private byte precio;
	
	
	public CosaConPrecio(String nombre, String descripcion, byte precio) {
		super(nombre, descripcion);
		this.precio = precio;
	}

	public byte getPrecio() {
		return precio;
	}

	public void setPrecio(byte precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return super.toString()+ " precio = "+this.precio;
	}
	
	
	
	
	
}
