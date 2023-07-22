package javainterviewcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class interviewQuestion10 {
/*
	  Count the words in a String one by one
	  String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */

    public static void main(String[] args) {
        String str = "Ali came to school, and Ayse came to school to.";
        str=str.replaceAll("[.,]","");
        String arr[]=str.split(" ");
        int count=1;
        Arrays.sort(arr);
int idx=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                idx++;
                if(arr[i].equals(arr[j])){
                    count++;
                    i++;
                }else{
                    break;
                }
            }
            System.out.println(arr[i]+ " = "+ count);
            System.out.println(idx);

            count=1;
        }
        }
    }