import java.util.*;

public class Graph{
	int vertices;
	LinkedList<Integer> adjacent[];

	public Graph(int vertices){
		this.vertices = vertices;

		adjacent = new LinkedList[vertices + 1];

		for (int i = 0; i <= vertices; i++){
			adjacent[i] = new LinkedList<Integer>();
		}
	}

	void addEdge(int vertex, int end){
		adjacent[vertex].add(end);
	}

	LinkedList<Integer>[] getGraph(){
		return adjacent;
	}
}