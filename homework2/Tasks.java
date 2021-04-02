package picsartacademy.homework.homework2;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Task 1: Create an array and fill it with 2 number.");
        int[] arr1 = {2, 2, 2, 2};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n\nTask 2: Create an array and fill it with numbers from 1:1000.");
        int[] arr2 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr2[i] = i + 1;
        }
        for (int i = 0; i < 1000; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n\nTask 3: Create an array and fill it with odd numbers from -20:20");
        int[] arr3 = new int[20];
        for (int i = 0; i < 20; i++) {
            arr3[i] = -19 + 2 * i;
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println("\n\nTask 4: Create an array and fill it. Print all elements which can be divided by 5.");
        int[] arr4 = {2, 3, 5, 7, 15};
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 5 == 0)
                System.out.print(arr4[i] + " ");
        }

        System.out.println("\n\nTask 5: Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
        float[] arr5 = {12.3F, 123.0F, 9,9778F, 3.14F, 0.577215F};
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= 24.12 && arr5[i] <= 467.23)
                System.out.print(arr5[i] + " ");
        }

        System.out.println("\n\nTask 6: Create an array and fill it. Print count of elements which can be divided by 2.");
        int count = 0;
        int[] arr6 = {1, 5, 8, 10, 2, 4, 3, 5, 6, 8, 8};
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] % 2 == 0)
                count++;
        }
        System.out.println(count);

        System.out.println("\nTask 7: Given an integer, 0 < N < 21 , print its first 10 multiples. Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.");
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
