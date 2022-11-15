

public class Square extends Shape{
// Add a method to print out how the area of a square is
	public void area(){
		System.out.println("Square Area = Side * Side");
	}
// Add another method that overrides the area method and takes in enough detail to calculate the area
	public void area(double number){
		double squareArea;
		squareArea = number*number;
		System.out.println(squareArea);
	}
}
