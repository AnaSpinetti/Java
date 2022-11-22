import java.util.*;

public class App {

    public static void main(String[] args) {

        Integer num1,  num2;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = leitor.nextInt();
      
        if(num1 == num2){
            System.out.print("São iguais!");
        }else{
            System.out.print("Não são iguais");
        }
    }
}
