package clases;

import java.util.Arrays;

public class Tienda {
	Comodin[] comodinesEnVenta;
	private VidaEnVenta[] vidasEnVenta;
	public Tienda(Comodin[] comodinesEnVenta, VidaEnVenta[] vidasEnVenta) {
		super();
		this.comodinesEnVenta = comodinesEnVenta;
		this.vidasEnVenta = vidasEnVenta;
	}
	public Comodin[] getComodinesEnVenta() {
		return comodinesEnVenta;
	}
	public void setComodinesEnVenta(Comodin[] comodinesEnVenta) {
		this.comodinesEnVenta = comodinesEnVenta;
	}
	public VidaEnVenta[] getVidasEnVenta() {
		return vidasEnVenta;
	}
	public void setVidasEnVenta(VidaEnVenta[] vidasEnVenta) {
		this.vidasEnVenta = vidasEnVenta;
	}
	@Override
	public String toString() {
		return "Tienda [comodinesEnVenta= " + Arrays.toString(comodinesEnVenta) + ", vidasEnVenta= "
				+ Arrays.toString(vidasEnVenta) + "]";
	}
	
	
}
