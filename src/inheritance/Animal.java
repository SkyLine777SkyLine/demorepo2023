package inheritance;

public class Animal {// Super (parent class)
	
	//Access modifiers: public, private, protected, (default = nothing)
	//public available everywhere in the project
	//private - available only inside 
	//protected - available for the subclass anywhere, available in the same package
	//default - available only in the same package
	public String name;
	public double size;
	
	public void move() {
		System.out.println("Moving");
	}
	private void eat() {
		System.out.println("Eating");
		
	}

	public void printName() {
		System.out.println(name);
	}
}
