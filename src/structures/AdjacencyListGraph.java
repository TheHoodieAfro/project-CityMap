package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.beans.binding.When;

public class AdjacencyListGraph<V> implements Graph<V> {
	
	private Algorithms alg;
	
	private Map<Integer, V> invVertices;
	private Map<V, Integer> vertices;
	
	private List<List<Duplex<V, Integer>>> adjacencyList;
	private int[][] weightedMatrix;
	
	private boolean isDirected;
	
	public AdjacencyListGraph(boolean d) {
		isDirected = d;
		adjacencyList = new ArrayList<List<Duplex<V, Integer>>>();
		weightedMatrix = new int[vertices.size()][vertices.size()];
		vertices = new HashMap<V, Integer>();
	}

	@Override
	public boolean addVertex(V v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEdge(V v, V u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEdge(V v, V u, int w) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeVertex(V v) {
		
	}

	@Override
	public void removeEdge(V v, V u) {
		List<Duplex<V, Integer>> ad = adjacencyList.get(vertices.get(v));
		boolean stop = false;
		
		for(int i=0; i<ad.size() && !stop; i++) {
			if(ad.get(i).getE1().equals(u)) {
				ad.remove(i);
				stop = true;
			}	
		}
		
		if(!isDirected) {
			ad = adjacencyList.get(vertices.get(u));
			stop = false;
			
			for(int i=0; i<ad.size() && !stop; i++) {
				if(ad.get(i).getE1().equals(v)) {
					ad.remove(i);
					stop = true;
				}
			}
		}
	}

	@Override
	public boolean areConnected(V v, V u) {
		List<Duplex<V, Integer>> ad = adjacencyList.get(vertices.get(v));
		
		for(int i=0; i<ad.size(); i++) {
			if(ad.get(i).getE1().equals(u)) return true;
		}
		
		return false;
	}
	
	public void WeightedMatrix() {
		for(int i=0; i<adjacencyList.size(); i++) {
			List<Duplex<V, Integer>> trans = adjacencyList.get(i);
			for(int j=0; j<trans.size(); j++) {
				Duplex<V, Integer> dupla = trans.get(j);
				weightedMatrix[i][vertices.get(dupla.getE1())] = dupla.getE2();
			}
		}
		for(int i=0; i<weightedMatrix.length; i++) {
			for(int j=0; j<weightedMatrix.length; j++) {
				if(i != j) weightedMatrix[i][j] = Integer.MAX_VALUE	;
			}
		}
	}

	@Override
	public List<V> bfs(V v) {
		return (vertices.size() != 0)? Algorithms.bfs(this, invVertices.get(0)) : null;
	}

	@Override
	public List<V> dfs(V v) {
		return (vertices.size() != 0)? Algorithms.dfs(this, invVertices.get(0)) : null;
	}

	@Override
	public Map<V, Double> dijkstra(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] floydWarshall() {
		return (vertices.size() != 0)? Algorithms.floydWarshall(weightedMatrix) : null;
	}

	@Override
	public int getVertexSize() {
		return vertices.size();
	}

	@Override
	public int getIndex(V vertex) {
		return vertices.get(vertex);
	}

	@Override
	public List<V> vertexAdjacent(V vertex) {
		List<V> adjacent = new ArrayList<V>();
		List<Duplex<V, Integer>> ad = adjacencyList.get(vertices.get(vertex));
		
		for(int i=0; i<ad.size(); i++) {
			adjacent.add(ad.get(i).getE1());
		}
		
		return adjacent;
	}

	@Override
	public boolean isDirected() {
		return isDirected;
	}

	@Override
	public Map<V, Integer> getVertices() {
		return vertices;
	}

}
