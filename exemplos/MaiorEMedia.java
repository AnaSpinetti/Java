package exemplos;
/*Faça um programa que leia 5 numeros, informe o maior e a média desses numeros */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int  numero;
        int maior = 0;
        int soma = 0;
        int contador = 0;

        do{
            System.out.print("Numero: ");
            numero = scan.nextInt();

            if(numero > maior){
                maior = numero;
            }

            soma = soma + numero;

            contador++;

        }while(contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);
    }
}
