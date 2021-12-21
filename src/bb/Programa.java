package bb;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		String [] linhas = new String[] {"Good morgin", "Good afterman", "Good night", "Paulo"};
		
		String path = "c:\\circular\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	}


