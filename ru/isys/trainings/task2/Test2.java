package ru.isys.trainings.task2;

import java.util.Scanner;

public class Test2 {

    public static void test21 ()   {
        for(int i=1;i<101;i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void test22 (int n, int k)    {
        int j=0;
        int i=1;
        while (j < n) {
             if (i%k == 0){
                 System.out.println(i);
                 j++;
             }
            i++;
        }
    }

    public static void test23 (int[] array ) {
        int max = 0;
        for (int num: array ) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("max element" + max);
    }

    public static void test231 (int[] array ) {

        int min = 0;
        for (int num: array ) {
            if (min > num) {
                min = num;
            }
        }
        System.out.println("min element" + min);
    }

    public static int[] test24Factorial (int n ) {
        int[] array = new int[n+1];
        for(int i = 1; i <= n; ++i) {
            if (i == 1) {
                array[i] = 1;
            } else{
                array[i] = array[i-1] * i;
            }
//            System.out.println("test24Factorial array["+i+"] =" + array[i]);
        }
        return array;
    }

    public static double[] test24Pow (double x, int n ) {
        double[] array = new double[n+1];
        for (int i = 1; i <= n; ++i) {
            array[i] = 1;
            for (int j = 1; j <= i; ++j) {
                array[i] = array[i] * x;
            }
//            System.out.println("test24Pow array["+i+"] =" + array[i]);
        }
        return array;
    }

    public static double test24Exp (double x, int n ) {
        double result = 1;
        double result2 = Math.exp(x);

        int[] arrayFactorial = test24Factorial(n);
        double[] arrayPow = test24Pow(x, n);

        for (int i = 1; i <= n; ++i) {
            result = result + ( arrayPow[i] / arrayFactorial[i] );
//            System.out.println("arrayPow["+i+"] =" + arrayPow[i] +  "  arrayFactorial["+i+"] =" + arrayFactorial[i]);
        }
        System.out.println("my result = " + result);
        System.out.println("target result = " + result2);
        return result ;
    }

    public static int[] test25 ( int[] array1, int[] array2 ) {
        int[] result = new int[array1.length + array2.length];
        int max =0;
        // находим максимальное значение из двух массивов
        for(int m : array1){
            if (m >= max ) {
                max = m;
            }
        }
        for(int m : array2){
            if (m >= max )  {
                max = m;
            }
        }

        int[] tempArray = new int[max+1]; // создаем темповый массив, где значениея - индексы
        //сгружаем туда два массива в определенные индексы, если число повторяется, в индексе делается +1
        for(int m : array1){
            tempArray[m] =tempArray[m]+1;
        }
        for(int m : array2){
            tempArray[m] =tempArray[m]+1;
        }

        int j=0;

        // цикл по темповому массиву
        for(int idx=0; idx < tempArray.length; idx++){
            for (int k = 0; k < tempArray[idx]; k++){ // добавим значение индекса в результирующий массив столько раз, какое значение в данной ячейке
                result[j] = idx;
                j++;
            }
        }

        System.out.println("my array: ");
        for(int m : result){
            System.out.println(m);
        }
        return result;
    }


    public static void main(String[] args) {
            System.out.println("------------------------------------------");
            System.out.println("task 1");
            test21();
            System.out.println("------------------------------------------");
            System.out.println("task 2");
            test22 (5, 7);
            System.out.println("------------------------------------------");
            System.out.println("task 3");
            int[] array = {5, 7, 8, 15, 0, 1, 88, 99};
            test23 ( array );
            test231 ( array );
            System.out.println("------------------------------------------");
            System.out.println("task 4");
            test24Exp(5,10);
            System.out.println("------------------------------------------");
            System.out.println("task 5");
            int[] array1 = {0, 0, 1, 4, 17, 5, 1, 20};
            int[] array2 = {3, 8, 17, 18, 22};
            test25(array1, array2);

    }

}