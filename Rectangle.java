
public class Rectangle extends Shape {
	private double width = 0;
	private double length = 0; 
	
	
	public Rectangle(String _name, String _color, 
			double _width, double _lenght){
		super(_name, _color);
		this.width = _width;
		this.length = _lenght;
	}
	
	public void setWidth(double _width){
		this.width = _width;
	}
	
	public void setLength(double _lenght){
		this.length = _lenght;
	}
	
	public double getWidtih(){
		return this.width;
	}
	
	public double getLeght(){
		return this.length;
	}
	
	@Override
	public double area(){
		double area; 
		area = (this.getWidtih() * this.getLeght());
		return area;
	}
	
	@Override
	public String toString(){
		String outPut = "";
		outPut += "Name: " + this.getShapeName() + "\n"
				+ "Leght: " + this.getLeght() + "\n"
				+ "Width: " + this.getWidtih() + "\n"
				+ "Color: " + this.getColor() + "\n" 
				+ "Area:  " + this.area();
		return outPut;
	}	

}