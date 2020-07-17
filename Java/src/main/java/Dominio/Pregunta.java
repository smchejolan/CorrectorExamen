package Dominio;

public class Pregunta {
	private int peso;
	private TipoDePregunta tipo;
	
	public Pregunta(int peso, TipoDePregunta tipo) {
		this.peso = peso;
		this.tipo = tipo;
	}
	
	public int Peso() {
		return peso;
	}
	
	public Boolean Correcta() {
		return tipo.Estado().Correcta();
	}
	
	public void Responder(String respuesta){
		tipo.Responder(respuesta);
	}
}
