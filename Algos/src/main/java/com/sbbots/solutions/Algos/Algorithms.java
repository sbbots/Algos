package com.sbbots.solutions.Algos;

/**
 * Algorithms!
 * 
 */
public class Algorithms {
	public static void main(String[] args) {
		System.out.println("Hello World!");

	}

	/**
	 * Array : {8,7,6,5,4}
	 * 
	 * @param arr
	 * @return
	 */
	public int[] bubbleSort(int[] arr) {

		for (int i = arr.length-1; i >0; i--) {

			for (int j = 0; j <i; j++) {
				/** 
				 * i =4, j =0 ; Array : {8,7,6,5,4}
				 * i =4, j =1 ; Array : {7,8,6,5,4}
				 * i =4, j =2 ; Array : {7,6,8,5,4}
				 * i =4, j =3 ;  Array : {7,6,5,8,4}
				 * i =3, j =0 ;  Array : {7,6,5,4,8}
				 * i =3, j =1 ;  Array : {6,7,5,4,8}
				 * i =3, j =2 ;  Array : {6,5,7,4,8}
				 * i =2, j =0 ;  Array : {6,5,4,7,8}
				 * i =2, j =1 ;  Array : {5,6,4,7,8}
				 * i =1, j =0 ;  Array : {5,4,6,7,8}
				 */
				if (arr[j] > arr[j + 1]) {
					int large = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = large;
				}
				
				/**
				 * i =4, j =0 ;  Array : {7,8,6,5,4}
				 * i =4, j =1 ;  Array : {7,6,8,5,4}
				 * i =4, j =2 ;  Array : {7,6,5,8,4}
				 * i =4, j =3 ;  Array : {7,6,5,4,8}
				 * i =3, j =0 ;  Array : {6,7,5,4,8}
				 * i =3, j =1 ;  Array : {6,5,7,4,8}
				 * i =3, j =2 ;  Array : {6,5,4,7,8}
				 * i =2, j =0 ;  Array : {5,6,4,7,8}
				 * i =2, j =1 ;  Array : {5,4,6,7,8}
				 * i =1, j =0 ;  Array : {4,5,6,7,8}
				 */
			}
		}
		return arr;
	}
	
	/**
	 * Array : {8,7,6,5,4}
	 * 
	 * @param arr
	 * @return
	 */
	public int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int index = i;
			/**
			 * index = 0; i =0, j =0 ; Array : {5,1,8,7,-5}
			 * index = 1; i =1, j =0 ; Array : {-5,1,8,7,5}
			 * index = 2; i =2, j =0 ; Array : {-5,1,8,7,5}
			 * index = 3; i =3, j =0 ; Array : {-5,1,5,7,8}
			 */

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[index] > arr[j]) {
					index = j;
				}

			}
			swap(arr, index, i);
				
				/**
				 * index = 4; i =0, j =4 ; Array : {-5,1,8,7,5}
				 * index = 1; i =1, j =4 ; Array : {-5,1,8,7,5}
				 * index = 4; i =2, j =4 ; Array : {-5,1,5,7,8}
				 * index = 3; i =3, j =4 ; Array : {-5,1,5,7,8} 
				 */

		}
		return arr;
	}
	
	public void swap(int[] arr, int i, int j){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
