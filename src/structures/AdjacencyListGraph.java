package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyListGraph<V> implements Graph<V> {
	
	private Map<V,Integer> vertices;
	
	private List<List<Duplex<V, Integer>>> adjacencyList;
	
	private boolean isDirected;
	
	public AdjacencyListGraph(boolean d) {
		isDirected = d;
		adjacencyList = new ArrayList<List<Duplex<V, Integer>>>();
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
	public V searchVertex(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V removeVertex(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeEdge(V v, V u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean areConnected(V v, V u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<V> bfs(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<V> dfs(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<V, Double> dijkstra(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] floydWarshall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getVertexSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIndex(V vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<V> vertexAdjacent(V vertex) {
		// TODO Auto-generated method stub
		return null;
	}

}
