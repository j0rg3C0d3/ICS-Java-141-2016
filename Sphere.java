public class Sphere extends Shape {
	private double radius = 0;

	public Sphere(String _name, String _color, double _radius) {
		super(_name, _color);
		this.radius = _radius;
	}

	public void setRaius(double _radius) {
		this.radius = (_radius);
	}

	public double getRadius() {
		return (this.radius);
	}

	public double area() {
		double area;
		area = (4 * this.getRadius()) * (Math.PI * Math.pow(this.radius, 2));
		return area;
	}

	@Override
	public String toString() {
		String outPut = "";
		outPut += "Name: 	" + this.getShapeName() + "\n" + "Radius: 	"
				+ this.getRadius() + "\n" + "Color:   " + this.getColor()
				+ "\n" + "Area:    " + this.area();
		return outPut;
	}
}