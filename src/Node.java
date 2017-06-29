
public class Node {

	//these are private
	public String data;
	public Node next;

	//constructor
	public Node (String data){
		next = null;
		this.data = data;
	}

	//another constructor
	public Node(String value, Node nextValue){
		next = nextValue;
		data = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setItem(String item) {
		this.data = item;
	}


	

}



