package Dominio;

import java.util.List;
import java.util.stream.Collectors;

public class Promedio implements Criterio {

	public List<Criterio> criterios;
	
	public Promedio(List<Criterio> criterios) {
		this.criterios = criterios;
	}
	
	@Override
	public Double notaFinal(List<Pregunta> preguntas) {
		// TODO Auto-generated method stub
		List<Double> notas =  criterios.stream().map(m -> m.notaFinal(preguntas)).collect(Collectors.toList());
		Double suma = 0.0;
		notas.stream().forEach(p -> suma += p.doubleValue());
		Double cant = (double) notas.stream().count();
		
		return suma/cant;
	}

}
