

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	String s = args[0];
	for (int right = s.length() - 1; right >= 0; right--){
		System.out.print(s.charAt(right));

	}
	System.out.println();
	if(s.length()%2 == 0){
	int middleIn = (s.length() / 2) -1;
	System.out.println("The middle character is " + s.charAt(middleIn));
	}
	else{
		int middleIn = (s.length() / 2);
		System.out.println("The middle character is " + s.charAt(middleIn));
	}

	}

	}

	
