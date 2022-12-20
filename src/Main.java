
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1 ");
         Task_1();
        System.out.println("Task 2 ");
         Task_2();
        System.out.println("Task 3 ");
         Task_3();
    }
    static void Task_1()
    {

        int[] a1 = new int[] { 1,3,5,7,9 };
        int[] a2 = new int[] { 2,4,6,8,10 };
        int[] a3 = new int[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < a3.length; k++) {

            if (i > a1.length - 1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }

        for (int el : a1) {
            System.out.print(el + " ");
        }
        System.out.println("");

        for (int el : a2) {
            System.out.print(el + " ");
        }
        System.out.println("");

        for (int el : a3) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

    static void Task_2()
    {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(10);
            list.add(temp);
        }

        for (int el : list) {
            System.out.print(el + " ");
        }

        System.out.println();


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        for (var el : list) {
            System.out.print(el + " ");
        }

        System.out.println(" ");

    }

    static void Task_3()
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 2, 5, 4, 3, 7, 1, 9, 10));
        int sum = 0;
        int count = 0;
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("максимальное: " + max);
        System.out.println("минимальное: " + min);
        for (int i = 0; i<numbers.size(); i++){
            sum=sum+numbers.get(i);
            count++;
        }
        System.out.println("среднее: " + sum/count);
    }

}