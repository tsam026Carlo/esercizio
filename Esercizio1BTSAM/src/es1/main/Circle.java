package es1.main;
/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Circle implements Shape {
	private double radius;
	public void setRadius(double e){
		this.radius=e;
	}
	public double getRadius(){
		return this.radius;
	}
	public double area(){
		return (Math.PI*(Math.pow(this.radius, 2)));
	}
	public double perimeter(){
		return (Math.PI*(this.radius*2));
	}
	
	
	
}
