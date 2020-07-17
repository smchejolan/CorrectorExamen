package Dominio;

public class VoF implements TipoDePregunta {
	private Estado estado = Estado.pendiente;
	private Boolean respuesta;

	@Override
	public void Responder(String respuesta) {
		if(this.respuesta.equals(Boolean.parseBoolean(respuesta))) {
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
