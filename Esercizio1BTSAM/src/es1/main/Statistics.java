package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {
	public double perimeter;
	public double area;
	public Statistics(double e1, double e2){
		this.perimeter=e1;
		this.area=e2;
	}
	public double getPerimeter(){
		return this.perimeter;
	};
	public double getArea(){
		return this.area;
	}
	public void add(Statistics e){
		this.perimeter=this.perimeter+e.getPerimeter();
		this.area=this.area+e.getArea();
	}

}
