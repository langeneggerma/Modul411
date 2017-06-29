import java.util.Scanner;

public class EInAusgabeUeberKonsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int zahl1 = 5;
	     int zahl2 = 20;
        System.out.println("Die zahl eins ist " + zahl1 + " und die zahl 2 ist " + zahl2 + " dies ergibt " + zahl1+zahl2);
        System.out.println("Die zahl eins ist " + zahl1 + " und die zahl 2 ist " + zahl2 + " dies ergibt " + (zahl1+zahl2));

        Scanner scan = new Scanner(System.in);
        System.out.println("Gib ein Zahl ein");
        int a = scan.nextInt();
        System.out.println("Gib einen zusammenhängeneden Text ein");
        String s = scan.next();
        System.out.println("Die Zahl ist " + a + " Der text ist " + s);
        scan.close();
	}

}
