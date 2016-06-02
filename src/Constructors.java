
public class Constructors {
	//Constructors(){
		//System.out.println("inside constructors");
	//}
	
	Constructors(int a){
		System.out.println("inside constructors int waala");
	}
	
public static void main (String [] args){
	//Constructors c = new Constructors();
	extender e = new extender(5);
	//extender e1 = new extender(1);
}
}
class extender extends Constructors{
	//Sub class unparameterised constructor invokes a unparameterised parent constructor 
/*	extender (){
		
	}*/

	extender(int a){
		//Since be default first line in each constructor is a call to a super constructor(unparameterised) so a parameterised 
		//constructor should be defined and explicitly called
		super(5);
		System.out.println("inside extender");
	}
	//extender(int a){
	//
		//System.out.println("inside extender int waala");
	//}
	
}