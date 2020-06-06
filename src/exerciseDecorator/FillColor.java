package exerciseDecorator;
import java.util.Random;

public class FillColor extends Decorator {

	FillColor(GeometricShape geometricShape) {
		super(geometricShape);
	}
	
	@Override
	public String draw() {
		String s = "\nFill: ";
		Random r = new Random();
		switch (r.nextInt(3)) {
		case 0:
			s += "Azul";
			break;
		case 1:
			s += "Prata";
			break;
		case 2:
			s += "Preto";
			break;
		case 3:
			s += "Amarelo";
			break;
		default:
			s += "Error";
			break;
		}
		return super.getGeometricShape().draw() + s;
	}

}
