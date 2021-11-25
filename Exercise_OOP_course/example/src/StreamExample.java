
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
//		System.out.println("Stream");
//		Stream.of("a1", "a2", "a3")
//	    .map(s -> s.substring(1))
//	    .mapToInt(Integer::parseInt)
//	    .max()
//	    .ifPresent(System.out::println);
//		
//		List<String> list = new ArrayList<String>();
//		list.add("a1");
//		list.add("a2");
//		list.add("a3");
//		int max = -1;
//		for(String value : list) {
//			String temp = value.substring(1);
//			int t = Integer.parseInt(temp);
//			if(t > max) {
//				max = t;
//			}
//		}
//		if(max > -1) {
//			System.out.println(max);
//		}
		
		System.out.println("Sequential stream");
		long timestart = System.currentTimeMillis();
		Stream.iterate(0, n -> n + 1).limit(2000000).filter(n -> {
			return n % 2 == 0;
		}).map(n -> {
				System.out.println(n);
				return n;
					}).collect(Collectors.toList());
//		
		System.out.println("Total  time run stream:" +(System.currentTimeMillis() - timestart )+" ms");
		timestart = System.currentTimeMillis();
		System.out.println("Parallel stream");
		Stream.iterate(0, n -> n + 1).limit(2000000).parallel().filter(n -> {
			return n % 2 == 0;
		}).map(n -> {
				System.out.println(n);
				return n;
					}).collect(Collectors.toList());
		System.out.println("Total  time run stream:" +(System.currentTimeMillis() - timestart )+" ms");
	}
}

