
public class Driver {

	public static void main(String[] args) {
	      Point p1 = new Point(4,5);
	      Point p2 = new Point();
	      Point p3 = new Point(-1,-1);
	      Point p4 = new Point(6,-2);
	      Point p5 = new Point();
	      //Point@aeb2ni7eo8c is what gets printed.
	      //Use getters for comparison..
	      System.out.println(p2.isOrigin());
	      p2.setX(-4);
	      p2.setY(1);
	      System.out.println(p2.isOrigin());
	      System.out.println(p1.QuadrantCheck());
	      System.out.println(p2.QuadrantCheck());
	      System.out.println(p3.QuadrantCheck());
	      System.out.println(p4.QuadrantCheck());
	      System.out.println(p5.QuadrantCheck());
	      Point XP = p1.xProjection();
	      Point YP = p2.yProjection();
	      XP.print();
	      YP.print();
	      Point MP = new Point(3,8);
	      MP.scalarMultiply(5);
	      MP.print();
	      Point PP = new Point(4,7);
	  	  Point QQ = new Point(1,3);
	  	  System.out.println( PP.slope(QQ) );
	  	  Point pd = new Point(2,7);
	  	  Point qd = new Point(-3,1);
	  	  System.out.println( pd.distance(qd) );
	  	  Point pe = new Point(2,7);
	  	  Point qe = new Point(-3,1);
	  	  System.out.println( pe.equationOfLine(qe) );
	  	Point p = new Point(3,-7);
		Point q = new Point(-2,0);
		Point r = new Point(0,11);
		if ( p.isClockwise(q,r) )
			System.out.println("Clockwise");
		else if ( p.isCounterClockwise(q,r) )
			System.out.println("Counter-clockwise");
		else
			System.out.println("Collinear");
	}
}
