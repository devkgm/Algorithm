import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) graph[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (!graph[a].contains(b)) graph[a].add(b);
            if (!graph[b].contains(a)) graph[b].add(a);
        }
        boolean[] visited = new boolean[n + 1];
        dfs(n, v, graph, visited);
        bfs(n, v, graph);


    }
    static void dfs(int n, int v, List<Integer>[] graph, boolean[] visited) {
        System.out.println(v);
        visited[v] = true;
        graph[v].sort((a, b) -> a - b);
        for (int next : graph[v]) {
            if (!visited[next]) dfs(n, next, graph, visited);
        }
    }
    static void bfs(int n, int v, List<Integer>[] graph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        queue.offer(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            Integer q = queue.poll();
            System.out.println(q);
            visited[q] = true;
            graph[q].sort((a, b) -> a - b);
            for (int i : graph[q]) {
                if (!visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
