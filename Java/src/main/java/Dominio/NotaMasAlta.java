package Dominio;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NotaMasAlta implements Criterio{
	public List<Criterio> criterios;
	
	public NotaMasAlta(List<Criterio> criterios) {
		this.criterios = criterios;
	}
	
	@Override
	public Double notaFinal(List<Pregunta> preguntas) {
		// TODO Auto-generated method stub
		return criterios.stream().map(m -> m.notaFinal(preguntas)).collect(Collectors.toList())
				.stream().max(Double::compareTo).get();
	}
	
}
