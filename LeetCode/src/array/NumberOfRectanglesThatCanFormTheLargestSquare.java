package array;

import java.util.Collections;
import java.util.HashMap;

public class NumberOfRectanglesThatCanFormTheLargestSquare {

	public int countGoodRectangles(int[][] rectangles) {

		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<rectangles.length;i++) {
			int min = Math.min(rectangles[i][0], rectangles[i][1]);
			if(map.get(min) != null) {
				map.put(min, map.get(min)+1);
			}else {
				map.put(min, 1);
			}
		}
		
		int largestPossibleSqure = Collections.max(map.keySet());
		return map.get(largestPossibleSqure);
	}

	public static void main(String[] args) {
		
		int[][] rectangles = new int[][] {{5,8}, {3,9}, {5,12} ,{16, 5}};
		NumberOfRectanglesThatCanFormTheLargestSquare obj = new NumberOfRectanglesThatCanFormTheLargestSquare();
		System.out.println(obj.countGoodRectangles(rectangles));
	}

}
