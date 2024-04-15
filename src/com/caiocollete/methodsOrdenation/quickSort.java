package com.caiocollete.methodsOrdenation;

public class quickSort {
    public static void ordenate(int[] vet, int min, int max) {
        if (min < max) {
            int pi = part(vet, min, max);
            ordenate(vet, min, pi - 1);
            ordenate(vet, pi + 1, max);
        }
    }

    public static int part(int[] vet, int min, int max) {
        int num = vet[max];
        int i = (min - 1);
        for (int j = min; j < max; j++) {
            if (vet[j] < num) {
                i++;
                int temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        }
        int temp = vet[i + 1];
        vet[i + 1] = vet[max];
        vet[max] = temp;
        return i + 1;
    }
}
