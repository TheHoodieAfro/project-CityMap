package structures;

import java.util.List;
import java.util.Map;

/**
 * This interface has the basic methods every graph must have without depending on the representation used
 * @author Juan Pablo Herrera
 * @author Alejandro parra
 * @author Cristian Sanchez
 * @version 1.0
 * @param <V> represents the object contained in the graph
 */
public interface Graph<V> {
	
	/**
	 * Adds a vertex to the graph
	 * @param v The vertex to add
	 * @return True/false if the vertex was succesfully added or not
	 */
	public boolean addVertex(V v);
	
	/**
	 * Adds an edge between two vertices
	 * @param v initial vertex
	 * @param u final vertex
	 * @return true/false if the edge was succesfully added
	 */
	public boolean addEdge(V v, V u);
	
	/**
	 * Adds a weigthed edge between two vertices 
	 * @param v initial vertex
	 * @param u final vertex
	 * @param w weight of the edge
	 * @return true/false if the edge was succesfully added
	 */
	public boolean addEdge(V v, V u, int w);
	
	/**
	 * Gets the object V with the id used
	 * @param id Identification of the object
	 * @return Object V with the id
	 */
	public V searchVertex(String id);
	
	/**
	 * Removes am edge from the graph
	 * @param v Edge to be removed
	 * @return The removed edge
	 */
	public V removeVertex(V v);
	
	/**
	 * Removes the edge between two vertices
	 * @param v inital vertex
	 * @param u final vertex
	 * @return true/false if the edge was succesfully removed
	 */
	public boolean removeEdge(V v, V u);
	
	/**
	 * Tells if two vertices are connected
	 * @param v initial vertex
	 * @param u final vertex
	 * @return true/false if the two vertices are connected or not
	 */
	public boolean areConnected(V v, V u);
	
	public List<V> bfs(V v);
	
	public List<V> dfs(V v);
	
	public Map<V, Double> dijkstra(V v);
	
	public int[][] floydWarshall();

	public int getVertexSize();

	public int getIndex(V vertex);

	public List<V> vertexAdjacent(V vertex);
	
}
