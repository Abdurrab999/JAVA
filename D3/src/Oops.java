//Object Oriented Programming
class Pen //BluePrint
{
	String colour;
	String type;
	public void write()
	{
		System.out.println("Write Something ");
	}
	public void PrintColour()
	{
		System.out.println(this.colour);
	}
}
class Employee
{
	String Name;
	String IdCardNo;
	
}
public class Oops {

	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.colour="Blue";
		pen1.type="Ball Point Pen";
		//pen1.write();
		Pen pen2=new Pen();
		pen2.colour="Red";
		pen1.PrintColour();
		pen2.PrintColour();
		

	}

}
