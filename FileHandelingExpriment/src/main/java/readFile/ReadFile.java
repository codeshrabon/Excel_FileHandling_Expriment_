package readFile;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadFile {
	public static void readFile() throws IOException {
		// create an interger value which will help to 
		// read file till the end of that file 
		int i;
		
		try {
			FileReader fr = new FileReader("FileOutput.txt");
			
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
				
				
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("File readed successfully");
		
		
	}
}
