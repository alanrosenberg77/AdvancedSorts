package code;

public class MainDriver {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[10];
		Integer[] rando = new Integer[10];
		SimpleSort s = new SimpleSort();
		
		for(int i=0 ; i<arr.length ; i++) {
			rando[i] = (int) (Math.random()*10+1);
		}
		arr = rando.clone();
		
		long before = 0;
		long after = 0;
		for(int i=0 ; i<100 ; i++) {
			try {
				before = System.nanoTime();
				//s.BubbleSort(arr);
				s.MergeSort(arr, 0, 9);
				//s.InsertionSort(arr);
				after = System.nanoTime();
			} catch (EmptyArrayException e) {
				e.printStackTrace();
			}
			
			System.out.print(after-before+", ");
			arr = rando.clone();
		}
	}

}
