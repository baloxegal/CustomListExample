package collections;

public class SimpleList {
	
	private int lenght;
	private Box first;
	
	private class Box {
		int value;
		Box next;
		
		public Box(int value) {	
			this.value = value;
			next = null;
		}
	}
	
	public SimpleList() {
		lenght = 0;
		first = null;
	}
	
	public void add(int value) {
		Box current = first;
		if(lenght == 0) {
			first = new Box(value);
		}
		else {
			for(int i = 0; i < lenght - 1; i++) {
				current = current.next;
			}
			current.next = new Box(value);
		}
		lenght++;
	}
	
	public int getLenght() {
		return lenght;
	}
	
	public void print() {
		if(lenght == 0) {
			System.out.println("The list has no elements");
			return;
		}
		Box current = first;
		do {
			System.out.println(current.value);
			current = current.next;
		} while(current != null);
	}
	
	public int get (int index) {
		if(lenght == 0) {
			System.out.println("The list has no elements");
			return 0;
		}
		else if(lenght <= index) {
			System.out.println("The list has no element with that index");
			return 0;
		}
		Box current = first;
		if(index == 0) return current.value;
		int i = 0;
		do {
			current = current.next;
			i++;
		} while(i != index);
		return current.value;
	}
}