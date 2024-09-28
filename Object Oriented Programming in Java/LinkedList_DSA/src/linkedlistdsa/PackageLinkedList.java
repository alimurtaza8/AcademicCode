package linkedlistdsa;

import java.util.LinkedList;

public class PackageLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		// add
		list.addFirst("a");
		list.addFirst("is");
		// System.out.println(list);
		list.addLast("list");
		// System.out.println(list);

		// remove
		// list.removeFirst();
		// System.out.println(list);
		// list.removeLast();
		// System.out.println(list);

		// size
		// System.out.println(list.size());

		// loop
		// for(int i=0; i<list.size(); i++){
		// System.out.print(list.get(i) + "->");
		// }
		// System.out.println("null");

		search(list, "a");
		System.out.println(list);
	}

	public static void search(LinkedList<String> list, String search) {
		boolean cond = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.contains(search)) {
				cond = true;
				System.out.println(search + " found at index " + i);
			}
		}
		if (cond == false) {
			System.out.println("Not found");
		}
	}
}
