public class Main
{
	public static void main(String[] args) {
		Line l = new Line(new Point(), new Point(2, 5));
		System.out.println(l.computeSlope());
		
		Polygon p = new Polygon(new Point(1,1), new Point(2,2), new Point(-1, -5));
		p.addVertex(new Point(0,0));
		System.out.println(p.computePerimeter());
		System.out.println(p.computeArea());
		System.out.println(p.getNumberOfSides());
		System.out.println(p.removeVertex(new Point(2,2)));
		System.out.println("After Removing...");
		System.out.println(p.computePerimeter());
		System.out.println(p.computeArea());
		System.out.println(p.getNumberOfSides());

		Triangle t = new Triangle();
		System.out.println(t.getType());

		Rectangle r = new Rectangle(1, 5, 1, 3);
		System.out.println(r.getCentroid().getX());
	}
}