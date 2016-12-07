/**
 * 
 */
package CompanyPrac;

/**
 * @author mkunaparaju
 *
 */

public class RectOverlap {
	
	static Coordinate cr11 = null;
	static Coordinate cr12 = null;
	static Coordinate cr21 = null;
	static Coordinate cr22 = null;

	/**
	 * @param args - takes 8 arguments. Each set of two being x,y coordinates
	 * 			   - 1st 4 args belong to rect1 next to rect2
	 */
	public static void main(String [] args){
		if(args.length != 8){
			System.out.println("input all the required arguments");
			return;
		}
		try {
			cr11 = new Coordinate(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			cr12 = new Coordinate(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
			cr21 = new Coordinate(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
			cr22 = new Coordinate(Integer.parseInt(args[6]), Integer.parseInt(args[7]));
		} catch (NumberFormatException e) {
			System.out.println("Iput proper arguments");
			e.printStackTrace();
		}
		
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
	
	
	/**
	 * This method checks if the rectangles overlap
	 * @param r1 - rectangle 1 with input coordinates
	 * @param r2 - rectangle 2 with input coordinates
	 * @return - boolean value describing whether the rectangles overlap
	 */
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
