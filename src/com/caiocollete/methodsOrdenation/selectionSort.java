package com.caiocollete.methodsOrdenation;

public class selectionSort {
    public static void ordenate(int[] vet){
        int min, x;
        int n = vet.length;
        for (int i=1; i<n-1; i++){
            min = i;
            for (int j=i+1; j<n; j++){
                if (vet[j] < vet[min])
                    min = j;
            }
            x = vet[min];
            vet[min] = vet[i];
            vet[i] = x;
        }
    }
}
