import java.util.Calendar;

public class Person {
	
	private String vorname;
	private String nachname;
	private int geburtsjahr;
	
	/**
	 * Der Konstruktor
	 */
	public Person(String vorname, String nachname, int geburtsjahr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
	}
	
	//Getters
	public String getVorname() {return vorname;}
	public String getNachname() {return nachname;}
	public int getGeburtsjahr() {return geburtsjahr;}
	
	/**
	 * 
	 * @return Gibt das Alter der Person zurück
	 */
	public int getAge(){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int alter = year - this.geburtsjahr;
		return alter;
	}
	
	@Override
	public String toString(){
		
		return String.format("%s %s %d",this.nachname,this.vorname, this.geburtsjahr );
	}

}
