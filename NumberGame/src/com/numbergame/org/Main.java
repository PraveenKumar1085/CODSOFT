package com.numbergame.org;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to NumberGame" + "\nIn this game you find the RandomNumber."
				+ "\nThe RandomNumber range is 1 to 100(includes 1 and 100"
				+ "\nYou Have 5 Chances for find the RandomNumber" + "\nWe will watching your Guessess"
				+ "\nThe Game Starts Now.........");
		NumberGame numberGame = new NumberGame();

		numberGame.getNumber();
	}

}

class NumberGame {

	int randomNumber;

	NumberGame() {
		Random random = new Random();
		this.randomNumber = random.nextInt(101);

	}

	public void getNumber() {
			System.out.println(randomNumber);
		
		Scanner scanner = new Scanner(System.in);
		int userNumber =0;

		int chances = 1, i, roundLimit = 5;
		for (i = 0; i < roundLimit; i++) {

			System.out.println("\nChances : " + chances + "\nEnter Number :");
			chances++;
			
			try {
				userNumber = scanner.nextInt();
				if ( (1>userNumber)||(userNumber>100)) {
					throw new Exception("Please enter Number 1 to 100 only (include 1 and 100)");
				}
			}
			catch(InputMismatchException ime) {
				System.out.println("You have entered a text instead that Enter a number...");
				getNumber();
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
				getNumber();
			}
			
			if (userNumber == randomNumber) {
				System.out.println("Given number is Correct..." + "\nYou Win");
				System.out.println("\nThe RandomNumber Is : "+randomNumber);
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------");
				
				break;
			} else {

				this.checkCondition(userNumber, i);
			}
			if (i == 4) {
				break;
			}

		}

	}

	public void checkCondition(int givenNumber, int j) {

		if ((randomNumber >= 1) && (randomNumber <= 25)) {

			if (givenNumber > randomNumber) {
				System.out.println("Your value is too High");
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------");

			} else {
				System.out.println("Your value is too Low");
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------");

			}
			if (j == 2) {
				System.out.println("Hint: RandomNumber Lies between range 1 to 25");
			}
		} else if ((randomNumber >= 26) && (randomNumber <= 50)) {

			if (givenNumber > randomNumber) {
				System.out.println("Your value is too High");
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------");

			} else {
				System.out.println("Your value is too Low");
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------");

			}
			if (j == 2) {
				System.out.println("Hint: RandomNumber Lies between range 26 to 50");
			}
		} else if ((randomNumber >= 51) && (randomNumber <= 75)) {

			if (givenNumber > randomNumber) {
				System.out.println("Your value is too High");
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------");

			} else {
				System.out.println("Your value is too Low");
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------");

			}
			if (j == 2) {
				System.out.println("Hint: RandomNumber Lies between range 51 to 75");
			}
		} else {

			if (givenNumber > randomNumber) {
				System.out.println("Your value is too High");
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------");

			} else {
				System.out.println("Your value is too Low");
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------");

			}
			if (j == 2) {
				System.out.println("Hint: RandomNumber Lies between range 76 to 100");
			}

		}
		if (j == 4) {
			System.out.println("\nThe RandomNumber Is : "+randomNumber);

			System.out.println("Sorry...Better luck Next Time...");
		}

	}
}
