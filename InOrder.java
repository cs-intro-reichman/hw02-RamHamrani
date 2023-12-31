/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		int max;
		System.out.print(a);
		if(b >= a){

		
		do{
			
			System.out.print(" " + b);
		max = b;
		b = (int)(Math.random() * 10);

		} while(b > max);

		}
		}
	}
