package com.meetashwin.ds;

class Node {
	public int value;
	public Node next;

	public Node(int v, Node n) {
		this.value = v;
		this.next = n;
	}
}

public class LLOperations {
	public static Node createLinkedList(Node[] nodes) {
		int nodes_size = nodes.length;
		if (nodes == null || nodes_size == 0) {
			return null;
		}
		Node head_node = nodes[0]; // First node becomes the head
		Node curr_node = head_node;
		for (int i=1; i < nodes_size; ++i) {
			curr_node.next = nodes[i];
			curr_node = nodes[i];
		}
		return head_node;
	}

	public static void printLinkedList(Node head_node) {
		if (head_node == null) {
			System.out.println("Empty Linked List!");
		}
		Node curr_node = head_node;
		do {
			System.out.println(curr_node.value + " ");
			curr_node = curr_node.next;
		} while(curr_node != null);
	}

	public static Node addToLinkedList(Node head_node, Node new_node) {
		if (new_node == null) {
			System.out.println("Cannot add empty element to Linked List");
			return null;
		}
		
		// 1. Head becomes the next of New node
		new_node.next = head_node;

		// 2. Return the new head
		return new_node;
	}

	public static Node deleteValueFromLinkedList(Node head_node, int value) {
		Node new_head = null;
		// If the value is found in the head node
		if (head_node.value == value) {
				new_head = head_node.next;
				head_node = null;
				return new_head;
		}
		new_head = head_node;
		Node prev_node = head_node;
		Node curr_node = head_node.next;
		// When you find the value, link the previous node to next node and free memory for current node
		do {
				if (curr_node.value == value) {
					prev_node.next = curr_node.next;
					curr_node = null;
					break;
				}
				prev_node = curr_node;
				curr_node = curr_node.next;
		} while(curr_node != null);

		return new_head;
	}

	public static boolean isLinkedListCircular(Node head_node) {
		boolean isCircular = false;
		//If this is the only node, it is circular
		if (head_node != null && head_node.next == null) {
			isCircular = true;
			return isCircular;
		}

		Node prev_node = head_node;
		Node curr_node = head_node.next;
		do {
				// If next node of current is the head, then it is circular
				if (curr_node.next == head_node) {
						isCircular = true;
						break;
				}
				curr_node = curr_node.next;
		} while(curr_node != null);

		return isCircular;
	}
}