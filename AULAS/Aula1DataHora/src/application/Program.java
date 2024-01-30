package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		//DateTimeFormatter uma classe para poder formatar datas fora do padrao ISO 8601
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		//LocalDate para pegar apenas a data atual localmente
		LocalDate d01 = LocalDate.now();
		//LocalDateTime pega a data e a hora localmente
		LocalDateTime d02= LocalDateTime.now();
		//Instant serve para pegar data e hora com timeZone(Fuso-horario)
		//ele pega no padrao GMT (padrao internacional  de Londres  representado pela letra "Z")
		Instant d03 = Instant.now();
		
		//o (parse) serve para quando for transformar um texto em data-hora pelo padrao ISO 8601
		LocalDate d04 = LocalDate.parse("2005-03-14");
		LocalDateTime d05 = LocalDateTime.parse("2005-03-14T12:23:14");
		Instant d06 = Instant.parse("2005-03-14T12:23:14Z");
		Instant d07 = Instant.parse("2005-03-14T12:23:14-03:00");
		
		LocalDate d08 = LocalDate.parse("14/03/2005", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("14/03/2005 12:23", fmt2);
		
		LocalDate d10 = LocalDate.of(2005, 03, 14);
		LocalDateTime d11 = LocalDateTime.of(2005, 03, 14, 12, 30);
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}
	
	

}
