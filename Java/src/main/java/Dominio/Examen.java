package Dominio;

import java.util.List;

public class Examen {
	public Alumno alumno;
	public NotaAprobacion notaAprobacion;
	public List<Pregunta> preguntas;
	public Criterio criterio;
	
	public Examen( Alumno alumno, NotaAprobacion notaAprobacion, List<Pregunta> preguntas, Criterio criterio) {
		this.alumno = alumno;
		this.notaAprobacion = notaAprobacion;
		this.preguntas = preguntas;
		this.criterio = criterio;
	}
}
