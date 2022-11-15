
public class Rectangle extends Shape {
// Add a method to print out how the area of a Rectangle is
	public void area(){
		System.out.println("Rectangle Area = Side1 * Side2");
	}
// Add another method that overrides the area method and takes in enough detail to calculate the area
	public void area(double number, double number2){
		double recArea;
		recArea = number*number2;
		System.out.println(recArea);

	}
}
