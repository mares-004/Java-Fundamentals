package preparacion;

public class ShapeFactory
{
	public void drawShape(String p)
	{
		Circle obj1 = new Circle();
		Square obj2 = new Square();
		Rectangle obj3 = new Rectangle();
		
		
		if(p.equals(obj1.getClass().getSimpleName()))
		{
			obj1.drawShape();
		}
		else if(p.equals(obj2.getClass().getSimpleName()))
		{
			obj2.drawShape();
		}
		else if(p.equals(obj3.getClass().getSimpleName()))
		{
			obj3.drawShape();
		}
		else
		{
			System.out.println("Drawing " + p + " is Not Supported");
		}
		
	}
}
