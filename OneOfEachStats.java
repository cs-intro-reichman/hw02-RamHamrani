import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		int t = Integer.parseInt(args[0]);
		int twoChildren = 0, threeChildren = 0, fourOrMore = 0, temp = 0;
		double count = 0;
	for(int i = 0; i < t; i++){
		boolean boy = false;
		boolean girl = false;
	while((boy&&girl) == false){
		double a = generator.nextDouble();
		if(a < 0.5){
			boy = true;
			temp++;
		}
			else if(a > 0.5){
				girl = true;
				temp++;
			}
		}
			if(temp == 2){
				twoChildren++;
			}	else if(temp == 3){
					threeChildren++;
				} else if(temp >= 4){
					fourOrMore++;
				}
				count = count + temp;
				temp = 0;
				
	}
		double average = count / t;
			
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourOrMore);
		if(twoChildren >= threeChildren && twoChildren >= fourOrMore){
			System.out.println("The most common number of children is 2.");
		} else if(threeChildren > twoChildren && threeChildren >= fourOrMore){
			System.out.println("The most common number of children is 3.");
		} else{
		System.out.println("The most common number of children is 4 or more.");
		}
	}

	}
