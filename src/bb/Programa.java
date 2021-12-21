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
		//acessar o caminho do arquivo
		System.out.println("getParent: "+ path.getParent());
		//todo o caminho
		System.out.println("getPath "+ path.getPath());
		
		sc.close();
		
	}

	}


