package exemplos;

import java.util.Scanner;

/*Programa que leia conjunto de dois valores, o primeiro representando o nome do aluno e o segundo a idade(pare inserindo o valor 0 no campo nome) */

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Inclua o nome 0 para sair");

        while(true){
            System.out.print("Nome: ");
            nome = scan.next();

            if(nome.equals("0")) {
                break;
            }
    
            System.out.print("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Programa finalizado");
    }
}
