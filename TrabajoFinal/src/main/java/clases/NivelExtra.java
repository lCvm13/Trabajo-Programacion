package clases;

import java.awt.image.BufferedImage;

public class NivelExtra extends Nivel{
	private byte puntuacion;
	private byte recompensa;
	
	
	
	
	public NivelExtra(Enemigo[] enemigos, byte numero, BufferedImage imagenFondo, Pista pista, byte puntuacion,
			byte recompensa) {
		super(enemigos, numero, imagenFondo, pista);
		this.puntuacion = puntuacion;
		this.recompensa = recompensa;
	}
	
	public byte getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(byte puntuacion) {
		this.puntuacion = puntuacion;
	}
	public byte getRecompensa() {
		return recompensa;
	}
	public void setRecompensa(byte recompensa) {
		this.recompensa = recompensa;
	}
	@Override
	public String toString() {
		return super.toString()+" puntuacion= " + puntuacion + ", recompensa= " + recompensa;
	}
	
	
}
