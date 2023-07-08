# Polygon

This repository includes the implementation of various classes related to polygons, including the `Polygon`, `Point`, `Line`, `Triangle`, and `Rectangle` classes. Each class has specific attributes and methods to perform different operations related to polygons.

## Polygon Class

The `Polygon` class represents a polygon and has the following features:

- The attribute `vertices` is declared as a `List` of `Points` to store the vertices of the polygon.

- The default constructor initializes the `vertices` attribute with three points: `(0,0)`, `(1,1)`, and `(1,0)` in the respective order.

- The constructor with three `Point` parameters initializes the `vertices` attribute and adds the three parameters respectively to the `vertices` list.

- The method `computePerimeter` calculates and returns the sum of the lengths of each side of the polygon. It does this by creating a line per consecutive pair of vertices and computing its length using the `computeLength` method of the `Line` class. Note that the last vertex is paired with the first vertex to complete the polygon.

- The method `computeArea` calculates and returns the area of the polygon using a specific formula. It considers the number of vertices and the x-values of the first and last vertices.

- The method `addVertex` adds a new vertex to the `vertices` list.

- The method `removeVertex` searches for a vertex in the `vertices` list that has the same x and y values as the provided vertex. If found, it removes it and returns `true`. If the vertex is not found, it returns `false`.

- The method `getNumberOfSides` returns the number of sides of the current `Polygon` object.

## Point Class

The `Point` class represents a point in a two-dimensional space and includes the following features:

- The class has attributes for `x` and `y` coordinates.

- It provides constructors, getters, and setters for the attributes.

- The method `computeDistanceFromOrigin` calculates and returns the distance between the point (given its `x` and `y` values) and the origin `(0,0)` using the distance formula.

## Line Class

The `Line` class represents a line segment between two points and includes the following features:

- The class has two private attributes, `p1` and `p2`, representing the starting and ending points of the line.

- The constructor initializes each parameter to its corresponding attribute.

- The method `getMidpoint` returns the midpoint of the line as a `Point` object, calculated using the midpoint formula.

- The method `computeLength` calculates and returns the distance between the `p1` and `p2` attributes using the distance formula.

- The method `computeSlope` calculates and returns the slope of the line using the slope function. If the denominator would result in 0, the slope is overridden with a value of 8 to avoid an undefined value. Note that the numerator is cast to type `double` before dividing it by the denominator to ensure the result is of type `double`.

## Triangle Class

The `Triangle` class extends the `Polygon` class and includes additional features specific to triangles:

- It includes an enum called `TriangleType` that represents the type of triangle (equilateral, isosceles, or scalene).

- The default constructor calls the default constructor of the superclass and assigns the type based on the vertices, which are obtained from the superclass. Triangles are categorized as equilateral if all sides are equal, isosceles if at least 2 sides are equal, and scalene if no sides are equal.

- The constructor with three parameters calls the corresponding constructor of the superclass and assigns the type based on the vertices obtained from the superclass.

- The method `getType` returns the value of the `type` attribute of the `Triangle` class.

- The `addVertex` method is overridden from the `Polygon` class and displays the text "You cannot add another point in a triangle."

- The `removeVertex` method is overridden from the `Polygon` class and displays the text "You cannot remove another point in a triangle" and returns `false`.

## Rectangle Class

The `Rectangle` class extends the `Polygon` class and includes additional features specific to rectangles:

- The constructor with four parameters creates a rectangle based on the Cartesian coordinates provided. It utilizes the constructor and methods of the superclass to implement this constructor.

- The method `computeDiagonalLength` returns the length of the diagonal of the rectangle.

- The method `getCentroid` returns the centroid point of the rectangle.

- The `addVertex` method is overridden from the `Polygon` class and displays the text "You cannot add another point in a rectangle."

- The `removeVertex` method is overridden from the `Polygon` class and displays the text "You cannot remove another point in a rectangle" and returns `false`.

## Credits

This project was created by Sir Jomari Joseph Barera, an instructor at Visayas State University, as part of the Laboratory Exam in OOP in Java.
