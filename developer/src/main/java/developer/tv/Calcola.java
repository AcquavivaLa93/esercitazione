package developer.tv;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class Calcola {

	private int canale;
	
	final static Logger logger = Logger.getLogger(Calcola.class);
	
	public static void main(String[] args) {
		
		Calcola obj = new Calcola();
		obj.setCanale();

	}

	public void stampaCanale() {
		System.out.println("Il canale selezionato è: " + canale);
	}
	
	public void setCanale() {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Selezionare un canale");
            canale = scanner.nextInt();
            stampaCanale();
            logger.info("Il canale selezionato è: " + canale);
		} catch (InputMismatchException inputMismatchException) {
			logger.error("Deve essere inserito un numero");
		}
		catch (Exception exception) {
			logger.error("Il canale inserito non è corretto");
		}
	}
	
}
