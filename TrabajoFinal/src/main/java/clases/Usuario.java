package clases;

import java.util.Arrays;

public class Usuario {
	private byte progreso;
	private byte vidas;
	private short monedas;
	private Comodin [] comodines;
	private String usuario;
	private String contraseña;
	public Usuario(byte progreso, byte vidas, short monedas, Comodin[] comodines, String usuario, String contraseña) {
		super();
		this.progreso = progreso;
		this.vidas = vidas;
		this.monedas = monedas;
		this.comodines = comodines;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	public byte getProgreso() {
		return progreso;
	}
	public void setProgreso(byte progreso) {
		this.progreso = progreso;
	}
	public byte getVidas() {
		return vidas;
	}
	public void setVidas(byte vidas) {
		this.vidas = vidas;
	}
	public short getMonedas() {
		return monedas;
	}
	public void setMonedas(short monedas) {
		this.monedas = monedas;
	}
	public Comodin[] getComodines() {
		return comodines;
	}
	public void setComodines(Comodin[] comodines) {
		this.comodines = comodines;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Override
	public String toString() {
		return "Usuario [progreso=" + progreso + ", vidas=" + vidas + ", monedas=" + monedas + ", comodines="
				+ Arrays.toString(comodines) + ", usuario=" + usuario + ", contraseña=" + contraseña + "]";
	}
	
	
	
	
}
