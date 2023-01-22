import java.util.*;

public class RemoveDups{
	private static class Node {
		int data;
		Node next;
		public Node (int d){
			this.data = d;
		}
	}
	private static void RemoveDuplicates(Node head){
		List<Integer> lst = new ArrayList<Integer>();
		Node temp = head;
		while(head != null){
			if(lst.contains(head.data)){
				temp.next = head.next;
			}
			else 
			{
				lst.add(head.data);
				temp = head;
			}
			head = head.next;
		}
	}
	public static void main(String[] args){
		Node head = new Node(0);
		Node temp = head;
		for(int i = 1; i < 10; i++){
			int k = i;
			if(i > 5){
				k = 9;
			}
			temp.next = new Node(k);
			temp = temp.next;
		}
		PrintNodes(head);
		RemoveDuplicates(head);
		PrintNodes(head);
	}
	private static void PrintNodes(Node head){
		StringBuilder str = new StringBuilder();
		while(head != null){
			str.append("" + head.data + " ");
			head = head.next;
		}
		System.out.println(str.toString());
	}
}