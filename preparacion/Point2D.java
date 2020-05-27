package preparacion;

public class Point2D
{
	int x;
	int y;
	
	public Point2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double dist2D(Point2D p)
	{
		double dist;
		
		dist = Math.sqrt((Math.pow(p.x, 2) - Math.pow(this.x, 2)) + (Math.pow(p.y,2) - Math.pow(this.y,2)));
		
		return dist;
		
	}
	
	public void printDistance(double d)
	{
		System.out.println(Math.ceil(d));
	}

}
