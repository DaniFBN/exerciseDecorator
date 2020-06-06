package exerciseDecorator;

import java.util.Random;

public class LineColor extends Decorator {

	LineColor(GeometricShape geometricShape) {
		super(geometricShape);
	}

	@Override
	public String draw() {
		String s = "\nLine: ";
		Random r = new Random();
		switch (r.nextInt(3)) {
		case 0:
			s += "Verde";
			break;
		case 1:
			s += "Vermelho";
			break;
		case 2:
			s += "Azul";
			break;
		case 3:
			s += "Roxo";
			break;
		default:
			s += "Error";
			break;
		}
		return super.getGeometricShape().draw() + s;
	}
}
