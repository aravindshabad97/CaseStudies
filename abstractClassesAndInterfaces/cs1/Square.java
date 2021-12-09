package abstractClassesAndInterfaces.cs1;

public class Square extends Shape {

	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public Double calculatePerimeter() {
		return (double) (4 * side);
	}

	public Square(float side) {
		super();
		this.side = side;
	}

}
