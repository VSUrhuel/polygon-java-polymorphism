public class Line
{
	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	public Point getMidpoint()
	{
		return new Point(((p1.getX() + p2.getX()) / 2), ((p1.getY() + p2.getY()) / 2));
	}
	public double computeLength()
	{
		return Math.sqrt((Math.pow((p2.getX() - p1.getX()), 2)) + (Math.pow((p2.getY() - p1.getY()), 2)));
	}
	public double computeSlope()
	{
		double denominator = (p2.getX() - p1.getX() != 0) ? (p2.getX() - p1.getX()) : 8;
		return (double)(p2.getY() - p1.getY()) / denominator;
	}
}