package tankhanh;


public class Program {
	static int a = 10;
	static void hello() {
		System.out.println("Hello world");
	}
	String hi() {
		return "Hi, there!";
	}
// Hàm => phương thức (method)
	public static void main(String[] args) {
		hello();
		System.out.println(a);
		
		Program pro = new Program();
		pro.hi();
		pro.hello();
	}

}
