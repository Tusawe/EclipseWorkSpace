package ejercicio;

import java.time.LocalDate;
import java.time.Period;

public class Helper {

	public static int getYearsOfPeriod(LocalDate lDate) {
		
		int years = 0;
		Period periodo = Period.between(lDate, LocalDate.now());
		years = periodo.getYears();
		
		return years;
		
	}
	
//	public static void main(String[] args) {
//		
//		System.out.println(getYearsOfPeriod(LocalDate.of(2000, 3, 12)));
//		
//	}
	
}
