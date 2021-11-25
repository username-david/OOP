package test.one;

import java.util.Date;

public class Person implements Comparable<Person>{
	private String name;
	private String bod;
	
	public Person(String name, String bod) {
		super();
		this.name = name;
		this.bod = bod;
	}
	@Override
	public int compareTo(Person o) {
		return this.getName().compareTo(o.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBod() {
		return bod;
	}
	public void setBod(String bod) {
		this.bod = bod;
	}
	
	public boolean equals(Person o) {
		return this.getName().equals(o.getName());
	}
	
	public int hashCode() { return this.getName().hashCode();}

}