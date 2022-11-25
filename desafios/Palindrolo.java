import java.util.Scanner;

public class Palindrolo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
    

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
               // System.out.println("Digite a palavra: ");

        String novaPalavra = "";
        String[] letras = palavra.split("");
        
        for (int i = letras.length-1; i >= 0; i--){
            novaPalavra = novaPalavra + letras[i];
        }

        System.out.println(novaPalavra.equals(palavra)?"TRUE":"FALSE");
    
    }
} 
