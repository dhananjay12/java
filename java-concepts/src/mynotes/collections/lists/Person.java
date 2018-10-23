package mynotes.collections.lists;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name="+name+"\t"+"Age="+age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}