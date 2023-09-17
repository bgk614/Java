package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		double min = 1;
		double max = 100;
		
		int[] array = new int[5];
		
		for (int i=0; i<array.length; i++) {
			array[i] = (int)((Math.random() * (max - min)) + min);
		}
		
		Arrays.sort(array);
		System.out.println("최댓값 : " + array[array.length-1]);
	}

}
