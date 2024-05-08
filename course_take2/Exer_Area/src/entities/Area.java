package entities;

public class Area {

	public double width;
	public double height;
	
	public double calculoArea() {
		return width*height;
	}
	public double calculoPerimetro() {
		return 2* (width+height);
	}
	public double calculoDiagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
}
