package Dominio;

import java.util.List;

public class ExamenFactory {
	private NotaAprobacion notaAprobacion;
	private List<Pregunta> preguntas;
	private Criterio criterio;
	
	public ExamenFactory() {
		
	}
	
	public void AddPregunta(Pregunta pregunta) {
		this.preguntas.add(pregunta);
	}
	
	public void SetNotaAprobacion(NotaAprobacion nota) {
		this.notaAprobacion = nota;
	}
	public void SetCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
	public Examen CreateExamen(Alumno alumno) {
		if(notaAprobacion == null)
			throw new RuntimeException("Falta la nota de aprobacion");
		if(preguntas.isEmpty())
			throw new RuntimeException("El examen tiene que tener notas");
		if(criterio == null)
			throw new RuntimeException("Falta la criterio");
		
		return new Examen(alumno, notaAprobacion, preguntas, criterio);
	}
}
