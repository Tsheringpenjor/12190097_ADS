public class DigraphTest{
	public static void main(String[] args) {
		Digraph di = new Digraph(6);
		di.addEdge(0,5);
		di.addEdge(0,1);
		di.addEdge(2,0);
		di.addEdge(2,3);
		di.addEdge(3,5);
		di.addEdge(3,2);
		di.addEdge(4,3);
		di.addEdge(4,2);
		di.addEdge(5,4);
		System.out.println(di.toString());
	}
}