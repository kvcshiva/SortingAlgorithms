package com.sorting;

public class SortingTester {
	public static void main(String[] args) {
		Sorting sorting = new Sorting();
		int[] intArray = {3,6,7,9,1,2,4,5,8,0};
		System.out.print("Array Elements before sorting : ");
		sorting.printArrayElements(intArray);
		
		//System.out.println("Array Elements after SELECTION sorting : ");
		//sorting.selectionSort(intArray);
		
		System.out.println("Array Elements after BUBBLE sorting : ");
		sorting.bubbleSort(intArray);
		
		//System.out.println("Array Elements after INSERTION sorting : ");
		//sorting.insertionSort(intArray);
	}
}
