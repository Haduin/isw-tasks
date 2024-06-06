import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            graph.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        Set<Integer> visited = new HashSet<>();
        int components = 0;

        for (int vertex : graph.keySet()) {
            if (!visited.contains(vertex)) {
                components++;
                dfs(vertex, graph, visited);
            }
        }

        for (int vertex : graph.keySet()) {
            if (!visited.contains(vertex)) {
                components++;
            }
        }

        System.out.println(components);
        scanner.close();
    }

    private static void dfs(int vertex, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (!visited.contains(current)) {
                visited.add(current);

                for (int neighbor : graph.get(current)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}
