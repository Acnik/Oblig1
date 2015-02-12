public class Circle2D {
	private int x;
	private int y;
	private int radius;//testendring
	public Circle2D() {
		this(0, 0, 1);
	}
	public Circle2D(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getArea(){
		return (Math.PI*(Math.pow(this.radius, 2)));
	}
	public double getPerimeter(){
		return (2.0 * Math.PI * radius);
	}
	public boolean contains(double x, double y){
		return (Math.sqrt( Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2) )) <= this.radius;
	}
	public boolean contains(Circle2D circle){
		return ((Math.sqrt(Math.pow((this.x-circle.x) , 2)+Math.pow((this.y - circle.y), 2)) + circle.radius) <=this.radius);
	}
	public boolean overlaps(Circle2D circle){
		return ((Math.sqrt(Math.pow((this.x-circle.x), 2)+ Math.pow((this.y - circle.y), 2))) <= (this.radius + circle.radius));
	}
}
