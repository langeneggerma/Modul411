import java.util.Arrays;

public class ArrayFunktionen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] zahlen = {10,3,65,4,66,6,95,8,77,1}; 
		int[] zahlen2 = {100,3,65,4,66,6,95,8,77,1}; 
		int[] summe = addarray(zahlen, zahlen2);
		int[] prependarray = prepend(zahlen, 55);


		System.out.println(getminimum(zahlen));
		System.out.println(getmaximum(zahlen));
		System.out.println(Arrays.toString(summe));	
		System.out.println(Arrays.toString(prependarray));
		System.out.println(Arrays.toString(copy(zahlen)));
		System.out.println(Arrays.toString(zahlen));
		System.out.println(Integer.MAX_VALUE);
		
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int[] copiedArray = copy(zahlen);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Handgemacht: " + (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		int[] copiedArray = new int[zahlen.length];
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
		System.arraycopy(zahlen, 0, copiedArray, 0, zahlen.length);
		}
		endTime = System.currentTimeMillis();
		System.out.println("In House Java: " +  (endTime-startTime));
		
	}


	public static int getminimum(int zahlen[]){
		int min = Integer.MAX_VALUE;
		//Hier sollte dein Code stehen
		for (int i = 0; i < zahlen.length; i++) {
			if (min > zahlen[i])
				min = zahlen[i];	
		}
		return min;
	}


	public static int getmaximum(int zahlen[]){
		int max = Integer.MIN_VALUE;
		//Hier sollte dein Code stehen
		for (int i = 0; i < zahlen.length; i++) {
			if (max < zahlen[i])
				max = zahlen[i];	
		}
		return max;
	}

	public static int[] addarray (int array1[], int array2[]){
		int [] summe = null;
		if (array1.length == array2.length){
			summe = new int [array1.length] ;

			for (int j = 0; j < array1.length; j++) {
				summe[j] = array1[j]+array2[j];
			}

		}else {
			System.out.println("Die array haben nicht die gleiche länge");
		}
		return summe;
	}

	public static int[] prepend(int array[],int prependzahl){
		int[] prependarray = new int [array.length+1];
		prependarray[0] = prependzahl;
		for (int i = 1; i <prependarray.length; i++) {
			prependarray[i] = array[i-1];
		}
		return prependarray;

	}

	public static int[] copy(int toCopy[]){
		int[]copyarray = new int[toCopy.length];
		for (int z = 0; z < toCopy.length; z++) {
			copyarray[z] = toCopy[z];
		}
		return copyarray;
	}

}
