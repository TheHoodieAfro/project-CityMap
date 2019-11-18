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
	
	private static <V> List<V> traversal(Graph<V> g, V v, Stack<V> ds){
		List<V> trav = new ArrayList<>();
		//Invariant: Each algorithm adds the given element first. 

		V vertex = v;
		ds.push(vertex);
		
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
	
	private static <V> List<V> traversal(Graph<V> g, V v, Queue<V> ds){
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
	
	public static <V> int[] dijkstra(int[][] g, int v){
		int[] dis = new int[g.length];
		boolean[] vis = new boolean[g.length];
		
		
		for (int i=0; i < dis.length; i++) { 
            dis[i] = Integer.MAX_VALUE; 
        }
		dis[v] = 0;
		
		for (int i=0; i<v-1; i++) {  
            int u = minIndex(dis, vis); 
  
            vis[u] = true; 

            for (int j=0; j<v; j++) {
                if (!vis[v] && g[u][v] != 0 && dis[u] != Integer.MAX_VALUE && dis[u] + g[u][v] < dis[v]) 
                   dis[v] = dis[u] + g[u][v]; 
            }
        }
		
		return dis;
		
	}
	
	private static int minIndex(int[] dis, boolean[] vis) 
    { 
        // Initialize min value 
        int min = Integer.MAX_VALUE;
        int indx = -1; 
  
        for (int i=0; i<dis.length; i++) 
            if (vis[i] == false && dis[i] <= min) { 
                min = dis[i]; 
                indx = i; 
            } 
  
        return indx; 
    }
	
	public static <V> int[][] floydWarshall(int[][] w){
		int n = w.length;
		int[][] D = w;
		int v = 0;
		
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					
					if(j != k || i != k) {
						if(D[i][k] != Integer.MAX_VALUE && D[k][j] != Integer.MAX_VALUE) {
							
							v = D[i][k] + D[k][j];
							
							if(D[i][j] > v) D[i][j] = v;
							
						}
						
					}
					
				}
			}
		}
		
		return D;
	}
	
}
