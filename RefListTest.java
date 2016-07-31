package Lists;

public class RefListTest {
	public static void main(String [] args){
		
		RefUnsortedList<Integer> list = new RefUnsortedList<Integer>();
		
		
		for(int i = 0; i < 10; i++){
			list.add(i);
		}
	
		list.add(5);
			
		System.out.println(list);
		
		System.out.println("Number of items removed: " + list.removeAll(5));
		System.out.println("Number of items removed: " + list.removeAll(5));
		System.out.println("Number of items removed: " + list.removeAll(4));
	
		System.out.println(list);
		
	
		list.endInsert(15);
		System.out.println(list);
	}
	
}
