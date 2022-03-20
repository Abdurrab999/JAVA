import java.util.*;

public class LL {
	Node head;
	int size;
	LL(){
		this.size=0;
		}
	class Node{
		
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head == null) {
			head=newNode;
			return;
			}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	public void printList() {
		if(head==null) {
			System.out.println("List is Empty");
		return;}
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println("NULL");
		}
	//Delete First Node 
	public void deleteFirst() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		head=head.next;		//Second element become the head and first is deleted
		size--;
	}
	//Delete Last
	public void deleteLast() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondlast=head;
		Node last=head.next;
		while(last.next!=null)
		{
			last=last.next;
			secondlast=secondlast.next;
		}
		secondlast.next=null;		//second last becomes null and last is deleted
	}
	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		LL list=new LL();
		list.addFirst("is");
		list.addFirst("Name");
		list.printList();
		list.addLast("Khan");
		list.addFirst("My");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
		System.out.println(list.getSize());
		list.addFirst("My");
		System.out.println(list.getSize());
		
		
	}

}
