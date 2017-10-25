package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ManipulaCursos {
	

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		 cursos.stream()
		.filter(c -> c.getAlunos() < 100)
		.sorted(Comparator.comparing(Curso::getAlunos))
		.map(Curso::getNome)
		.forEach(System.out::println);
		 
		 
		 Stream<String> nomeCursos = cursos.stream().map(Curso::getNome);
		 nomeCursos.forEach(System.out::println);
		 
		 Stream<Integer> quantidades = cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos);
		 quantidades.forEach(System.out::println);
		 
		 boolean present = cursos.stream()
		 	.filter(c -> c.getAlunos() < 10)
		 	.findFirst()
		 	.isPresent();
		 
		 cursos.stream()
		 	.filter(c -> c.getAlunos() > 50)
		 	.findFirst()
		 	.ifPresent(c -> c.setAlunos(0));
		 
		 cursos.stream()
		 	.map(Curso::getAlunos)
		 	.forEach(System.out::println);
		 
		 cursos.stream()
		 	.mapToInt(Curso::getAlunos)
		 	.average()
		 	.ifPresent(System.out::println);
		 
		 List<Curso> listaCursos = cursos.stream()
		 	.filter(c -> c.getAlunos() < 100)
		 	.collect(Collectors.toList());
		 
		 

	}

	
}
