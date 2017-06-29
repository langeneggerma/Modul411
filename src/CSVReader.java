import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CSVReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Gib einen Namen ein");
		String toseach = input.next();
		input.close();
		
		try {
			
			File meineDatei = new File("daten.csv");
			input = new Scanner(meineDatei);
			if (!meineDatei.exists()) {
				System.out.println("Datei nicht gefunden!");
			}
			
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] lineParts = line.split(";");
				
				if( lineParts[1].equals(toseach)){
					
				String name = lineParts[0];
				String vorname = lineParts[1];
				int jahrgang = Integer.parseInt(lineParts[2]);
				
				Person  p = new Person(name,vorname, jahrgang);
				System.out.println(p + " "+p.getAge()+" Jahre alt");
				}
			}
			//Zugriff auf Dateisystemressourcen immer schliessen!
			input.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
