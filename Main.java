import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		DynamicArrays dynamicArrays = new DynamicArrays(5);
		dynamicArrays.add("A");
		dynamicArrays.add("B");
		dynamicArrays.add("C");
		dynamicArrays.add("D");
		dynamicArrays.add("E");
		dynamicArrays.add("F");
		dynamicArrays.add("G");
		
		dynamicArrays.delete("A");
		dynamicArrays.delete("B");
		dynamicArrays.delete("C");
		dynamicArrays.delete("D");
//		dynamicArrays.insert(0, "X");
//		dynamicArrays.delete("B");
//		System.out.println(dynamicArrays.search("C"));
		
		System.out.println(dynamicArrays);
		System.out.println("empty :"+dynamicArrays.isEmpty());
		System.out.println("Size : "+dynamicArrays.size);
		System.out.println("capacity: "+dynamicArrays.capacity);
	}
}
					