package hwgit;

public class A {

	public void ask(String some) {
		System.out.println("ask "+ some);

	}
	public static void main(String[] args) {
		System.out.println("Hello HwGit");
		B n1 = new B();
		n1.sayHello("123");
		C n2 = new C();
		n2.sayGoodbye("456");
	}

}
