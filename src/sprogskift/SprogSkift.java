/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package sprogskift;

import java.util.Scanner;

/**
 *
 * @author thor
 */
public class SprogSkift {
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Dansk sprog = new Dansk();
		sprog.printMenu();
		while (choice != 9) {
			choice = sc.nextInt();
			switch(choice) {
				case 4:
					changeLanguage();
					break;
				default:
					choice = 9;
					break;
			}
		}
		// print en menu
	}
	
}
