package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display {
	
	private Shape sh[];
	public void setShapes(Shape[] e){
		sh=e;
	}
	public double totalArea(){
		double tmp=0;
		for(int i=0; i<sh.length; i++){
			tmp=tmp+sh[i].area();
		}
		return tmp;
	}
	public double totalPerimeter(){
		double tmp=0;
		for(int i=0; i<sh.length; i++){
			tmp=tmp+sh[i].perimeter();
		}
		return tmp;
	}
}
