package exerciseDecorator;

public abstract class Decorator extends GeometricShape {
	private GeometricShape geometricShape;
	
	Decorator(GeometricShape geometricShape){
		this.geometricShape = geometricShape;
	}

	public GeometricShape getGeometricShape() {
		return geometricShape;
	}

	public void setGeometricShape(GeometricShape geometricShape) {
		this.geometricShape = geometricShape;
	}
}
