public class Rectangle extends Polygon
{
	public Rectangle(int abscissa1, int abscissa2, int ordinate1, int ordinate2)
	{
		super(new Point(abscissa1, ordinate1), new Point(abscissa1, ordinate2), new Point(abscissa2, ordinate2));
		super.addVertex(new Point(abscissa2, ordinate1));
	}
	public double computeDiagonalLength()
	{
		Line l = new Line(super.getVertices().get(0), super.getVertices().get(2));
		return l.computeLength();
	}
	public Point getCentroid()
	{
		Line l = new Line(super.getVertices().get(0), super.getVertices().get(2));
		return l.getMidpoint();
	}
	@Override
	public void addVertex(Point p)
	{
		System.out.println("You cannot add another point in triangle.");
	}
	@Override
	public boolean removeVertex(Point p)
	{
		System.out.println("You cannot remove another vertex in a triangle");
		return false;
	}
}