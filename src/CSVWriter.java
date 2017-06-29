import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Mach eine Eingabe (Format: Name;Vorname;Jahrgang)");
		String towrite = input.nextLine();
		input.close();
		

	    try {
	      BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Markus/workspace/CSVReader/daten.csv", true));
	      
	      writer.write(towrite);
	      writer.newLine();
	     
	      
	      writer.flush();
	      writer.close();
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    } 



	}

}
