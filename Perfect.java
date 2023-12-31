/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int a = Integer.parseInt(args[0]);
		String s = a + " is a perfect number since " + a + " = 1";
		int b = 0;
		for(int c = 1; c < a; c++){
			if((a%c) == 0){
				s = s + " + " + c;
				b = b + c;
			}
		}
			if(b == a){
				System.out.print(s);
			}
			 else {
				System.out.print(a + " is not a perfect number");
			}
		}
	}