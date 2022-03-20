import java.util.*;
//Creating Linked list using collection framework
public class LLCollection {

	public static void main(String[] args) {
		LinkedList<String> listt=new LinkedList<String>();
		listt.add("name");
		listt.addFirst("My"); //add element to the first node
		listt.addLast("is");
		listt.add("khan");	//When we use add instead of addLast then by defaul the node is added at the last.
		System.out.println(listt);
		System.out.println(listt.size());
		for(int i=0;i<listt.size();i++) {
			System.out.print(listt.get(i)+"->");
		}
		System.out.println("Null");
		listt.removeFirst();
		System.out.println(listt);

	}

}
