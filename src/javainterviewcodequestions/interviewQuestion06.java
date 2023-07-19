package javainterviewcodequestions;

import java.util.Scanner;

public class interviewQuestion06 {
    public static void main(String[] args) {

	/*
	 	Create a program checks if a String is palindrome or not.
	 	If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome",
	    For example, "madam" or "nurses run".
	 */
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir String ifade giriniz");
        String str=inp.nextLine().toLowerCase().replaceAll(" ","");
     /*   String[] arr=scan.nextLine().replaceAll(" ","").toLowerCase().split("");
        int num=arr.length-1;
        int count=0;

        for (int i = 0; i < arr.length/2 ; i++) {
            if (!arr[i].equals(arr[num])) {

              num--;
                count++;
            }
            num--;
            }
        if (count==0) {
            System.out.println("Polindrome");
        }else {
            System.out.println("polindrome degil");
        }



        StringBuilder kelime = new StringBuilder(str.replaceAll(" ", "").toLowerCase());


        System.out.println(str.equals(kelime.reverse().toString()) ? "Palindrom" : "Palindrom değil");

        } */

        System.out.println("kelime gr");
        String kelime=inp.nextLine().trim().replaceAll(" ","").toLowerCase();

        String[] arr=kelime.split("");
        String yeni="";

        for (int i = arr.length-1 ; i >= 0 ; i--) {
            yeni+=arr[i];
        }

        System.out.println(yeni);

        if (kelime.equals(yeni)){
            System.out.println("Palindrom");

        }else System.out.println("palindrom değil");


    }

}

