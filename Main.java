/*******************************************************
LINEAR SEARCH 
Iterating through a dataset one element at a time 
Time complexity = O(n) 
The larger the dataset the more time is needed 

Disadvantages: 
Slow for large datasets 

Advantages: 
Fast for small to medium datasets 
Does not need sorting 
Useful for data structures without random access (LinkedList)
*/

class Main {
  public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 9, 7, 6, 5, 0};

		int index = linearSearch(array, 5);

		if(index != -1){
			System.out.println("Found at: " + index);
		} else {
			System.out.print("Not Found");
		}
		
	}	
	private static int linearSearch(int[] array, int target){
		for(int i = 0; i < array.length; i++){
			if(array[i] == target){
				return i;
			} 
		}
		return -1; 
	}
}