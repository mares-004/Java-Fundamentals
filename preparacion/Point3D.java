package preparacion;

public class Point3D extends Point2D
{
	int z;
	
	Point3D(int x, int y, int z)
	{
		super(x,y);
		this.z = z;
	}
	
	public double dist3D(Point3D p)
	{
		double dist = 0;
		
		dist = Math.sqrt((Math.pow(p.x,2) - Math.pow(this.x,2)) + (Math.pow(p.y, 2) - Math.pow(this.y, 2) + (Math.pow(p.z, 2) - Math.pow(this.z, 2))));
		
		return dist;
	}
	
	public void printDistance(double d)
	{
		System.out.println(Math.ceil(d));
	}
			
}
