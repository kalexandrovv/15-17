package temi15do17;

public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint() {
		
	}
	
	public MyPoint(double x, double y) {
		setX(x);
		setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	public double distance(MyPoint n) {
		return Math.sqrt((n.x - x) * (n.x - x) + (n.y - y) * (n.y - y));
	}
	public double distance(int x , int y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
	public static double distance(MyPoint n, MyPoint m) {
		return Math.sqrt((n.x - m.x) * (n.x - m.x) + (n.y - m.y) * (n.y - m.y));
	}
			
}
