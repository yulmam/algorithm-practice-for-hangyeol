import java.util.Arrays;
import java.util.Scanner;

public class Combination {
    static int testcase;
    static int n;
    static int r;
    static int[] numbers;	//뽑은 r개 수의 조합을 저장할 배열
    static int[] input;		//입력된 N개의 데이타
    static int count;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = 5;
        r = 3;
        input 	= new int [n];
        numbers	= new int [r];
        for (int i = 0; i < n; i++) {
            input[i]= i+1;
        }

        long start = System.currentTimeMillis();
        combi(0, 0);
        long end = System.currentTimeMillis();
        System.out.printf("%dC%d 조합의 수:%d  time:%d  count:%d <= %d%n",n,r,testcase, end-start,count, testcase*r);
    }

    //여기서부터 따라 치면 된단다.


}
