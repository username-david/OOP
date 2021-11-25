import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Iterator;

public class CollectionAccess {
	private static final Person BOB = new Person("Bob", 1);
	public static void main(String[] args) {
////		final String a = "Bob";
////		String b = new String("Bob");
//		Person b = new Person("Bob");
//		b = null;
//		int t = 1;
//		int x = 1;
//		if(t == x) {
//			System.out.println("t = x");
//		}
////		if(a == b) {
////			System.out.println("A = B");
////		}
//
//		if(BOB.equals(b)) {
//			System.out.println("1 A equals B");
//		}
//		
//		if(b != null && b.equals(BOB)) {
//			System.out.println("2 A equals B");
//		}
		
		
//		List<String> list = new ArrayList<>();
//        list.add("One");//string "One" at index 0
//        list.add("Two");
//        list.add("Four");
//        list.add("Three");
//        System.out.println(list.get(1));
//        for(int i = 0 ; i < list.size(); i++) {
//        	System.out.println("Cach1 :"+list.get(i));
//        }
//        
//        for(String value : list) {
//        	System.out.println("Cach2 :"+value);
//        }
//        Iterator<String> its = list.iterator();
//        while(its.hasNext()) {
//        	System.out.println("Cach3 :"+its.next());
//        }
        
//		List list1 = new ArrayList();
//		list1.add("One");//string "One" at index 0
//		list1.add("Two");
//		list1.add(1);
//		list1.add(new Person("Test"));
//		for(int i = 0 ; i < list1.size(); i++) {
//			Object obj = list1.get(i);
//			if(obj instanceof Person) {
//				System.out.println(obj);
//			} else if(obj instanceof Object) {
//				System.out.println("Obj " + obj);
//			}
//        }
////        
//        List<Integer> intlist = new ArrayList<>();
//        intlist.add(1);//string "One" at index 0
//        intlist.add(2);
//        intlist.add(3);
//        intlist.add(1);
//        Collections
//        for(Integer value : intlist) {
//        	System.out.println("Cach1 :"+value);
//        }
//        
//		
//		Map<Integer,String> map = new HashMap<>();
//        map.put(1,"One");
//        map.put(2, "Two");
//        System.out.println(map.get(1));
//        
//        Set<Integer> keys = map.keySet();
//        
//        for(Integer key : keys) {
//	      	System.out.println("Cach1 :key : "+key + " -- Value: "+ map.get(key));
//	    }
//        for(Entry<Integer, String> entry : map.entrySet()) {
//        	System.out.println("Cach2 :key : "+entry.getKey() + " -- Value: "+ entry.getValue());
//        }
//        
        
//		
//		Set<String> set = new HashSet<>();
//        set.add("One");
//        set.add("Two");
//        System.out.println(set.size());
//		Set<Integer> intlist = new HashSet();
//	      intlist.add(4);//string "One" at index 0
//	      intlist.add(1);
//	      intlist.add(3);
//	      intlist.add(1);
//	      intlist.add(2);
//	      for(Integer value : intlist) {
//	      	System.out.println("Cach1 :"+value);
//	      }
	     
//	      Set<Integer> intlist1 = new TreeSet<Integer>();
//	      intlist1.add(4);//string "One" at index 0
//	      intlist1.add(1);
//	      intlist1.add(3);
//	      intlist1.add(1);
//	      intlist1.add(2);
//	      
//	      for(Integer value : intlist1) {
//	      	System.out.println("Cach1 :"+value);
//	      }
//	      
//	      
//	      Iterator<Integer> its = intlist1.iterator();
//	      while(its.hasNext()) {
//        	System.out.println("Cach2 :"+its.next());
//	      }
	      
//		
//		for(String value : list){
//			System.out.println(value);
//		}
//
//		for(Entry<Integer,String> entry : map.entrySet()) {
//		   System.out.println(entry.getKey());
//		   System.out.println(entry.getValue());
//		}
//
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//		   System.out.println(it.next());
//		}
//		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("One", 1));
		persons.add(new Person("Two", 2));
		persons.add(new Person("One", 6));
		persons.add(new Person("Hoan", 3));

		for(Person person : persons){
			System.out.println("Org: " +person);
		}
		Collections.sort(persons);
		for(Person person : persons){
			System.out.println("Default sort: " +person);
		}
		
		persons.sort(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
			// sort by name attribute with descending order
		});
		for(Person person : persons){
			System.out.println("Special sort: " +person);
		}

   }
}

class Person implements Comparable {
	
	
	private String name;
	private int age;

	@Override
	public String toString()  {
		return "Person [name=" + name + " -- age :"+ age+"]";
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(Object anObject) {
		if(anObject == null) {
			return false;
		}
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof Person) {
        	Person p1 = (Person)anObject;
            return this.getName().equals(p1.getName());
        }
        return false;
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o == null) {
			return -1;
		}
        if (this == o) {
            return 0;
        }
        if (o instanceof Person) {
        	Person p1 = (Person)o;
            return this.getName().compareTo(p1.getName());
        }
		return 1;
	}
}