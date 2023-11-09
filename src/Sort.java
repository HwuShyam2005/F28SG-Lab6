public class Sort {

	/*
	 * Part 4: complete method
	 */
	/**
	 * Sorts an array using a priority queue.
	 * 
	 * The effect of calling this method is that the input 'arr' array is
	 * updated in-place, rather than creating a new array holding the sorted value.
	 * 
	 * @param arr the array to be sorted in-place
	 */
	public static void sort(int[] arr){	
		//CREATING A QUEUE WITH A SIMILAR LENGTH AS THE ARRAY
		PriorityQueue pq = new PriorityQueue(arr.length);
		//USING INSERT METHOD TO PUT THE VALUES OF GIVEN ARRAY INTO QUEUE
		for (int value :arr) {
			pq.insert(value);
		}
		//USING THE FOR LOOP TO REMOVE THE LOWEST NUMBERS FROM THE PRIORITY QUEUE
		//AND UPDATING THE ARR ARRAY WITH SORTED ORDER USING THE REMOVEMIN METHOD
		for(int i=0; i<arr.length; i++){
			arr[i] = pq.removeMin();
		}
}

	
	public static void main(String[] args){
		int[] arr = {53,3,5,2,4,67};
		Sort.sort(arr);
		//IT SHOULD BE PRINTED IN ORDER
		System.out.println(arr[0]);
		System.out.println(arr[1]);	
		System.out.println(arr[2]);
		System.out.println(arr[3]);	
		System.out.println(arr[4]);	
		System.out.println(arr[5]);	
	}
	
}