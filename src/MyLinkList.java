import java.util.Random;

public class MyLinkList {

	private Node head;
	private int listCount; 

	//constructor
	public MyLinkList(Node head){
		this.head = head;
		listCount = 1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node("blau");
		MyLinkList liste1 = new MyLinkList(head);

		liste1.append("grün");
		liste1.append("rot");
		liste1.append("Markus");

		System.out.println(liste1.listCount);

		liste1.showNodeAdressAndValue();
		System.out.println("Entfernt wurde: " + liste1.pop());
		liste1.showNodeAdressAndValue();
		System.out.println("Entfernt wurde: " + liste1.pop());
		liste1.showNodeAdressAndValue();
		
	}


	public void append(String data){
		Node newElement = new Node(data);
		Node current = this.head; //set current to head (start) of the list
		//make sure to add at the end of the list, loop through the elements:
		while (current.getNext() != null){
			current = current.getNext();
		}
		//add the new element to the end of the list:
		current.setNext(newElement);

		//increment list counter:
		this.listCount++;
	}

	public void showNodeAdressAndValue(){
		Node n = this.head;
		do {
			System.out.println(n.toString() + "  " + n.getData());
			n = n.getNext();
		} while (n != null);

	}

	public void showElementsReverse(){
		//Lassen wir noch gerade offen
	}

	public String pop(){
		Node last = this.head;
		int counter = 1;
		Node secondLast = null;
		while(last.getNext() != null){
			last = last.getNext();
			counter++;
			if (counter == this.listCount -1){
				secondLast = last;
			}
		}
		//secondLast wird jetzt letzer:
		secondLast.setNext(null);
		this.listCount--;

		return last.getData();
	}


}
