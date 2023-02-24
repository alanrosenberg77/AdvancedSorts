package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.EmptyArrayException;
import code.SimpleSort;

public class SimpleSortTest {

	SimpleSort s;
	Integer[] emptyArray;
	Integer[] smallArray;
	Integer[] largeArray;
	Integer[] sortedSmall;
	Integer[] sortedLarge;
	
	@Before
	public void setUp() throws Exception {
		s = new SimpleSort();
		emptyArray = new Integer[100];
		smallArray = new Integer[10];
		largeArray = new Integer[100];
		sortedSmall = new Integer[10];
		sortedLarge = new Integer[100];
		
		//Building sortedSmall
		for(int i=0 ; i<sortedSmall.length ; i++) {
			sortedSmall[i] = i;
		}
		
		//Building sortedLarge
		for(int i=0 ; i<sortedLarge.length ; i++) {
			sortedLarge[i] = i;
		}
		
		//Building smallArray, [0,9,1,8,2,7,3,6,4,5]
		for(int i=0 ; i<smallArray.length ; i+=2) {
			smallArray[i] = i/2;
		}
		for(int i=1 ; i<smallArray.length ; i+=2) {
			smallArray[i] = 9-(i/2);
		}
		
		//Building largeArray, [0,99,1,98,2,97,3,96,4,95,5,94...]
		for(int i=0 ; i<largeArray.length ; i+=2) {
			largeArray[i] = i/2;
		}
		for(int i=1 ; i<largeArray.length ; i+=2) {
			largeArray[i] = 99-(i/2);
		}
	}

	@Test
	public void creationTest() {
		assertNotNull(s);
		assertNotNull(emptyArray);
		assertNotNull(smallArray);
		assertNotNull(largeArray);
		assertNotNull(sortedSmall);
		assertNotNull(sortedLarge);
		
		assertEquals(100, emptyArray.length);
		assertEquals(10, smallArray.length);
		assertEquals(100, largeArray.length);
		assertEquals(10, sortedSmall.length);
		assertEquals(100, sortedLarge.length);
	}
	
	/*
	 * Bubble Sort Tests
	 */
	
	@Test
	public void BubbleSortOnEmptyArrayTest() {
		try {
			s.BubbleSort(emptyArray);
		} catch (EmptyArrayException e) {
			return;
		}
		fail("Expected EmptyListException, got none");
	}
	
	@Test
	public void BubbleSortOnSmallArrayTest() {
		try {
			s.BubbleSort(smallArray);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(smallArray);
		
		for(int i=0 ; i<smallArray.length ; i++) {
			assertEquals(i, smallArray[i].intValue());
		}
	}
	
	@Test
	public void BubbleSortOnLargeArrayTest() {
		try {
			s.BubbleSort(largeArray);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(largeArray);
		
		for(int i=0 ; i<largeArray.length ; i++) {
			assertEquals(i, largeArray[i].intValue());
		}
	}
	
	@Test
	public void BubbleSortOnSmallSortedArrayTest() {
		try {
			s.BubbleSort(sortedSmall);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(sortedSmall);
		
		for(int i=0 ; i<sortedSmall.length ; i++) {
			assertEquals(i, sortedSmall[i].intValue());
		}
	}
	
	@Test
	public void BubbleSortOnLargeSortedArrayTest() {
		try {
			s.BubbleSort(sortedLarge);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(sortedLarge);
		
		for(int i=0 ; i<sortedLarge.length ; i++) {
			assertEquals(i, sortedLarge[i].intValue());
		}
	}
	
	/*
	 * Merge Sort Tests
	 */
	
	@Test
	public void MergeSortOnEmptyArrayTest() {
		try {
			s.MergeSort(emptyArray, 0, 99);
		} catch (EmptyArrayException e) {
			return;
		}
		fail("Expected EmptyListException, got none");
	}
	
	@Test
	public void MergeSortOnSmallArrayTest() {
		try {
			s.MergeSort(smallArray, 0, 9);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(smallArray);
		
		for(int i=0 ; i<smallArray.length ; i++) {
			assertEquals(i, smallArray[i].intValue());
		}
	}
	
	@Test
	public void MergeSortOnLargeArrayTest() {
		try {
			s.MergeSort(largeArray, 0, 99);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(largeArray);
		
		for(int i=0 ; i<largeArray.length ; i++) {
			assertEquals(i, largeArray[i].intValue());
		}
	}
	
	@Test
	public void MergeSortOnSmallSortedArrayTest() {
		try {
			s.MergeSort(sortedSmall, 0, 9);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(sortedSmall);
		
		for(int i=0 ; i<sortedSmall.length ; i++) {
			assertEquals(i, sortedSmall[i].intValue());
		}
	}
	
	@Test
	public void MergeSortOnLargeSortedArrayTest() {
		try {
			s.MergeSort(sortedLarge, 0, 99);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(sortedLarge);
		
		for(int i=0 ; i<sortedLarge.length ; i++) {
			assertEquals(i, sortedLarge[i].intValue());
		}
	}
	
	/*
	 * Insertion Sort Tests
	 */
	
	@Test
	public void InsertionSortOnEmptyArrayTest() {
		try {
			s.InsertionSort(emptyArray);
		} catch (EmptyArrayException e) {
			return;
		}
		fail("Expected EmptyListException, got none");
	}
	
	@Test
	public void InsertionSortOnSmallArrayTest() {
		try {
			s.InsertionSort(smallArray);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(smallArray);
		
		for(int i=0 ; i<smallArray.length ; i++) {
			assertEquals(i, smallArray[i].intValue());
		}
	}
	
	@Test
	public void InsertionSortOnLargeArrayTest() {
		try {
			s.InsertionSort(largeArray);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(largeArray);
		
		for(int i=0 ; i<largeArray.length ; i++) {
			assertEquals(i, largeArray[i].intValue());
		}
	}
	
	@Test
	public void InsertionSortOnSmallSortedArrayTest() {
		try {
			s.InsertionSort(sortedSmall);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(sortedSmall);
		
		for(int i=0 ; i<sortedSmall.length ; i++) {
			assertEquals(i, sortedSmall[i].intValue());
		}
	}
	
	@Test
	public void InsertionSortOnLargeSortedArrayTest() {
		try {
			s.InsertionSort(sortedLarge);
		} catch (EmptyArrayException e) {
			fail("Not expecting EmptyListException, got one");
			e.printStackTrace();
		}
		
		assertNotNull(sortedLarge);
		
		for(int i=0 ; i<sortedLarge.length ; i++) {
			assertEquals(i, sortedLarge[i].intValue());
		}
	}

}
