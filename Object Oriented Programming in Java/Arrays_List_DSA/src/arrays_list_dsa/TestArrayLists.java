package arrays_list_dsa;
import java.util.ArrayList;
import java.util.Collections;

public class TestArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		//add
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);

		//get
		System.out.println(list.get(4));

		//add new element
		list.add(0,30);
		System.out.println(list);

		//set element
		list.set(0, 32);
		System.out.println(list);

		//remove
		list.remove(1);
		System.out.println(list);

		//loop
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		Collections.sort(list);
		System.out.println(list);
		

	}

}
