package eu.ase.clases;

public class Animal {

	private String name;
	private String color;//="maro";
	private int age=8;
	public boolean isOld(int age) throws Exception {
		
		if(age<0) {
			throw new Exception("Invaid age");
		}
		if(age>=6) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		this.name=newName;
	}

	public Animal() {
		super();
		this.name="Pedro";
		this.color="brown";
		this.age=7;
	}
	
	
}
