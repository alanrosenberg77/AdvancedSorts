package code;

public interface Sorter {

	public void BubbleSort(Integer[] arr) throws EmptyArrayException;
	
	public void MergeSort(Integer[] arr, int start, int end) throws EmptyArrayException;
	
	public void InsertionSort(Integer[] arr) throws EmptyArrayException;
}
