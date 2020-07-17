package Dominio;

public enum NotaAprobacion {
	cuatro(4), seis(6)
	;
	int nota;
	NotaAprobacion(int nota) {
		this.nota = nota;
	}
	public int nota() {
		return this.nota;
	}
}
