import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	
	int guessNumber()
	{
		Scanner scan = new Scanner(System.in);

			System.out.println("Please Guess the number from the range of 1 to 10: ");
			guessNum = scan.nextInt();
			return guessNum;
}
}

class Playerguess1
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1 can guess the num: ");
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Playerguess2
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 2 can guess the num: ");
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Playerguess3
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 3 can guess the num: ");
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numfromGuesser;
	int numfromPlayer1;
	int numfromPlayer2;
	int numfromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser gu = new Guesser();
		numfromGuesser=gu.guessNumber();	
		
	}
	void collectNumFromPlayer()
	{
		Playerguess1 pg1 = new Playerguess1();
		Playerguess2 pg2 = new Playerguess2();
		Playerguess3 pg3 = new Playerguess3();
		
		numfromPlayer1=pg1.guessNum();
		numfromPlayer2=pg2.guessNum();
		numfromPlayer3=pg3.guessNum();
	}
	
	void compare()
	{
		if(numfromGuesser == numfromPlayer1)
		{
			if(numfromGuesser == numfromPlayer2 && numfromGuesser == numfromPlayer3)
				System.out.println("Player 1 & 2 & 3 won");
			else if(numfromGuesser == numfromPlayer2)
				System.out.println("Player 1 & 2 won");
			else if(numfromGuesser == numfromPlayer3)
				System.out.println("Player 1 & 3 won");
			else
				System.out.println("Player 1 won");
		}
		else if(numfromGuesser == numfromPlayer2)
		{
			if (numfromGuesser == numfromPlayer3)
				System.out.println("Player 2 & 3 won");
			else
			System.out.println("Player 2 won");
		}
		else if (numfromGuesser == numfromPlayer3)
			System.out.println("Player 3 won");
		else
			System.out.println("No one won");
	}
}


public class LaunchGame {

	public static void main(String[] args) {
		
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		

	}

}

