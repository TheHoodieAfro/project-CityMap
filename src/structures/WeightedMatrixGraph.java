package structures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class represents a weighted graph using a matrix
 * @author Cristian Sanchez - Juan Pablo Herrera
 * @version 1.0 - 11/2019
 * @param <V> Abstract data type that represents the object to be modeled in the graph
 */
public class WeightedMatrixGraph<V> implements Graph<V> {
	
	public final static int DEFAULT_SIZE = 10;
	
	private Algorithms alg;
	
	/**
	 * Map that stores the vertices and gives them a unique index
	 */
	private Map<V,Integer> Vertex;
	
	/**
	 * Weighted matrix used to represent the graph
	 */
	private int[][] Weight;
	
	/**
	 * atribute used to represent if the grpah is directed or not
	 */
	public boolean isDirected;
	
	/**
	 * Constructor that creates an object of the type WeightedMatrixGraph with a default amount of vertices
	 * @param d directed or not
	 */
	public WeightedMatrixGraph(boolean d) {
		Vertex = new HashMap<V, Integer>();
		Weight = new int[DEFAULT_SIZE][DEFAULT_SIZE];
		isDirected = d;
	}
	
	/**
	 * Constructor that creates an object of the type WeightedMatrixGraph with a selected amount of vertices
	 * @param v Amount of vertices
	 * @param d directed or not
	 */
	public WeightedMatrixGraph(int v, boolean d) {
		Vertex = new HashMap<V, Integer>();
		Weight = new int[v][v];
		isDirected = d;
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

	@Override
	public boolean isDirected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<V, Integer> getVertices() {
		// TODO Auto-generated method stub
		return null;
	}

}
