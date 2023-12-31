/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	int t = Integer.parseInt(args[0]);
	int twoChildren = 0, threeChildren = 0, fourOrMore = 0, temp = 0;
	double a = Math.random();
	double count = 0;
	for(int i = 1; i <= t; i++){
		boolean boy = false;
		boolean girl = false;
	while((boy&&girl) == false){
		if(a < 0.5){
			boy = true;
			temp++;
		}
			else{
				girl = true;
				temp++;
			}
			a = Math.random();
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
			System.out.println("The most common number of children is 2");
		} else if(threeChildren > twoChildren && threeChildren >= fourOrMore){
			System.out.println("The most common number of children is 3");
		} else{
		System.out.println("The most common number of children is 4 or more");
		}
	}

	}