package array;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;

public class NumberOfRectanglesThatCanFormTheLargestSquare2 {

	public int countGoodRectangles(int[][] rectangles) {

		int count = 0, max =0;
		for(int i=0; i<rectangles.length;i++) {
			int min = Math.min(rectangles[i][0], rectangles[i][1]);
			
			if(min > max) {
				count = 1;
				max = min;
			}else if (min == max) {
				count++;
			}
		}
		
//		testing
//		float myFLoat = (float)3/5;
//		System.out.println(String.format("%.05f", (float)3/5));
			
		return count;
	}

	public static void main(String[] args) {
		
		int[][] rectangles = new int[][] {{5,8}, {3,9}, {5,12} ,{16, 5}};
		NumberOfRectanglesThatCanFormTheLargestSquare2 obj = new NumberOfRectanglesThatCanFormTheLargestSquare2();
		System.out.println(obj.countGoodRectangles(rectangles));
	}

}
