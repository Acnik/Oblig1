public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint(){
		this(0,0);
	}
	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double getDistance(double x, double y) {
		return Math.sqrt(Math.pow((this.x - x), 2)+Math.pow((this.y - y), 2));
	}
	public double getDistance (MyPoint altPoint){
		return Math.sqrt(Math.pow((this.x - altPoint.x), 2)+Math.pow((this.y - altPoint.y), 2));
	}
}
