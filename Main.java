package com.saltimure.tictactoe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
				{'-', '|', '+', '|', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '|', '+', '|', '-'},
				{' ', '|', ' ', '|', ' '}
				};
	
		while(true) {
			Scanner scan1 = new Scanner(System.in);
			int placeToMark = scan1.nextInt();
			playerTurn(gameBoard, placeToMark, "First");
			Scanner scan2 = new Scanner(System.in);
			placeToMark = scan2.nextInt();
			playerTurn(gameBoard, placeToMark, "Second");
		}
	}
	
	public static void playerTurn(char[][] gameBoard, int placeToMark, String playerTurn) {
		char mark = 'X';
		if (playerTurn == "First") {
			mark = 'X';
		}
		else {
			mark = '0';
		}
		switch(placeToMark) {
			case 1:
				gameBoard[0][0] = mark;
				break;
			case 2:
				gameBoard[0][2] = mark;
				break;
			case 3:
				gameBoard[0][4] = mark;
				break;
			case 4:
				gameBoard[2][0] = mark;
				break;
			case 5:
				gameBoard[2][2] = mark;
				break;
			case 6:
				gameBoard[2][4] = mark;
				break;
			case 7:
				gameBoard[4][0] = mark;
				break;
			case 8:
				gameBoard[4][2] = mark;
				break;
			case 9:
				gameBoard[4][4] = mark;
				break;
			default:
				break;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(gameBoard[i][j]);
			}
		System.out.println();
		}
	}

}
