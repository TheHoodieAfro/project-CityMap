package structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import java.util.Queue;

public class Algorithms {
	
	public static <V> List<V> bfs(Graph<V> g, V v){
		return traversal(g, v, new Stack<>());
	}
	
	public static <V> List<V> dfs (Graph<V> g, V v){
		return traversal(g, v, new LinkedList<V>());
	}
	
	private static <V> List<V> traversal(Graph<V> g, V v, Stack ds){
		List<V> trav = new ArrayList<>();
		//Invariant: Each algorithm adds the given element first. 

		V vertex = v;
		ds.add(vertex);
		
		boolean[] visited = new boolean[g.getVertexSize()];
		
		//Invariant: While the traversal occurs, the given DS to be used will have, at least, one element.
		while(!ds.isEmpty()) {
			 //Invariant: Element added is always retired from the DS
			vertex = (V) ds.pop();
			int indexV = g.getIndex(vertex);
			
			if(!visited[indexV]) {
				trav.add(vertex);
				visited[indexV] = true;
				
				List<V> adjacents = g.vertexAdjacent(vertex);
				ds.addAll(adjacents);
			}
		}
		return trav;
	}
	
	private static <V> List<V> traversal(Graph<V> g, V v, Queue ds){
		List<V> trav = new ArrayList<>();
		//Invariant: Each algorithm adds the given element first. 

		V vertex = v;
		ds.add(vertex);
		
		boolean[] visited = new boolean[g.getVertexSize()];
		
		//Invariant: While the traversal occurs, the given DS to be used will have, at least, one element.
		while(!ds.isEmpty()) {
			 //Invariant: Element added is always retired from the DS
			vertex = (V) ds.poll();
			int indexV = g.getIndex(vertex);
			
			if(!visited[indexV]) {
				trav.add(vertex);
				visited[indexV] = true;
				
				List<V> adjacents = g.vertexAdjacent(vertex);
				ds.addAll(adjacents);
			}
		}
		return trav;
	}
	
	public static <V> Map<V, Double> dijkstra(Graph<V> g, V v){
		return null; //TODO Create method
	}
	
	public static <V> int[][] floydWarshall(Graph<V> g){
		return null;
	}
	
}
