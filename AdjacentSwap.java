import java.io.*; 
import java.util.StringTokenizer; 

public class AdjacentSwap { 
    public static void main(String[] args) 
        throws IOException 
    { 

        FastReader reader = new FastReader();
        FastWriter writer = new FastWriter();

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
            int[] nums) 
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
