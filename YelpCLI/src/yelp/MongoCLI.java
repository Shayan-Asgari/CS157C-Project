package yelp;

import java.util.*;

public class MongoCLI 
{
	/*
	 * Instantiate our Mongo Driver
	 */
	public static Scanner in;

	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		
		int inputDecision = -1;
		boolean inputDecisionValid = false;
		boolean done = false;
		while(!done)
		{
			while(!inputDecisionValid)
			{
				System.out.println(
						"1) Allow user to get 5 star restaurants \r\n" + 
						"2) Allow user to get ‘n’ star restaurants \r\n" + 
						"3) Allow users to find restaurants close to them user a certain postal code (String)\r\n" + 
						"4) Allow users to find restaurants \r\n" + 
						"5) Find restaurants nearby using co-ordinates\r\n" + 
						"6) Find users who have left more than ‘n’ amount of reviews\r\n" + 
						"7) Enter a new user\r\n" + 
						"8) Delete a user\r\n" + 
						"9) Enter friends for a user\r\n" + 
						"  ");
				System.out.print("Enter a number of the query you would like to execute (0 to quit): ");
				System.out.println();
				
				if(in.hasNextInt())
				{
					inputDecision = in.nextInt();
					if(MongoCLI.isValidNumber(inputDecision))
					{
						System.out.println(inputDecision);
						inputDecisionValid = true;
						if(inputDecision == 0)
						{
							done = true;
							break;
						}
						else
						{
							executeQuery(inputDecision);
						}
						
					}
				}
				else
				{
					System.out.println("I did not understand, try again.");
				}	
			}
			System.out.println("\n\n\n------------------------------------------------\n\n\n");
			inputDecisionValid = false;
		}
		System.out.println("Thank you for using our service Yelp_User_Business_Information!");
		
	}
	public static void executeQuery(int inputDecision)
	{
		/*
		 * Different queries to execute
		 */
		if(inputDecision == 1)
		{ 
			findNStarRestaurants(5);
		}
		
		if(inputDecision == 2)
		{ 
			findNStarRestaurants(inputDecision);
		}
		
		if(inputDecision == 3)
		{ 
			
		}
		
		if(inputDecision == 4)
		{ 
			
		}
		
		if(inputDecision == 5)
		{ 
			
		}
		if(inputDecision == 6)
		{ 
			
		}
		if(inputDecision == 7)
		{ 
			
		}
		if(inputDecision == 8)
		{ 
			
		}
		if(inputDecision == 9)
		{ 
			
		}
		if(inputDecision == 10)
		{ 
			
		}
		if(inputDecision == 11)
		{ 
			
		}
		if(inputDecision == 12)
		{ 
			
		}
		if(inputDecision == 13)
		{ 
			
		}
		if(inputDecision == 14)
		{ 
			
		}
		if(inputDecision == 15)
		{ 
			
		}
		
	}
	public static String findNStarRestaurants(int input)
	{
		return null;
	}
	
	public static boolean isValidNumber(int n)
	{
		return n>=0 && n<=15;
	}
	
}
