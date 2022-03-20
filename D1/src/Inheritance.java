//Inheritance
class Phone{
	public String s;
	public void X(String s) {
		this.s=s;
	}
	public String printX() {
		return s;
	}
	
}
class Smartphone extends Phone
{
	public String t;
	public void Printt() {
		System.out.println(t);
	}
	
}
public class Inheritance {

	public static void main(String[] args) {

//		Phone p=new Phone();			//Creating an object of Parent class.
		Smartphone q=new Smartphone();  //Creating an object of child class.
		q.X("Apple");					//Accessing methods of parent class using the object of child class.
		System.out.println(q.printX());
		q.t="Iphone";
		q.Printt();
	}

}
