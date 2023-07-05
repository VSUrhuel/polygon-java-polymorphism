import java.util.*;
public class Polygon
{
	private ArrayList<Point> vertices;

	public Polygon()
	{
		this.vertices = new ArrayList<>();
		vertices.add(new Point(0,0));
		vertices.add(new Point(1,1));
		vertices.add(new Point(1,0));
	}
	public Polygon(Point p1, Point p2, Point p3)
	{
		this.vertices = new ArrayList<>();
		vertices.add(p1);
		vertices.add(p2);
		vertices.add(p3);
	}
	public double computePerimeter()
	{
		double sum = 0;
		int j = 1;
		for(int i=0; i<vertices.size(); i++)
		{
			Line l = new Line(new Point(vertices.get(i).getX(), vertices.get(i).getY()), new Point(vertices.get(j).getX(), vertices.get(j).getY()));
			sum += l.computeLength();
			if(i == (vertices.size() - 1))
			{
				sum += new Line(new Point(vertices.get(i).getX(), vertices.get(i).getY()), new Point(vertices.get(0).getX(), vertices.get(0).getY())).computeLength();
			}
			if(j == vertices.size()-1)
				continue;
			else
				j++;
		}
		return sum;
	}
	public ArrayList<Point> getVertices()
	{
		return this.vertices;
	}
	public double computeArea()
	{
		double sum1 = 0, sum2 = 0;
		for(int i=0; i<=vertices.size()-2; i++)
		{
			sum1 += (vertices.get(i).getX() * vertices.get(i+1).getY());
			sum2 +=	(vertices.get(i+1).getX() * vertices.get(i).getY());
		}
		return Math.abs(((sum1 - sum2) + ((vertices.get((getNumberOfSides()-1)).getX() * vertices.get(0).getY()) - (vertices.get(0).getX() * (vertices.get((getNumberOfSides()-1)).getY()))))/2);
	}
	public void addVertex(Point vertex)
	{
		this.vertices.add(vertex);
	}
	public boolean removeVertex(Point p)
	{
		for(Point vertex : vertices)
		{
			if(vertex.getX() == p.getX() && vertex.getY() == p.getY())
			{
				this.vertices.remove(vertex);
				return true;
			}
		}
		return false;
	}
	public int getNumberOfSides()
	{
		return this.vertices.size();
	}
}