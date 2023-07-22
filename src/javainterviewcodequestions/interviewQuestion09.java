package javainterviewcodequestions;

public class interviewQuestion09 {
    /*
	  From a given array find all pairs whose sum is a given number
	  {4, 6, 5, -10, 8, 5, 20} ==> 10
	  For example;	4+6=10, 5+5=10, -10+20=10
	 */

    public static void main(String[] args) {
        findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

    }

    private static void findPairs(int[] ints, int num) {
        for (int i = 0; i <ints.length-1 ; i++) {
            for (int j =i+1; j <ints.length ; j++) {
            if(ints[i]+ints[j]== num)  {
                    System.out.println(ints[i]+ " + " + ints[j] + " = " + num );
                }

            }

        }
    }
}
