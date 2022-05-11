class Main {
  public static void main(String[] args) {
		int[] nameofarray = {1, 3, 4, 5, 6, 8, 4, 6, 2, 0};

		int index = linearSearch(nameofarray, 4);

		if (index != -1){
			System.out.println("Found at index " + index);
		} else {
			System.out.println("Not Found");
		}
  }

	private static int linearSearch(int[] array, int value){

		for(int i = 0; i < array.length; i++){
			if(array[i] == value){
				return i;
			}
		}
		return -1;
	}	
}