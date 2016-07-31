package Lists;

public class CarTest {

	public static void main(String [] args){
		ArrayUnsortedList<Car> list = new ArrayUnsortedList<Car>(10);	
		
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		list.add(new Car(1999, "Ford", "Model T", 32000.00));
		
		System.out.println(list);
		System.out.println();
		System.out.println("Total price: " + Car.totalPrice(list) + "$");
			
	}
}
