package com.sbbots.solutions.Algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * Algorithms!
 * 
 */
public class Algorithms {
	 public static void main(String args[] ) throws Exception {
	        
	        
		

		

	}

	
	
	public static String firstRepeatedWord(String s) {

    HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        //Clean String
        s = s.replaceAll("\\t", " ");
        s = s.replaceAll(",", " ");
        s = s.replaceAll(":", " ");
        s = s.replaceAll(";", " ");
        s = s.replaceAll("-", " ");
//        s = s.replaceAll(".", " ");
        ArrayList<String> arr= new ArrayList<String>();
        

        while(s.indexOf(" ")!=-1) {
            int index = s.indexOf(" ");
            arr.add(s.substring(0,index));
            s = s.substring(index+1);
        }
        
        String result = "";
        int len = arr.size();
        if(len < 1) {
            return " ";
        }
        
        //Store it in a hashmap
        for(int x = 0; x < len; x++) {    
        	String key = arr.get(x);
            if(hm!=null && hm.get(key)!=null) {
            	Integer value = hm.get(key);
            	value++;
            	hm.put(key, value);
            } else{
            	hm.put(key, 0);
            }
        }
        
        Iterator it = hm.entrySet().iterator();
        
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            
            Integer x = (Integer) pair.getValue();
             if(x!=null && x.equals(1)){
               return (String) pair.getKey();
           }  
        }
        return result;
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

	public int[] insertionSort(int[] arr) {
	
		for (int i = 1; i < arr.length; i++) {
     		/**
			 * i =0, j =0 ; Array : {5,1,8,7,-5}
			 */
			for (int j = i; j >0 ; j--) {
				if (arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
			}		
		}
	
		return arr;
	}

	public int[] quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}
		return arr;
	}

	public int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pIndex = start;
		int i = start;
		while (i < end) {
			if (arr[i] <= pivot) {
				swap(arr, i, pIndex);
				pIndex++;
			}
			i++;
		}
		swap(arr, pIndex, end);
		return pIndex;
	}

	public int[] mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		return arr;
	}

}
