package shapes;

public class Rectangle {
	private int height;
	private int width;
	
	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public int getArea() {
		return height*width;
	}
}