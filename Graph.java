import java.util.*;

public class Graph{
	int vertices;
	LinkedList<Integer> adjacent[]; ///array of pointers and each points to a linked list

	/*Intialization*/
	public Graph(int vertices){
		this.vertices = vertices;

		adjacent = new LinkedList[vertices + 1];

		for (int i = 0; i <= vertices; i++){
			adjacent[i] = new LinkedList<Integer>();
		}
	}

	/*Add edges to the linked list*/
	void addEdge(int vertex, int end){
		adjacent[vertex].add(end);
	}

	LinkedList<Integer>[] getGraph(){
		return adjacent;
	}
}