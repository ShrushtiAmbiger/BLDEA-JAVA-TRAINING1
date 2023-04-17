package com.bldea.crorepatiapp.paackage;

import java.util.Scanner;

public class crorepati_app {

	public static void main(String[] args) throws Exception {
		System.out.println("welcome to crorepathi game");
		System.out.println("lets welcome our first candidate ");
		Scanner sc = new Scanner(System.in);

		System.out.println("what is your name?");
		String name = sc.next();
		System.out.println("what is your age?");
		int age = sc.nextInt();
		System.out.println("what is your city?");
		String city = sc.next();
		System.out.println("what is your state?");
		String state = sc.next();
		candidate c1 = new candidate(name, age, city, state);
		System.out.println("congratulation for making till here mr/mrs." + c1.getName());
		System.out.println("The rules of the game:");
		System.out.println("1.there will be 10 question which reward" + " a specific amount in incremental order");
		System.out.println("2.The game will contains 3 lifelines." + "(audience phone,50-50 and skip the question");
		System.out.println("3.You can quit the game at any stage");
		System.out.println("please type 1if you wish to see the reward per question");
		int type_1 = sc.nextInt();
		if (type_1 == 1) {
			System.out.println("Question-1:1000\n" + 
								"Question-2:2000\n" +
								"Question-3:3000\n" +
								"Question-4:4000\n"+			
								"Question-5:10000\n" +
								"Question-6:20000\n" +
								"Ouestions-7:30000\n" +
								"Questions-8:50000\n"+
								"Questions-9:80000\n" +
								"Questions-10:100000");
			System.out.println("Do you wish to continue?? (type:yes/no) ");
		}
		   else {
			System.out.println("Do you wish to continue??(type:yes/no) ");
			    }
		          String type_2 = sc.next();
		     if (type_2.equalsIgnoreCase("yes") == true) {
			System.out.println("Lets begin the game");
			System.out.println("Here is the first question");
			boolean res1 = question.fetchQuestion1(c1.getName());
			if (res1 == true) {
				System.out.println("congratulations!!your answer is correct.\n" + "you have won RS." + c1.getAmount());
				System.out.println("here is your next question.");
			}
			else {
				System.out.println(
						"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
			}
				boolean res2 = question.fetchQuestion2(c1.getName());
				if (res2 == true) {
					System.out.println("congratulations!!your answer is correct.\n" + "you have won RS." + c1.getAmount());
					System.out.println("here is your next question.");
				}
				else {
					System.out.println(
							"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
				}
					boolean res3 = question.fetchQuestion3(c1.getName());
					if (res3 == true) {
						System.out.println(
								"congratulations!!your answer is correct.\n" + "you have won RS." + c1.getAmount());
						System.out.println("here is your next question.");
					}
					else {
						System.out.println(
								"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
					}
						boolean res4 = question.fetchQuestion4(c1.getName());
						if (res4 == true) {
							System.out.println(
									"congratulations!!your answer is correct.\n" + "you have won RS." + c1.getAmount());
							System.out.println("here is your next question.");
						}
						else {
							System.out.println(
									"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
						}
						boolean res5 = question.fetchQuestion5(c1.getName());
						if (res5 == true) {
							System.out.println(
									"congratulations!!your answer is correct.\n" + "you have won RS." + c1.getAmount());
							System.out.println("here is your next question.");
						} 
						 else {
							System.out.println(
									"we are sorry!! your answer is incorrect.\n" +
							"you have won Rs." + c1.getAmount());
						}
						boolean res6 = question.fetchQuestion6(c1.getName());
						if (res6 == true) {
							System.out.println(
									"congratulations!!your answer is correct.\n" + 
							"you have won RS." + c1.getAmount());
							System.out.println("here is your next question.");
						} 
						else {
							System.out.println(
									"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
						}
						boolean res7 = question.fetchQuestion7(c1.getName());
						if (res7 == true) {
							System.out.println("congratulations!!your answer is correct.\n" + 
							"you have won RS." + c1.getAmount());
							System.out.println("here is your next question.");
						}
						else {
							System.out.println(
									"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
						}
						boolean res8 = question.fetchQuestion8(c1.getName());
						if (res8 == true) {
							System.out.println(
									"congratulations!!your answer is correct.\n" + 
							"you have won RS." + c1.getAmount());
							System.out.println("here is your next question.");
						} 
						else {
							System.out.println(
									"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
						}
						boolean res9 = question.fetchQuestion9(c1.getName());
						if (res6 == true) {
							System.out.println(
									"congratulations!!your answer is correct.\n" + 
							"you have won RS." + c1.getAmount());
							System.out.println("here is your next question.");
						} 
						else {
							System.out.println(
									"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
						}
						boolean res10 = question.fetchQuestion10(c1.getName());
						if (res10 == true) {
							System.out.println(
									"congratulations!!your answer is correct.\n" + 
							"you have won RS." + c1.getAmount());
							System.out.println("here is your next question.");
						}
						else {
							System.out.println(
									"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
						}
					}
		          else {
						System.out.println(
								"we are sorry!! your answer is incorrect.\n" + "you have won Rs." + c1.getAmount());
					}
	
	 }
	
}
