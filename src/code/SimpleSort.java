package code;

public class SimpleSort implements Sorter {

	/**
	 * BubbleSort is a sorting algorithm designed to be shit. The implementation will be shit.
	 * Its all shit. Not the water polo team tho, we ballerz. This shitty algorithm limps along
	 * by looking at all items from back to front, "bubbling" the smaller items to the front.
	 * Once an item has been bubbled up to the front, the process repeats until sorted. This
	 * shitty algorithm is shitty because it is O(n^2) :(
	 * @param array to be sorted
	 * @throws EmptyArrayException
	 */
	@Override
	public void BubbleSort(Integer[] arr) throws EmptyArrayException {
		
		int size = size(arr);
		
		//Covering empty array case
		if(size == 0) {
			throw new EmptyArrayException();
		}
		
		//Walking array and repeatedly...
		for(int i=0 ; i<arr.length-1 ; i++) {
			//walking array backwards, until first incrementing variable is reached
			for(int j=arr.length-1 ; j>i ; j--) {
				
				//if value at index is smaller than value at preceding index...
				if(arr[j].compareTo(arr[j-1]) < 0) {
					
					//swapping, shittily
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}

	/**
	 * MergeSort is a sorting algorithm that is actually good. The implementation will also be good.
	 * I'm gonna end up writing this one on the plane, aren't I. Update: on da plane ('~').
	 * MergeSort is goated because it is O(nlgn), and it achieves this run-time by breaking down
	 * sorting process into many small pieces. Halves array until all sub-arrays have 1 element.
	 * Then, the algorithm merges the sub-arrays, maintaining proper order. Resultant array
	 * is sorted :)
	 * @param array to be sorted
	 * @param starting index
	 * @param ending index
	 * @throws EmptyArrayException
	 */
	@Override
	public void MergeSort(Integer[] arr, int start, int end) throws EmptyArrayException {
		
		int size = size(arr);
		
		//Covering empty array case
		if(size == 0) {
			throw new EmptyArrayException();
		}
		//Until sub-array is 1 element in length...
		if(start < end) {
			
			//halving again...
			int split = ((start+end)/2);
			//and sorting the resultant sub-arrays
			MergeSort(arr, start, split);
			MergeSort(arr, split+1, end);
			
			//Then we gonna merge those mfs
			merge(arr, start, split, end);
		}
		
	}
	
	/**
	 * This a lil helper method that's just swell. Does the actual merging (don't tell anyone,
	 * but this is why we call it merge sort). Merges in such a way, that the resultant array
	 * is sorted in ascending order.
	 * @param array to be sorted
	 * @param starting index
	 * @param splitting index
	 * @param ending index
	 */
	private void merge(Integer[] arr, int start, int split, int end) {
		
		//calculating sizes of sub-arrays
		int n1 = split-start+1;
		int n2 = end-split;
		
		//Creating and populating left and right sub-arrays
		Integer[] left = new Integer[n1+1];
		Integer[] right = new Integer[n2+1];
		for(int i=0 ; i<n1 ; i++) {
			left[i] = arr[start+i];
		}
		for(int j=0 ; j<n2 ; j++) {
			right[j] = arr[split+j+1];
		}
		
		/*
		 * Setting the last value to max integer value means that when
		 * left or right are out of elements, comparison can still be made
		 * to allow the other to finish appending its elements to main array
		 */
		left[n1] = Integer.MAX_VALUE;
		right[n2] = Integer.MAX_VALUE;
		
		//Making incrementing variables for left and right arrays
		int i = 0;	//left
		int j = 0;	//right
		
		//Then we gonna walk the main array...
		for(int k=start ; k<=end ; k++) {
			//placing the smaller elements at the front of the main array
			if(left[i].compareTo(right[j]) <= 0) {
				arr[k] = left[i];
				i++;	//walkin left
			}
			else {
				arr[k] = right[j];
				j++;	//walkin right
			}
		}
		
	}

	/**
	 * InsertionSort is an awesome little sorting algorithm for awesome little sets of data.
	 * Emphasis on little. The algorithm works by shifting an element backward in the array
	 * so long as the elements it is passing are larger. Once a smaller element is found, the
	 * element stops shifting backward, as it has found its place in the array. All other
	 * elements have shifted forward, so the array is then sorted.
	 * @param array to be sorted
	 * @return sorted array
	 */
	@Override
	public void InsertionSort(Integer[] arr) throws EmptyArrayException{
		
		//Covering empty array case, returning null
		int size = size(arr);
		if(size == 0) {
			throw new EmptyArrayException();
		}
		
		//Walkin through array, skipping first element
		for(int j=1 ; j<arr.length ; j++) {
			
			//Storing for later
			int key = arr[j];
			
			//Establishing incrementing variable...
			int i = j-1;
			
			//so that we can walk backwards, looking for an element with which to swap
			while(i>0 & arr[i].compareTo(key) > 0) {
				
				//Shiftin
				arr[i+1] = arr[i];
				//Walkin
				i--;
			}
			
			//Swappin
			arr[i+1] = key;
		}
		
	}
	
	private int size(Integer[] arr) {
		int count = 0;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] != null) {
				count++;
			}
		}
		return count;
	}

}
