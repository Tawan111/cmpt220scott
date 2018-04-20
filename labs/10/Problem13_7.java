
public class Problem13_7 {

	public static void main(String[] args) {
		
		GeometricObject[] squares = {new Square(5), new Square(7), 
			new Square(19.5), new Square(12), new Square(13)};

		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare: " + (i + 1));
		 	System.out.println("Area: " + squares[i].getArea());
		 	System.out.println("How to color: " + ((Square)squares[i]).howToColor());
		 } 
	}
}