package javainterviewcodequestions;
import java.util.Arrays;
import java.util.Objects;
public class InterviewQuestion12 {
        public static void main(String[] args) {

            /*
             * 15 Minutes Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to
             * the maximum value, decreasing constantly after the maximum value
             *
             * Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to
             * the maximum value, decreasing and increasing after the maximum value
             *
             * Create a method to check if it is Mountain Array or not. Use as possible as
             * Functional Programming
             *
             */
            int arr[]={0, 2, 5, 3, 1};
            max(arr);



        }
        public static void max(int[] arr){
            int max=arr[0];

            for (int i : arr) {
                max=Math.max(max,i);


            }
            int idxMax= Arrays.binarySearch(arr,max);

            if (isMountain(arr,idxMax) && (isMountain2(arr,idxMax))){
                System.out.println("Mountain Array");
            }else System.out.println("Not Mountain Array");
        }

        public static boolean isMountain(int arr[],int idxMax){
            for (int i = 0; i <idxMax ; i++) {
                if (arr[i]<arr[i+1]){
                    return true;
                }else return false;
            }
            return false;
        }
        public static boolean isMountain2(int arr[],int idxMax){
            for (int i = idxMax; i<arr.length-1 ; i++) {
                if (arr[i]>arr[i+1]){
                    return true;
                }else return false;
            }
            return false;
        }
    }
