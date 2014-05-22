package binarySearch;

public class BinarySearch {

	public static void main(String args[]){
		int[] array = {5,12,17,23,38,40,44,85,90};
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.binarySearch(9, array, 0, array.length));
	}
	
	public int binarySearch(int value, int[] array, int start, int end){
		
		if((start == end) && (array[start] != value))
				return -1;
		
		int middleIndex = (start + end)/2;
		int middleVal = array[middleIndex];
		
		if(value == middleVal)
			return middleIndex;
		
		else if(value < middleVal)
			end = middleIndex - 1;
		
		else 
			start = middleIndex + 1;
		
		return binarySearch(value, array, start, end);    
	}
}
