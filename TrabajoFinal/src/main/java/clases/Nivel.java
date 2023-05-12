package clases;

import java.awt.image.BufferedImage;
import java.util.Arrays;

public class Nivel {
	private Enemigo[] enemigos;
	private byte numero;
	private BufferedImage imagenFondo;
	private Pista pista;
	
	
	
	
	public Nivel(Enemigo[] enemigos, byte numero, BufferedImage imagenFondo, Pista pista) {
		super();
		this.enemigos = enemigos;
		this.numero = numero;
		this.imagenFondo = imagenFondo;
		this.pista = pista;
	}
	public Enemigo[] getEnemigos() {
		return enemigos;
	}
	public void setEnemigos(Enemigo[] enemigos) {
		this.enemigos = enemigos;
	}
	public BufferedImage getImagenFondo() {
		return imagenFondo;
	}
	public void setImagenFondo(BufferedImage imagenFondo) {
		this.imagenFondo = imagenFondo;
	}
	@Override
	public String toString() {
		return "Nivel "+this.numero+"[enemigos=" + Arrays.toString(enemigos) + ", imagenFondo=" + imagenFondo + "]";
	}
	
		
}
