package linkedlistdsa;

public class LinkedListTest {

	Node head;
	private int size;

	LinkedListTest() {
		size = 0;
	}

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// addFirst Method
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// addLast Method
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	// deleteFirst
	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;
	}

	// deleteLast
	public void deleteLast() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}

		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public void addInMiddle(int index, int data) {
		if (index > size || index < 0) {
			System.out.println("invalid index");
			return;
		}
		size++;

		Node newNode = new Node(data);
		if (head == null || index == 0) {
			newNode.next = head;
			head = newNode;
		}

		Node currNode = head;
		for (int i = 1; i < size; i++) {
			if (i == index) {
				Node nextNode = currNode.next;
				currNode.next = newNode;
				newNode.next = nextNode;
				break;
			}
		}
		currNode = currNode.next;
	}

	public int indexOf(int search) {
		Node currNode = head;
		int index = 0;
		while (currNode != null) {
			if (currNode.data == search) {
				return index;
			}
			currNode = currNode.next;
			index++;
		}
		return -1;
	}

	public void reverseIterate() {
		if (head == null || head.next == null) {
			return;
		}

		Node prevNode = head;
		Node currNode = head.next;
		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			// update;
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}

	public Node reverseRecursive(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;

		return newHead;
	}

	public Node removeNthFromEnd(Node head, int n) {
		if (head.next == null) {
			return null;
		}

		int size = 0;
		Node currNode = head;
		while (currNode != null) {
			currNode = currNode.next;
			size++;
		}

		if (n == size) {
			return head.next;
		}

		int indexToSearch = size - n;
		Node prevNode = head;
		int i = 1;
		while (i < indexToSearch) {
			prevNode = prevNode.next;
			i++;
		}
		prevNode.next = prevNode.next.next;

		return head;
	}

	public Node reverse(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node prevNode = head;
		Node currNode = head.next;

		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			// update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;

		return head;
	}

	public Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public boolean isPalindrom(Node head) {
		if (head == null || head.next == null) {
			return true;
		}

		Node middle = findMiddle(head);
		Node secondHalfStart = reverse(middle.next);

		Node firstHalfStart = head;
		while (secondHalfStart != null) {
			if (firstHalfStart.data != secondHalfStart.data) {
				return false;
			}
			firstHalfStart = firstHalfStart.next;
			secondHalfStart = secondHalfStart.next;
		}
		return true;
	}

	public boolean hasCycle(Node head) {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	public void removeCycle(Node head) {
		Node slow = head;
		Node fast = head;

		do {
			slow = slow.next;
			fast = fast.next.next;
		} while (slow != fast);

		slow = fast;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = null;
	}

	public int getSize() {
		return size;
	}

	// printList
	public void printList() {

		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {

		LinkedListTest list = new LinkedListTest();
		// list.addFirst(-4);
		// list.addFirst(0);
		// list.addFirst(2);
		// list.addFirst(3);
		// list.printList();
		// list.reverseIterate();

		list.addFirst(2);
		list.addFirst(1);

		System.out.println(list.hasCycle(list.head));
		list.printList();

		// list.head = list.reverseRecursive(list.head);
		// list.printList();

		// remove nth
		// list.head = list.removeNthFromEnd(list.head, 1);
		// list.printList();

		LinkedListTest list2 = new LinkedListTest();
		list2.addFirst(1);
		list2.addFirst(2);
		list2.addFirst(1);
		// list2.printList();
		// System.out.println(list2.isPalindrom(list2.head));

		// list.addFirst("a");
		// list.addFirst("is");
		// list.printList();
		// System.out.println(list.indexOf("dad"));

		// list.addLast("list");
		// list.addFirst("This");
		// list.printList();
		// list.addInMiddle(2,"Newlist");
		// list.printList();

		// list.deleteFirst();
		// list.printList();

		// list.deleteLast();
		// list.printList();

		// System.out.println(list.getSize());
		// list.deleteFirst();
		// list.printList();
		// System.out.println(list.getSize());
		// list.deleteFirst();
		// System.out.println(list.getSize());
	}

}
