package clases;

public class VidaEnVenta extends CosaConPrecio {
	private byte cantidad;

	public VidaEnVenta(String nombre, String descripcion, byte precio, byte cantidad) {
		super(nombre, descripcion, precio);
		this.cantidad = cantidad;
	}

	public byte getCantidad() {
		return cantidad;
	}

	public void setCantidad(byte cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return super.toString()+" [cantidad= " + cantidad;
	}

	
	
	
	
}
