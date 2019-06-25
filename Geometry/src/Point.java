
public class Point {
	
	 private int x;
	  private int y;

	  public Point(int xInit, int yInit) { // Constructor
		    this.x = xInit;
		    this.y = yInit;
		  }
	  public Point() {
		  this.x=0;
		  this.y=0;
	  }
	  public void setX(int xCoord) {
	    this.x = xCoord;
	  }

	  public void setY(int yCoord) {
	    this.y = yCoord;
	  }

	  public int getX() {
	    return this.x;
	  }

	  public int getY() {
	    return this.y;
	  }	
	  public void print() {
	      System.out.println("(" + this.x + "," + this.y + ")");
	    }
	  public boolean isOrigin() {
		  if(this.x==0 && this.y==0)
			  return true;
		  else
			  return false;
		  }	
	  public int QuadrantCheck() {
		  if(this.x>0&&this.y> 0)
			  return 1;
		  else if (this.x<0&&this.y>0)
			  return 2;
		  else if(this.x <0 && this.y < 0)
			  return 3;
		  else if(this.x>0 &&this.y<0)
			  return 4;
		  else {
			  System.out.println("On one of the axis..");
			  return 0;
		  }
	  }
	  public Point xProjection() {
		  		Point P = new Point(this.x,0);
		  		return P;
		  }
	  public Point yProjection() {
	  		Point P = new Point(0,this.y);
	  		return P;
	  }
	  public void scalarMultiply(int c) {
          x = c * x; 
          y = c * y;
        }
	  public Point sum(Point q) {
			return new Point(this.x + q.x, this.y + q.y);
		}
	  public double slope(Point q) {
			return (double) (q.y - this.y) / (q.x - this.x);
		}
	  private int absolute(int num) {
		  if(num>0)
			  return num;
		  else
			  return -1*num;
		}
	  public int distance(Point q) {  //Manhattan, not Euclidean
			return absolute(q.getX()-this.x)+absolute(q.getY()-this.y);
		}
		public String equationOfLine(Point q) {
			double m = slope(q);	// meaning this.slope(q)
			double c = this.y - m * this.x; // can also use q.y - m*q.x
			return("y = " + m+"*x + " + c);
		}
		public boolean isClockwise(Point q, Point r) {
			if(this.slope(q)>q.slope(r))
				return true;
			else
				return false;
		}
		public boolean isCounterClockwise(Point q, Point r) {
			if(this.slope(q)<q.slope(r))
				return true;
			else
				return false;
		}public boolean isCollinear(Point q, Point r) {
			if(this.slope(q)==q.slope(r))
				return true;
			else
				return false;
		}
			  
}
