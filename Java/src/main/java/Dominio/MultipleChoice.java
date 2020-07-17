package Dominio;

import java.util.List;

public class MultipleChoice implements TipoDePregunta {
	private Estado estado = Estado.pendiente;
	private Integer respuesta;
	private List<String> opciones;

	@Override
	public void Responder(String respuesta) {
		if(this.respuesta.equals(Integer.parseInt(respuesta))) {
			estado = Estado.correcta;
		}else{
			estado = Estado.mal;
		}
	}
	
	public List<String> opciones(){
		return opciones;
	}

	@Override
	public Dominio.Estado Estado() {
		// TODO Auto-generated method stub
		return estado;
	}
}
