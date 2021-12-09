package abstractClassesAndInterfaces.cs1;

public class Circle extends Shape {

	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public Double calculatePerimeter() {
		return 2 * (3.14) * (radius);
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

}
