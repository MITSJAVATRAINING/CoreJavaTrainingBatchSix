package jabaeightexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicFeatures {

	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		
//		for (Integer a: list) {
//			System.out.println("The square is :- "+  a*a);
//		}
		
		int sum = list.stream().reduce(1,(ans, i) -> ans * i); // 0 + 10 = 10 + 50 = 60 .....
		System.out.println("The additon of numbers is " + sum);
		
		list.stream().sorted().collect(Collectors.toList());
		
		List<Integer> sq = list.stream().map(x -> x*x).collect(Collectors.toList());
		sq.forEach(x -> System.out.println(x));
		
		List<String> names = new ArrayList<String>();
		names.add("Shaleen");
		names.add("Ramya");
		names.add("Naveen");
		names.add("Rahul");
		names.add("Divya");
		names.add("Sameer");
		
		names.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList()).forEach(x -> {
			System.out.println("Filtered element are " + x );
		});
		
//		Operation sum = (int x, int y) -> x + y;
//		
//		System.out.println("The addition of number 10 and 2 is " + sum.calculate(10, 2));
//		
//		Operation substract = (int x, int y) -> x - y;
//		
//		System.out.println("Substraction of number 10 and 2 is " + substract.calculate(10, 2));
//		
//		System.out.println("The cube of no 3 is " + Operation.cube(3));
	}
}
