import com.caiocollete.methodsOrdenation.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qnt=50000,max=100000,min=0;
        int[] vector = buildVector.build(qnt,max,min);

        System.out.printf("\n1-quickSort (fastest)\n2-bubleSort (slower)\n3-selectionSort (middle ground)\n->");
        int esc = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        switch(esc){
            case 1: quickSort.ordenate(vector, 0, qnt - 1); break;
            case 2: bubleSort.ordenate(vector); break;
            case 3: selectionSort.ordenate(vector); break;
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.printf("\nTime execution: %dms\n",duration);

        System.out.print("\nShow ordenated vector? (Y or N)");
        String op = scanner.next();
        if(op.equalsIgnoreCase("Y")){
            buildVector.show(vector);
        }
    }
}