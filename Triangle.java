public class Triangle extends Polygon
{
	private TriangleType type;

	public Triangle()
	{
		super();
		assignType();
	}
	public Triangle(Point p1, Point p2, Point p3)
	{
		super(p1, p2, p3);
		assignType();
	}
	public TriangleType getType()
	{
		return this.type;
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
	private void assignType()
	{
		Line [] l = new Line[3];
		l[0] = new Line(super.getVertices().get(0), super.getVertices().get(1));
		l[1] = new Line(super.getVertices().get(1), super.getVertices().get(2));
		l[2] = new Line(super.getVertices().get(2), super.getVertices().get(0));
		if(l[0].computeLength() == l[1].computeLength() && l[0].computeLength() == l[2].computeLength() && l[1].computeLength() == l[2].computeLength())
			this.type = TriangleType.Equilateral;
		else if(l[0].computeLength() == l[1].computeLength() || l[1].computeLength() == l[2].computeLength() || l[0].computeLength() == l[2].computeLength())
			this.type = TriangleType.Isoceles;
		else
			this.type = TriangleType.Scalene;
	}
}