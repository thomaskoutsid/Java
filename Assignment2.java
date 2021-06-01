public class Assignment2 {

	public static void main(String[] args) {

	  MyPoint object1 = new MyPoint(1, 5);
	  MyPoint object2 = new MyPoint(5, 3);
	  System.out.printf("The distance between the 2 points is: %.3f" + "\n", object1.distance(object2.getX(), object2.getY()));

	  double array[] = MyPoint.line(object1, object2);
	  System.out.printf("The equation of the line connecting the 2 different points is: %.2fx + %.2fy + %.2f = 0" + "\n", array[0], array[1], array[2]);

	  Triangle2D triangle = new Triangle2D();
	  System.out.printf("%.2f" + "\n", triangle.getArea());
	  System.out.println(triangle.contains(object2));
    }
}

 class MyPoint {
	  private double x;
	  private double y;

	  public MyPoint() {
	     x = 0;
		 y = 0;
	  }

	  public MyPoint(double x, double y) {
	     this.x = x;
		 this.y = y;
	  }

	  public double getX() {
	     return x;
	  }

	  public void setX() {
		 this.x = x;
	  }

	  public double getY() {
		 return y;
	  }

	  public void setY() {
		 this.y = y;
	  }

	  public double distance(MyPoint original) {
		 return distance(original.getX(), original.getY());
	  }

	  public double distance(double x, double y) {
		 double differenceOfX = this.x - x;
		 double differenceOfY = this.y - y;
		 return Math.sqrt((differenceOfX * differenceOfX) + (differenceOfY * differenceOfY));
	  }

	  public static double[] line(MyPoint object1, MyPoint object2) {
		 double array[] = {(object2.getY() - object1.getY()), (object2.getX() - object1.getX()), ((object2.getX()*object1.getY()) - object1.getX()*object2.getY())};
		 return array;
	  }
}

 class Triangle2D {
     private MyPoint p1;
	 private MyPoint p2;
	 private MyPoint p3;

   public Triangle2D() {
	   p1 = new MyPoint(0, 0);
	   p2 = new MyPoint(1, 1);
	   p3 = new MyPoint(2, 5);
	}

	public Triangle2D(double x1, double x2, double x3, double y1, double y2, double y3) {
      p1 = new MyPoint(x1, y1);
	   p2 = new MyPoint(x2, y2);
	   p3 = new MyPoint(x3, y3);
   }

	public void setp1(double x, double y) {
      p1 = new MyPoint(x,y);
	}

	public MyPoint getp1() {
	   return p1;
	}

	public void setp2(double x, double y) {
		p2 = new MyPoint(x,y);
	}

	public MyPoint getp2() {
		return p2;
	}

	public void setp3(double x, double y) {
		p3 = new MyPoint(x,y);
	}

	public MyPoint getp3() {
		return p3;
	}

	public double getArea() {
		return Math.abs((p1.getX() * (p2.getY() - p3.getY()) - p2.getX() * (p1.getY() - p3.getY()) + p3.getX() * (p1.getY() - p2.getY())) / 2);
	}

	public double getPerimeter() {
		return (p1.distance(p2) + p2.distance(p3) + p3.distance(p1));
	}

	public boolean contains(MyPoint test) {
		double a = Math.abs((test.getX() * (p2.getY() - p3.getY()) - p2.getX() * (test.getY() - p3.getY()) + p3.getX() * (test.getY() - p2.getY())) / 2);
		double b = Math.abs((p1.getX() * (test.getY() - p3.getY()) - test.getX() * (p1.getY() - p3.getY()) + p3.getX() * (p1.getY() - test.getY())) / 2);
		double c = Math.abs((p1.getX() * (p2.getY() - test.getY()) - p2.getX() * (p1.getY() - test.getY()) + test.getX() * (p1.getY() - p2.getY())) / 2);
		if (a + b + c == getArea()) return true;
		else return false;
	}
}

//code spoken with Fernando C. and Afm E.
