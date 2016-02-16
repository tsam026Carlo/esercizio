package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Square implements Shape {

	private double side;
	public void setSide(double e){
		this.side=e;
	}
	public double getSide(){
		return this.side;
	}
	public double area(){
		return Math.pow(this.side, 2);
	}
	public double perimeter(){
		return this.side*4;
	}
	
	
	
}

