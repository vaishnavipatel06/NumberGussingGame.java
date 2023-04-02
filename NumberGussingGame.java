import java.util.*;
public class NumGame_Oasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int)(Math.random()*100+1);
		Scanner guess=new Scanner(System.in);
		System.out.println("Enter a positive number between 1 to 100");
		int user = guess.nextInt();
		int count = 1;
		while(user != random) {
			count++;
			if(count <= 10) {
				if(user<random) {
					System.out.println(user+ " is smaller");
					System.out.println("Try Again!! ");
                    user = guess.nextInt();
				}
				else {
					System.out.println(user+ " is greater");
					System.out.println("Try Again");
					user = guess.nextInt();
					}
			}
			else {
				System.out.println(":) Sorry, Your chance is Over!!");
				System.exit(0);
			}
		}
		if(count<=2) {
			System.out.println("*** Your Scored 5 Points, Congrats!!!***");
		}
		else if(count<=4) {
			System.out.println("*** Your Scored 4 Points, Congrats!!!***");
		}
		else if(count<=6) {
			System.out.println("*** Your Scored 3 Points, Well Done!!!***");
		}
		else if(count<=8) {
			System.out.println("*** Your Scored 2 Points, Good!!!***");
		}
		else if(count<=10) {
			System.out.println("*** About 10 attemts , Better luck next time!!!***");
		}

	}

}
