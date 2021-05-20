package acs.ase.ro.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		SuperErouPrototype superErou=new SuperErouPrototype("C", 100, "SuperMan");
		SuperErouPrototype superErouPrototype=(SuperErouPrototype) superErou.clone();
		System.out.println(superErouPrototype.toString());

	}

}
