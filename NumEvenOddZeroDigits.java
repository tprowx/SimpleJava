import java.util.Scanner;

public class NumEvenOddZeroDigits
{
    
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
        int input;
        
        System.out.print("Enter a number: ");
        input = scan.nextInt();

        int numZeros;
        int numEven;
	int numOdd;
	
	numZeros = numEven = numOdd = 0;

	if(input < 0)
	    input = -input;
	while(input > 0) {
	    if(input % 10 == 0)
		numZeros++;
	    if(input % 2 == 0)
		numEven++;
	    else
		numOdd++;
	    input /= 10;
	}

	System.out.println("Num zeros: " + numZeros);
	System.out.println("Num even : " + numEven);
	System.out.println("Num odd  : " + numOdd);
    }
}
