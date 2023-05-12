package clases;

public class Pregunta  {
	
	private boolean screamer;
	private String enunciado;
	private String respuesta;
	public Pregunta(boolean screamer, String enunciado, String respuesta) {
		super();
		this.screamer = screamer;
		this.enunciado = enunciado;
		this.respuesta = respuesta;
	}
	public boolean isScreamer() {
		return screamer;
	}
	public void setScreamer(boolean screamer) {
		this.screamer = screamer;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	@Override
	public String toString() {
		return this.enunciado;
	}

	
	
	
	
}
