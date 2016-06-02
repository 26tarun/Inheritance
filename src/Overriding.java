
public class Overriding {
	public void method (){
		System.out.println("inside overriding");
	}
	public void method(int a){
		System.out.println("inside overriding int waala");
	}
public static void main (String args[]){
	Overriding o1 = new Overriding();
	o1.method(5);
	o1=new inheritor();
	o1.method(5);
	inheritor i1 = new inheritor();
	
	i1.method();
	i1.method(5);
}
}
class inheritor extends Overriding{
public void method(){
	System.out.println("inside inheritor");
}	
public void method(int a){
	System.out.println("inside inheritor int wala");
}
//inheritor e1 = new inheritor();
public void caller(){
//	e1.method();```
}

}
