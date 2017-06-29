import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tellAge();
		
	}
	
	public static void tellAge(){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH)+1;
		int day = cal.get(cal.DAY_OF_MONTH);
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Wie ist dein name?");
		String name = scan.next();
        System.out.println("Welchen Jahrgang hast du?");
        int jahrgang = scan.nextInt();
        System.out.println("In Welchem Monat hast du Geburtstag? bsp 1 = Januar");
        int monat = scan.nextInt();
        int tag = 0;
        if (monat == month){
            System.out.println("An welchem Tag hast du Geburtstag?");
            tag = scan.nextInt();
        }
        /**
         * Hier sollte ich noch etwas besser berechnen
         */
        int alter =year - jahrgang;
        
        System.out.println("Hallo " + name + ", du wirst in disem Jahr " +alter + " Jahre alt");
		
	}

}
