import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSNode {
    static List<Node> graph = new ArrayList<>();
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            graph.add(new Node(i));
        }

        // 그래프 연결 예시 (양방향 그래프)
        graph.get(0).neighbors.add(graph.get(1));
        graph.get(1).neighbors.add(graph.get(0));

        graph.get(0).neighbors.add(graph.get(2));
        graph.get(2).neighbors.add(graph.get(0));

        graph.get(1).neighbors.add(graph.get(3));
        graph.get(3).neighbors.add(graph.get(1));

        graph.get(2).neighbors.add(graph.get(4));
        graph.get(4).neighbors.add(graph.get(2));

        graph.get(4).neighbors.add(graph.get(5));
        graph.get(5).neighbors.add(graph.get(4));

        bfs(0, 5); // startNum = 0, goalNum = 5
    }

    //여기서부터 따라 치면 된단다.
    public static boolean bfs(int startNum, int goalNum) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        Queue<Node> queue = new LinkedList<>();

        //시작 노드 삽입
        queue.offer(graph.get(startNum));
        visited[startNum] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println("Visited: " + current.id);

            if (current.id == goalNum) {
                System.out.println("🎯 Found goal: " + goalNum);
                return true;
            }

            for (Node neighbor : current.neighbors) {
                if (!visited[neighbor.id]) {
                    visited[neighbor.id] = true;
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println("❌ Goal not reachable");
        return false;
    }


    static class Node {
        int id;
        List<Node> neighbors = new ArrayList<>();

        Node(int id) {
            this.id = id;
        }
    }
}
