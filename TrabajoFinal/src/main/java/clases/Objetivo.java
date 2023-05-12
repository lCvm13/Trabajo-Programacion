package clases;

public class Objetivo extends CosaConDescripcion{
	private short tiempo;

	public Objetivo(String nombre, String descripcion, short tiempo) {
		super(nombre, descripcion);
		this.tiempo = tiempo;
	}

	public short getTiempo() {
		return tiempo;
	}

	public void setTiempo(short tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Objetivo : "+super.toString()+"[tiempo= " + tiempo + "]";
	}
	
	

}
