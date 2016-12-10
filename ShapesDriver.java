public class ShapesDriver {

	
	public static void main(String[] args) {

		// deck
		Rectangle deck = new Rectangle("Rectangle One", "Red", 20, 35);

		System.out.println();

		Cylinder newCylinder = new Cylinder("Cylinder One", "Indigo", 10,
				30);

		System.out.println();

		Sphere newSphere = new Sphere("Globe One", "Blue", 15);

		// extra
		Rectangle reShape = new Rectangle("Rectangle Two", "Green", 45, 78);
		Cylinder cyShape = new Cylinder("Cylinder Two", "Blue", 88, 107);

		// array
		Shape arrayShape[] = new Shape[5];
		arrayShape[0] = deck;
		arrayShape[1] = newCylinder;
		arrayShape[2] = newSphere;
		arrayShape[3] = reShape;
		arrayShape[4] = cyShape;

		System.out.println("Shape List");
		for (int i = 0; i < arrayShape.length; i++) {
			System.out.println();
			System.out.println(arrayShape[i]);
		}

	}

}
