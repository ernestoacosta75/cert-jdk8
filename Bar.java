package foo.bar;
import foo.Foo;

public class Bar {
	public static void main(String [] args) {
		System.out.println("Static call from Bar class");
		//foo.Foo f1 = new foo.Foo();
		Foo f1 = new Foo();
		System.out.println(f1.methodOne());
	}
}
