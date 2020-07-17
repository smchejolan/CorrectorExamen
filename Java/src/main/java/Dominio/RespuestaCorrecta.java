package Dominio;

public class RespuestaCorrecta implements TipoDePregunta{
	private Estado estado = Estado.pendiente;
	private String respuesta;

	@Override
	public void Responder(String respuesta) {
		if(this.respuesta.equals(respuesta)) {
			estado = Estado.correcta;
		}else{
			estado = Estado.mal;
		}
	}

	@Override
	public Dominio.Estado Estado() {
		// TODO Auto-generated method stub
		return estado;
	}

}
