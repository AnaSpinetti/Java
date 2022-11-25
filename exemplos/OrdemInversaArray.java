package exemplos;

public class OrdemInversaArray {
    public static void main(String[] args) {
        //Vetor unidimensional
        int[] vetor = {0, 4, -5, 3 };

        int count = 0;
        
        // Ordem normal
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        
        // Ordem invertida
        for(int i = (vetor.length-1); i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
