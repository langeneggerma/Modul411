
public class Stack {
	
	public Node first;
	public int listCount;

	//constructor
	public Stack(){
		listCount= 0;
	}

	public static void main(String[] args) {
		
		Stack list = new Stack();
		list.push("to");
		list.push("be");
		list.push("or");
		list.push("not");
		
		list.showNodeAdressAndValue();
		list.pop();
		list.showNodeAdressAndValue();
	}
	
	//Adds element to the top of the list
	public void push(String value){
		//the new element is the last in the list:
		Node current = first;
		first = new Node(value);
		first.setNext(current);
		listCount++;
	}
	
	//Removes top element from stack
	public String pop(){
		String value = first.data;
		first = first.next; //now next element is the first
		listCount--;
		return value;
	}
	
	public void showNodeAdressAndValue(){
		Node n = this.first;
		do {
			System.out.println(n.getData());
			n = n.getNext();
		} while (n != null);

	}



}
