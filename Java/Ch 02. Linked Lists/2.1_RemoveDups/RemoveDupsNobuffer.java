import java.util.*;

public class RemoveDupsNobuffer{
	private static class Node {
		int data;
		Node next;
		public Node (int d){
			this.data = d;
		}
	}
	private static void RemoveDuplicates(Node head){
		Node curr = head;
		while(curr != null){
			Node temp = curr;
			while(temp.next != null){
				if(temp.next.data == curr.data){
					temp.next = temp.next.next;
				}
				else
				{
					temp = temp.next;
				}
			}
			curr = curr.next;
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