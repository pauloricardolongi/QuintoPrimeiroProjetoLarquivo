package bb;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com file path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
	//acessar  somente o nome do arquivo
		
		System.out.println("getNome: "+ path.getName());
		
		sc.close();
		
	}

	}


