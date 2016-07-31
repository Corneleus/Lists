package Lists;
import java.util.ArrayList;

public class MergeTest {
	
	
	static ArrayUnsortedList<Integer> list1 = new ArrayUnsortedList<Integer>(3);
	static ArrayUnsortedList<Integer> list2 = new ArrayUnsortedList<Integer>(3);
	
	public static void main(String [] args){
		for(int i =0; i < 3; i++){
			list1.add(i);
			list2.add(i+3);
			
		}
		System.out.println(list1);
		System.out.println(list2);
				
		list1.merge(list2);
	
		System.out.println(list1);
	
	}
}
