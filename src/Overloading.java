
public class Overloading {
	
	public void methodA(int a){
	System.out.println("Inside Overloading intwaala");
	}

	public int methodA (Long a){
		System.out.println("Inside Overloading Longwaala");
		return 5;
	}
	//public void methodA(Integer a){
		//System.out.println("Inside Overloading Integer object waala");
	//}

public static void main(String args[]){
	Overloading o1 = new Overloading();
	o1.methodA(5);
	o1.methodA(5l);
	Integer i = new Integer(5);
	o1.methodA(i);
}
}
	


