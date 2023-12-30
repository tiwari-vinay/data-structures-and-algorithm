import java.io.*; 
import java.util.StringTokenizer; 
import java.util.*;


public class temp2 { 
	public static void bubbleSort(Integer[] arr){
		int n = arr.length;
		for (int i=0; i<n-1; i++)
		{
			for (int j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	public static void main(String[] args) 
		throws IOException 
	{ 

		FastReader reader = new FastReader(); 
		FastWriter writer = new FastWriter(); 

		ArrayList<Integer> list1 = new ArrayList<>(Collections.nCopies(10, 10));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10,30,9,4,5,9,7));
		Collections.fill(list1, 0);

		list1.removeAll(list2);
		Integer[] arr = list2.toArray(new Integer[0]);
		bubbleSort(arr);
		writer.writeIntArrayWithSpaces(arr);


	} 

	public static class FastReader { 

		BufferedReader reader; 

		public FastReader() 
		{ 
			reader = new BufferedReader( 
				new InputStreamReader( 
					System.in)); 
		} 

		StringTokenizer tokenizer; 

		public int readSingleInt() 
			throws IOException 
		{ 
			return Integer.parseInt( 
				reader.readLine()); 
		} 

		public long readSingleLong() 
			throws IOException 
		{ 
			return Long.parseLong( 
				reader.readLine()); 
		} 

		// Function to read a array of 
		// numsInts integers in 1 line 
		public int[] readIntArray(int numInts) 
			throws IOException 
		{ 
			int[] nums = new int[numInts]; 
			tokenizer 
				= new StringTokenizer( 
					reader.readLine()); 

			for (int i = 0; i < numInts; i++) { 
				nums[i] = Integer.parseInt( 
					tokenizer.nextToken()); 
			} 
			return nums; 
		} 

		public String readString() 
			throws IOException 
		{ 
			return reader.readLine(); 
		} 
	} 

	public static class FastWriter { 

		BufferedWriter writer; 

		public FastWriter() 
		{ 

			writer = new BufferedWriter( 
				new OutputStreamWriter( 
					System.out)); 
		} 

		public void writeSingleInteger(int i) 
			throws IOException 
		{ 
			writer.write(Integer.toString(i)); 
			writer.newLine(); 
			writer.flush(); 
		} 

		public void writeSingleLong(long i) 
			throws IOException 
		{ 
			writer.write(Long.toString(i)); 
			writer.newLine(); 
			writer.flush(); 
		} 

		// Function to write a Integer 
		// of array with spaces in 1 line 
		public void writeIntArrayWithSpaces( 
			Integer[] nums) 
			throws IOException 
		{ 
			for (int i = 0; i < nums.length; i++) { 
				writer.write(nums[i] + " "); 
			} 
			writer.newLine(); 
			writer.flush(); 
		} 

		// Function to write a Integer 
		// of array without spaces 
		// in 1 line 
		public void writeIntArrayWithoutSpaces(int[] nums) 
			throws IOException 
		{ 
			for (int i = 0; 
				i < nums.length; i++) { 
				writer.write( 
					Integer.toString( 
						nums[i])); 
			} 
			writer.newLine(); 
			writer.flush(); 
		} 

		public void writeString(String s) 
			throws IOException 
		{ 
			writer.write(s); 
			writer.newLine(); 
			writer.flush(); 
		} 
	} 
}
