package sprogskift;

import java.util.LinkedList;

public class MyLinkedList extends LinkedList{
	Node head;
	
	public void add(Dog dog) {
		// empty  list?
		if(this.head == null) {
			Node newNode = new Node(dog);
			this.head = newNode;
		} else {
			// set this a first node
			Node newNode = new Node(dog);
			newNode.next = head;
			this.head = newNode;
		}
	}
	
	public void findInList(String searchitem) {
		// start at the beginning and then move from node to node
		Node currNode = this.head;
		while (currNode != null) {
			if (currNode.getData().getName().equals(searchitem)) {
				System.out.println(searchitem + " found at " + currNode.getData());
			}
			//and now move to the next
			currNode = currNode.getNext();
		}
		
	}
	public void printList(int size) {
		Node currNode = this.head;
		int counter = 0;
		while (currNode != null) {
			counter++;
			if (counter > size) {
				break;
			} 
			System.out.println("Node: " + currNode.getData());
			currNode = currNode.getNext();
		}
	}
	
}
