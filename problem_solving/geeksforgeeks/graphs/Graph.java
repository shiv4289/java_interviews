package geeksforgeeks.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by sourabh on 17/6/16.
 */
public class Graph {
    Integer V;
    LinkedList<Integer> A[];
    ArrayList<Boolean> visited;

    public Graph(Integer v) {
        V = v;
        visited = new ArrayList<>(v);
        A = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            A[i] = new LinkedList<Integer>();
            visited.add(false);
        }
    }

    public void addEdge(Integer s, Integer e) {
        A[s].add(e);
    }

    public void DFS(Integer v) {
        System.out.println(v);
        visited.set(v, true);
        for (int i = 0; i < A[v].size(); i++) {
            if (!visited.get(A[v].get(i))) {
                DFS(A[v].get(i));
            }
        }
    }

    public boolean isReachable(Integer s, Integer d) {
        if (s == d) return true;
        visited.set(s, true);
        for (int i = 0; i < A[s].size(); i++) {
            if (!visited.get(A[s].get(i))) {
                if (isReachable(A[s].get(i), d))
                    return true;
            }
        }
        return false;
    }

}
