
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	boolean boy = false;
	boolean girl = false;
	int count = 0;
	while((boy&&girl) == false){
		double a = Math.random();
		if(a < 0.5){
			boy = true;
			count++;
			System.out.print("b ");
		}
			else if(a > 0.5){
				girl = true;
				count++;
			System.out.print("g ");
			}
		}
		System.out.println();
		System.out.println("You made it... and you now have " + count + " children. ");
	}
}

		