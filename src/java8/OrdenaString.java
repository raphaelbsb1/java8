package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaString {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("alura online", "casa do código", "caelum");
		
		//Usando lambdas
		palavras.forEach(s -> System.out.println("Teste lambda " + s));
		
		//Usando método reference
		palavras.forEach(System.out::println);
		
		Comparator<String> comparador = new ComparatorDeSringPorTamanho();
		//Collections.sort(palavras, comparador);
		//Usando métodos default
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
		
		Function<String, Integer> funcao = s -> s.length();
		//Comparator<String> comparador2 = Comparator.comparing(funcao);
		Comparator<String> comparador2 = Comparator.comparing(String::length);
		palavras.sort(comparador2);	
		
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length()); 
		});
		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
		new Thread(()-> {
			System.out.println("Executando um Runnable");
		}).start();

	}

}


class ConsumidorDeString implements Consumer<String> {
	@Override
	public void accept(String s) {
		
		System.out.println(s);
	}

}

class ComparatorDeSringPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}