package ziqi.first;

public class TriangleTwo {
		Point topLeft;
		double a;
		double b;
		double z;
		String type = "Triangle2";
		
	TriangleTwo (Point topLeft, double b,double a,double z){
		this.topLeft = topLeft;
		this.a = a;
		this.b = b;
		this.z = z;
	}

	double area() {
		return a * b *  z/2;
}
}
