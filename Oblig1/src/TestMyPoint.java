
public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint priPoint = new MyPoint(0,0);
		MyPoint altPoint = new MyPoint(10,30.5);
		System.out.println("The distance between point (-2,1) and (1,5) is " + priPoint.getDistance(altPoint));

	}

}
