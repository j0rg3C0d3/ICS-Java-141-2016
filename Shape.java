public class Shape {
	private String shapeName = "";
	private String color = "";

	public Shape(String _shapeName, String _color) {
		this.shapeName = _shapeName;
		this.color = _color;
	}

	public void setShapeName(String _sName) {
		this.shapeName = _sName;
	}

	public void setColor(String _color) {
		this.color = _color;
	}

	public String getShapeName() {
		return (this.shapeName);
	}

	public String getColor() {
		return (this.color);
	}

	public double area() {
		return 0;
	}

	public String toString() {
		String outPut = "";
		outPut += "Name: " + this.getShapeName() + "\n" + "Color: "
				+ this.getColor();
		return outPut;
	}
}