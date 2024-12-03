package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleLists {
	
	public static void main (String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Lucas");
		list.add("Rafael");
		list.add("Fernanda");
		list.add("Sophia");
		list.add("Laura");
		
		list.add(2, "Marcia");
		
		System.out.println(list.size());
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------");
		
		list.remove(1);
		list.remove("Fernanda");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Index of Sophia: " + list.indexOf("Sophia"));
		System.out.println("Index of Fernanda: " + list.indexOf("Fernanda"));
		
		System.out.println("---------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for (String x: result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		String name2 = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
		
		System.out.println(name);
		System.out.println(name2);
	}

}
