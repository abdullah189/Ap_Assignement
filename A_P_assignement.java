

import java.util.ArrayList;

public class A_P_assignement {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public ArrayList<Integer> GET_EVEN(int N) {
		
		
		list = new ArrayList<Integer>();
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
	}
	
	public ArrayList<Integer> print() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
	}

	public static void main(String[] args) {
		A_P_assignement Obj = new A_P_assignement();
		///EVEN  10
		Obj.GET_EVEN(10);
		Obj.print();
		///Even 20
		Obj.GET_EVEN(20);
		
		Obj.print();
		

	}

}