package main;

public class Main {

	public static void main(String[] args) {

		Stack list = new Stack(10);
		
		list.push('3');
		list.push('6');
		System.out.println(list.pop());
		list.push('1');
		System.out.println(list.isEmpty());
		System.out.println(list.toString());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.isEmpty());
		
		
		
	}

}
