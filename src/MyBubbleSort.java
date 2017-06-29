import java.util.Arrays;

public class MyBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] zahlen = {10,3,65,4,66,6,95,8,77,1}; 

		System.out.println("Vor dem Sortieren: " + Arrays.toString(zahlen));
		bubbleSort(zahlen);
		System.out.println("Nach dem Sortieren: " + Arrays.toString(zahlen));

	}


	public static void bubbleSort(int [] sortierarray){
		for (int i = sortierarray.length-1;  i> 0; i--) {
			for (int j = 0; j < i; j++) {	
				if(sortierarray[j] > sortierarray [j+1]){
					int temp = sortierarray[j];
					sortierarray[j] = sortierarray[j+1];
					sortierarray[j+1] = temp;
				}	
			}
		}
	}
	
	
}
