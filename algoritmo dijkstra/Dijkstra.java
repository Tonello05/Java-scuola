import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

    public static void dijkstra(Nodo start) {
        start.weight = 0;
        PriorityQueue<Nodo> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.weight));
        queue.add(start);

        while (!queue.isEmpty()) {
            Nodo current = queue.poll();
            for (Nodo neighbor : current.links.keySet()) {
                int distance = current.weightTo(neighbor);
                if (distance < neighbor.weight) {
                    queue.remove(neighbor);
                    neighbor.weight = distance;
                    neighbor.prev = current;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static List<Nodo> getPath(Nodo target) {
        List<Nodo> path = new ArrayList<>();
        for (Nodo node = target; node != null; node = node.prev) {
            path.add(0, node);
            System.out.println(node.label);
        }
        return path;
    }
}
