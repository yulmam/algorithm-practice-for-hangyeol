import java.util.Scanner;

public class Subset {
    static int testcase;
    static int n;
    static int r;
    static int[] numbers;	//뽑은 r개 수의 조합을 저장할 배열
    static int[] input;		//입력된 N개의 데이타
    static int count;
    public static void main(String[] args) {
		n = 5;
        numbers	= new int [n];
        input	= new int [n];

        for (int i = 0; i < n; i++) {
			input[i]= i+1;
        }
        long start = System.currentTimeMillis();
        subset(0, 0);
        long end = System.currentTimeMillis();
        System.out.printf("%dC%d 조합의 수:%d  time:%d  count:%d <= %d%n",n,r,testcase, end-start,count, testcase*r);
    }
    /**
     *
     * @param cnt   뽑은 수를 저장할 index 위치
     * @param start 뽑을 수의 index 위치
     */

    //여기서부터 따라 치면 된단다.


}
