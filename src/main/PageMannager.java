package main;
import java.util.Scanner;

import tagsCorpaPagina.Html;

public class PageMannager {
	
	public void mannagerWindow() {
		Scanner reading = new Scanner(System.in);
		
		while(true) {
			System.out.println("Opçoes\n1 - Inserir no header\n2 - Inserir no menu\n3 - Inserir no body\n4 - "
					+ "Inserir no footer\n5 - Sair");
			int option = reading.nextInt();
			
			if ( option == 1) {
				System.out.println("OK");
			}
			
			else if ( option == 2) {
				
			}
			
			else if ( option == 3) {
				
			}
			
			else if ( option == 4) {
				
			}
			
			else if ( option == 5) {
				System.exit(1);
			}
			
		}
	}
}