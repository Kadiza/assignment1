import java.io.*;

import java.io.IOException;

public class Asgn1ITT786 {
    public static void main(String [] args) {

        
        String fileName = "source.txt";
		String outputname="output.bin";
        String line = null;
		byte[]  infile = null;

        try {
            
            FileReader fileReader = 
                new FileReader(fileName);

            
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            FileOutputStream outputStream = new FileOutputStream(outputname);
			ObjectOutputStream os = new ObjectOutputStream(outputStream);
			while((line = bufferedReader.readLine()) != null){
			infile = line.getBytes("UTF-8");
			System.out.println(line);
			os.write((infile)); 
			}

            
            bufferedReader.close();   
			os.close();
        }
		

		
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {

            ex.printStackTrace();
        }
		
    }
		public int binaryToInteger(String binary) {
		char[] numbers = binary.toCharArray();
		int result = 0;
		for(int i=numbers.length - 1; i>=0; i--)
		if(numbers[i]=='1')
		result += Math.pow(2, (numbers.length-i));
		return result;
		}
	
}