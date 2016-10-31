
public class Cylinder extends Shape{
	private double radius = 0;
	private double height = 0;
	
	public Cylinder(String _name, String _color, double _radius, double _height){
		super(_name, _color);
		this.radius = _radius;
		this.height = _height;		
	}
	
	public void setRadius(double _radius){
		this.radius = (_radius);
	}
	
	public void setHeight(double _height){
		this.height = _height;
	}
	
	public double getRadius(){
		return (this.radius);
	}
	
	public double getHeight(){
		return (this.height);
	}
	
	@Override
	public double area(){
		double area;
		area = (Math.PI * Math.sqrt(
				this.getRadius()) * this.getHeight());
		return area;
	}
	
	@Override
	public String toString(){
		String outPut = "";
		outPut += "Name: " + this.getShapeName() + "\n"
				+ "Radius: " + (this.getRadius()) + "\n"
				+ "Height: " + (this.getHeight()) + "\n"
				+ "Color:  " + (this.getColor()) + "\n"
				+ "Area:   " + (this.area());
		return outPut;
	}

}