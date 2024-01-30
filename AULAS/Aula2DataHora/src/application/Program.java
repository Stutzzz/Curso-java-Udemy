package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2005-03-14");
		LocalDateTime d05 = LocalDateTime.parse("2005-03-14T12:23:14");
		Instant d06 = Instant.parse("2005-03-14T12:23:14Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		//para poder usar o format em (instant) é necessario colocar as withZone
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;

		//(.format) para formatar o obj LocalDateTime
		System.out.println("do4 = " + d04.format(fmt1));
		System.out.println("do4 = " + fmt1.format(d04));
		
		System.out.println("do5 = " + d05.format(fmt2));
		
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt4.format(d06));
	}

}
