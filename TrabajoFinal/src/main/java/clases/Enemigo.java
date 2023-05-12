package clases;

public class Enemigo extends CosaConDescripcion{
	private boolean boss;
	private String condicion;
	private Imagen imagen;
	private Pregunta pregunta;
	private Objetivo objetivo;
	private Sonido sonido;
	public Enemigo(String nombre, String descripcion, boolean boss, String condicion, Imagen imagen, Pregunta pregunta,
			Objetivo objetivo, Sonido sonido) {
		super(nombre, descripcion);
		this.boss = boss;
		this.condicion = condicion;
		this.imagen = imagen;
		this.pregunta = pregunta;
		this.objetivo = objetivo;
		this.sonido = sonido;
	}
	public boolean isBoss() {
		return boss;
	}
	public void setBoss(boolean boss) {
		this.boss = boss;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public Imagen getImagen() {
		return imagen;
	}
	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}
	public Pregunta getPregunta() {
		return pregunta;
	}
	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}
	public Objetivo getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
	public Sonido getSonido() {
		return sonido;
	}
	public void setSonido(Sonido sonido) {
		this.sonido = sonido;
	}
	@Override
	public String toString() {
		return super.toString() + ", condicion= " + this.condicion + ", pregunta=" + pregunta
				+ ", objetivo=" + objetivo;
	}
	
	
}
