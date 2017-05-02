import java.util.Scanner;

public class ToggleString {

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		String word;
		String wordFormatada = "";

		word = in.next();
		
		
		for(int i = 0; i < word.length(); i++){
		 wordFormatada += formatarLetras(word.charAt(i));
		}
		

	    System.out.println(wordFormatada);
	}

	public static char formatarLetras(char caracter) {
		
		String original = Character.toString(caracter);
        String letra = Character.toString(caracter);
        
        if(letra.toUpperCase().equals(original)){
        	caracter = letra.toLowerCase().charAt(0);
        }else{
        	caracter = letra.toUpperCase().charAt(0);
        }
			
		return caracter;

	}
}
