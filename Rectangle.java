/**
 * 
 */
package CompanyPrac;

/**
 * @author mkunaparaju
 *
 */
public class Rectangle {

	Coordinate topLeft;
	Coordinate bottomRight;
	
	Rectangle(Coordinate tl, Coordinate br){
		this.topLeft = tl;
		this.bottomRight = br;
	}
	
	Coordinate getTL(){
		return topLeft;
	}
	
	Coordinate getBR(){
		return bottomRight;
	}
	
}
