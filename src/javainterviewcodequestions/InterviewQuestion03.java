package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion03 {
        //{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, …}
    public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   int sayi=scan.nextInt();
   fibonnaci(sayi);

    }

    private static void fibonnaci(int sayi) {
        int fibo1=1;
        int fibo2=1;
        int fibonacci=0;
        System.out.println(fibo1);
        System.out.println(fibo2);

        for (int i = 0; i <sayi-1 ; i++) {
            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;
            System.out.println(fibonacci);
        }
    }


}
