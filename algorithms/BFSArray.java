import java.util.LinkedList;
import java.util.Queue;

public class BFSArray {
    static int[][] map = {
            {0, 1, 0, 0},
            {0, 1, 0, 1},
            {0, 0, 0, 1},
            {1, 1, 0, 0}
    };

    public static void main(String[] args) {
        bfs(0, 0, 3, 3); // (0,0) → (3,3) 도달 여부
    }


    //여기서부터 따라 치면 된단다.
    static int n = map.length;
    static int m = map[0].length;
    static boolean[][] visited = new boolean[n][m];
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};




    static boolean bfs(int startX, int startY, int goalX, int goalY) {
        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(startX, startY));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.x == goalX && current.y == goalY) {
                System.out.println("🎯 도착: (" + current.x + ", " + current.y + ")");
                return true;
            }

            for (int dir = 0; dir < 4; dir++) {
                int nx = current.x + dx[dir];
                int ny = current.y + dy[dir];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && map[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        queue.offer(new Node(nx, ny));
                    }
                }
            }
        }

        System.out.println("❌ 도착 불가");
        return false;
    }



    static class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
