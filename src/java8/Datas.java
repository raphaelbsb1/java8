package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		
		LocalDate copaDoMundoRussia = LocalDate.of(2018, Month.JUNE, 14);
		
		//Trabalhando com Period
		Period periodo = Period.between(hoje, copaDoMundoRussia);
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		
		//Incrementando e decrementando suas datas
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(4));
		System.out.println(hoje.minusDays(2));

		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(4));
		System.out.println(hoje.plusDays(70));
		
		//Formatando suas datas
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = copaDoMundoRussia.format(formatador);
		System.out.println(valorFormatado);
		
		//Trabalhando com medida de tempo
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		//Horário
		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);
	}

}
