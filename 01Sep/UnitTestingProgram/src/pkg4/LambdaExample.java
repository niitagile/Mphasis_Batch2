package pkg4;
//an interface which contains only 1 abstract method
@FunctionalInterface
interface Test{
	void addition(int a, int b);
}

interface Greeting{
	public void Greet(String msg);
}

/*class ClassA implements Test{

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);
		
	}
	
}*/
public class LambdaExample {
	public static void main(String[] args) {
		
	//Test test=new ClassA();
	
		Test test=(a, b)-> System.out.println(a+b);
			
		
		test.addition(5, 4);
		Greeting obj=(msg)->System.out.println(msg);
		obj.Greet("Good Morning");
	
	}
}

