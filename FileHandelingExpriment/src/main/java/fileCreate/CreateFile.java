package fileCreate;

import java.io.FileWriter;
import java.io.IOException;

class CreateFile {
	public static void createFile() throws IOException {
		//create string which will be written in file 
		String str = "I am here again";
		
		// now time to write it into 
		FileWriter fw = new FileWriter("FileOutput.txt");
		
		// file is created 
		// the input im giving need to check if they are in it 
		// read character wise from string and write 
		for(int i = 0 ; i < str.length(); i ++) {
			fw.write(str.charAt(i));
		}
		System.out.println("File created successfully");
		fw.close();
		
	}
}
