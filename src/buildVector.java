import java.util.Random;

public class buildVector {
    public static int[] build(int qtd, int max, int min){
        Random rand = new Random();
        int vetor[]= new int[qtd];
        int num;
        for(int i=0;i<qtd;i++) {
            num = rand.nextInt(max);
            if (num < min) {
                num += min;
            }
            vetor[i] = num;
        }
        return vetor;
    }

    public static void show(int[] vetor){
        for(int e:vetor){
            System.out.println(e);
        }
    }
}
