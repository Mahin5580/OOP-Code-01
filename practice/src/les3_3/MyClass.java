package les3_3;

public class MyClass {
int a=50;
static int b=100;

public void method() {
	int n=90;
	System.out.println(n);
	System.out.println(a);
	System.out.println(b);
	
}
public void method1() {

	System.out.println(n);
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[]args) {
	MyClass ob=new MyClass();
	ob.method();
	ob.method1();
}
}
