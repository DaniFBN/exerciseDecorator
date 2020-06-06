package exerciseDecorator;

import java.util.Random;

import javax.swing.JOptionPane;

public class InitPoint {

	public static void main(String[] args) {
		GeometricShape geometricShape;
		Random r1 = new Random();
		// Switch Shape
		switch (r1.nextInt(3)) {
		case 0:
			geometricShape = new Circle();
			break;
		case 1:
			geometricShape = new Square();
			break;
		case 2:
			geometricShape = new Rectangle();
			break;
		default:
			// É impossivel chegar aqui, só se a classe Random apresentar erro
			// Mas preciso instanciar pra nao dar erro;
			geometricShape = new Circle();
			break;
		}

		Random r2 = new Random();
		// Switch Decorator
		switch (r2.nextInt(3)) {
		case 1:
			Random r3 = new Random();
			if (r3.nextInt(2) == 0)
				geometricShape = new LineColor(geometricShape);
			else
				geometricShape = new FillColor(geometricShape);
			break;
		case 2:
			geometricShape = new LineColor(geometricShape);
			geometricShape = new FillColor(geometricShape);
			break;
		default:
			break;
		}
		JOptionPane.showMessageDialog(null, geometricShape.draw());
	}

}
