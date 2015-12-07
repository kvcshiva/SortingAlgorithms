package com.sorting;

public class Sorting {
	// SELECTION SORT	
	// for every iteration of i the minimum element is inserted at a[i]
	// i.e., for every iteration of the INNER loop the minimum element between a[i] and
	// a[arrLength-1] will inserted at a[i] 
	public void selectionSort(int[] intArray) {
		for(int i = 0;i < intArray.length; i++) {
			for(int j = (i+1);j < intArray.length; j++) { // make j=i+1 to eliminate comparing with already sorted elements
				if(intArray[i] > intArray[j]) {
					int intTemp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = intTemp;
				}
			}
		}
		printArrayElements(intArray);
	}
	
	// BUBBLE SORT
	// compare every element with its adjacent element at right 
	// and swap if it is greater than the element at its right
	// do this till no more swaps occur for an entire iteration
	public void bubbleSort(int[] intArray) {
		boolean boolNoMoreSwaps = false;
		while(!boolNoMoreSwaps){
			boolNoMoreSwaps = true;
			for(int j = 0; j < (intArray.length - 1);j++) {
				if(intArray[j] > intArray[j+1]) {
					int intTemp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = intTemp;
					boolNoMoreSwaps = false;
				}
			}
		}
		
		printArrayElements(intArray);
	}
	
	// INSERTION SORT (splitting the array internally into SORTED & UNSORTED Parts)
	// for every iteration of i, all elements between 0 and i will be sorted  and the elements from (i+1) and n will be UNSORTED.
	// in this process the array will be internally split into SORTED and UNSORTED parts
	public void insertionSort(int[] intArray) {
		// the array is split internally into SORTED and UNSORTED
		for(int i = 1; i <= (intArray.length-1); i++) {
			
			int j = i;
			// each element from the UNSORTED part is taken and compared with each
			// element in the SORTED part from RIGHT to LEFT
			while(j > 0 && intArray[j] < intArray[j-1]) {
				int intTemp = intArray[j];
				intArray[j] = intArray[j-1];
				intArray[j-1] = intTemp;
				
				j--;
			}
		}
		
		printArrayElements(intArray);
	}
	
	public void printArrayElements(int[] intArray) {
		for(int i = 0;i < intArray.length; i++) {
			System.out.print(intArray[i]+",");
		}
	}
}
