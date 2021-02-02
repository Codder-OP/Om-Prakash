import java.util.*;

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "Rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "Cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5 {

	public static void main(String[] args) {
		Shape5 sp1=new Line5();
		System.out.println(sp1.draw());
		Shape5 sp2=new Rectangle5();
		System.out.println(sp2.draw());
		Shape5 sp3 =new Cube5();
		System.out.println(sp3.draw());

	}

}
