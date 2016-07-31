package Lists;

public class ListTest {

	public static void main(String [] args){
		ArrayUnsortedList<Integer> list1 = new ArrayUnsortedList<Integer>(10);
		ArrayUnsortedList<Integer> lista = new ArrayUnsortedList<Integer>(10);
		ArrayUnsortedList<Integer> listb = new ArrayUnsortedList<Integer>(10);
		
		System.out.println(list1.isEmpty());// 6.23
		
		// fill list 1
		for(int i = 0; i < 10; i++){
			lista.add(i);
			listb.add(i+10);
		}
		// fill list 1
		for(int i = 0; i < 10; i++){
			list1.add(i);
			
		}
		
		list1.add(5);
		list1.add(5);
		list1.removeAll(5);// 6.51
		
		System.out.println("Number of items removed: " + list1.removeAll(5));// 6.24
		System.out.println(list1.isEmpty());
		System.out.println(list1);
		
		System.out.println(lista);
		System.out.println(listb);
		lista.merge(listb);// 6.30
		System.out.println(lista);
			
	}
}
