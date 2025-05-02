import java.util.Arrays;

public class Permutation {
    static long tc;					//순열 개수
    static long count;				//반복 횟수
    static int  R;					//뽑을 개수
    static int  N;					//원소의 개수
    static int[] numbers;			//순열을 담은 배열
    static int[] data;
    static boolean[] visited;
    public static void main(String[] args) {
        data = new int[] {1,2,3};
        N = data.length;
        R = data.length;
        visited = new boolean[N];
        numbers = new int[R];
        long start = System.currentTimeMillis();
        permutation(0);
        long end = System.currentTimeMillis();
        System.out.printf("tc: %d   count:%d   time:%dms%n", tc, count, end-start);
    }

    //여기서부터 따라 치면 된단다.

    public static void permutation(int idx) {
        if(idx == R) {
            tc++;
			System.out.println(Arrays.toString(numbers));
            return ;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                numbers[idx] = data[i];
                permutation(idx + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }

}
