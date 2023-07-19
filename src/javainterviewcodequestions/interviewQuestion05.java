package javainterviewcodequestions;

import java.util.Arrays;
import java.util.Scanner;

public class interviewQuestion05 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int arrlength = inp.nextInt();

        int[] arr = new int[arrlength];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". sayıyı giriniz");
            arr[i] = inp.nextInt();
        }

        int result = function(arr);

        System.out.println(result);


    }

    private static int function(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];

        return max - min;


    }
}
