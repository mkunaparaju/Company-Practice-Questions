/**
 * 
 */
package CompanyPrac;

/**
 * @author mkunaparaju
 *
 */
public class RectOverlap {

	public static void main(String [] args){
//		if(args.length != 8){
//			System.out.println("input all the required arguments");
//			return;
//		}
		
		Coordinate cr11 = new Coordinate(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		Coordinate cr12 = new Coordinate(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		Coordinate cr21 = new Coordinate(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
		Coordinate cr22 = new Coordinate(Integer.parseInt(args[6]), Integer.parseInt(args[7]));
		
		Rectangle r1 = new Rectangle(cr11, cr12);
		Rectangle r2 = new Rectangle(cr21, cr22);
		boolean isOverlap = isOverlap(r1, r2); 
		
		if(isOverlap){
			System.out.println("OVERLAP");
		}
		else{
			System.out.println("NOPE");
		}
		
	}
	
	static boolean isOverlap(Rectangle r1, Rectangle r2){

		if(r1.getTL().x > r2.getBR().x || r1.getBR().x < r2.getTL().x){
			return false;
		}
		
		if(r1.getTL().y < r2.getBR().y  || r1.getBR().y > r2.getTL().y){
			return false;
		}
		return true;
	}
}
