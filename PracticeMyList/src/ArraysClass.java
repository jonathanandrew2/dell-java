import java.util.ArrayList;

public class ArraysClass {

	public static void main(String[] args) {
		String[] myArrayOfColors = {"blue", "red", "yellow"};

		  System.out.println(myArrayOfColors[0]);
		  System.out.println(myArrayOfColors[1]);
		  System.out.println(myArrayOfColors[2]);

		ArrayList<String> myList = new ArrayList();
		  myList.add("blue");
		  myList.add("yellow");
		  myList.add("red");
		  
		 
		  System.out.println(myList);
	}
	public static class MyList{
		String[] store = new String[10];
		int size = 0;
		
	public void add(String s) {
		store[size] = s;
		if(size == store.length) {
			String[] tmp = new String[size+10];
			for(int i = 0; i<store.length; i++) {
				tmp[i] = store[i];
			}
			store = tmp;
		}
		store[size] = s;
		size = size +1;
		
	}
	public int size() {
		return size;
		
	}
	
	public String get(int i) {
		if(i < 0 || i > size -1) {
			return null;
		}
		return store[i];
		
	}
	public void remove(int i) {
		if(i<0 || i >= 5) {
			return;
		}
		for(int j = i; j <size-1; j++) {
			store[j] = store[j+1];
		}
		store[size-1] = null;
		size = size -1;

	}
	}

}
