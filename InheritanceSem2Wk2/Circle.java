

public class Circle extends Shape {
// Add a method to print out how the area of a circle is

	public void area(){
		System.out.println("Circle Area = Pi*(Radius * Radius)");
	}
// Add another method that overrides the area method and takes in enough detail to calculate the area
	public void area(double number){
		double circleArea;
		circleArea = Math.PI*(number*number);
		System.out.println(circleArea);

	}
}
