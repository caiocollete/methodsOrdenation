package com.caiocollete.methodsOrdenation;

public class bubleSort {
    public static void ordenate(int[] vetor){
        int TL = vetor.length;
        for (int i = 0; i < TL - 1; i++) {
            for (int j = 0; j < TL - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
