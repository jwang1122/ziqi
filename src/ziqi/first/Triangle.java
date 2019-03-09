package ziqi.first;

public class Triangle {
	Point topLeft;
	double width;
	double height;
	String type = "Triangle";
	
Triangle (Point topLeft, double width,double height){
	this.topLeft = topLeft;
	this.height = height;
	this.width = width;
}

double area() {
	return width * height/2;
	
}
}