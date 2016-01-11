package com.sbbots.solutions.Algos;

import junit.framework.Assert;

import org.junit.Test;

import com.sbbots.solutions.Algos.Algorithms;

public class TestAlgorithms {

	@Test
	public void testBubbleSort() {

		// Input
		int[] arr = { 8, 7, 6, 5, 4 };
		// Expected
		int[] exp = { 4, 5, 6, 7, 8 };
		// Output
		Algorithms algo = new Algorithms();
		arr = algo.bubbleSort(arr);

		for (int i = 0; i < arr.length; i++) {
			Assert.assertEquals(arr[i],exp[i]);
		}
	}
	
	@Test
	public void testSelectionSort() {

		// Input
		int[] arr = { 5,1,8,7,-5 };
		// Expected
		int[] exp = { -5,1,5,7,8 };
		// Output
		Algorithms algo = new Algorithms();
		arr = algo.selectionSort(arr);

		for (int i = 0; i < arr.length; i++) {
			Assert.assertEquals(arr[i],exp[i]);
		}
	}
	
	@Test
	public void testInsertionSort() {

		// Input
		int[] arr = { 5,1,8,7,-5 };
		// Expected
		int[] exp = { -5,1,5,7,8 };
		// Output
		Algorithms algo = new Algorithms();
		arr = algo.insertionSort(arr);

		for (int i = 0; i < arr.length; i++) {
			Assert.assertEquals(arr[i],exp[i]);
		}
	}

	@Test
	public void testQuickSort() {

		// Input
		int[] arr = { 5, 1, 8, 7, -5 };
		// Expected
		int[] exp = { -5, 1, 5, 7, 8 };
		// Output
		Algorithms algo = new Algorithms();
		arr = algo.quickSort(arr, 0, arr.length-1);

		for (int i = 0; i < arr.length; i++) {
			Assert.assertEquals(arr[i], exp[i]);
		}
	}

	@Test
	public void testMergeSort() {

		// Input
		int[] arr = { 5,1,8,7,-5 };
		// Expected
		int[] exp = { -5,1,5,7,8 };
		// Output
		Algorithms algo = new Algorithms();
		arr = algo.mergeSort(arr);

		for (int i = 0; i < arr.length; i++) {
			Assert.assertEquals(arr[i],exp[i]);
		}
	}
	
	
	

}
