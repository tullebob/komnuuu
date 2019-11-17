package sprogskift;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class DogListLL implements DogListI{
	
	MyLinkedList myList; 
	
	public DogListLL(String filename) {
		myList = new MyLinkedList();
		myList = dogList(filename);
	}
	
	public MyLinkedList dogList(String filename) {
		String line = "";
		File fh = new File(filename);
		try {
			Scanner myScanner = new Scanner(fh);
			myScanner.nextLine();
			//start timer
			long startTime = System.currentTimeMillis();
			
			while (myScanner.hasNextLine()) {
				line = myScanner.nextLine();
				String[] myArr = line.split(",");
				Dog tmpDog = new Dog(Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5]);
				myList.add(tmpDog);
			}
			long stopTime = System.currentTimeMillis();
			System.out.println("Time:  " + (stopTime - startTime));
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		}
		return myList;
	}
	
	public void printList(int numofdogs) {
		myList.printList(numofdogs);
	}
	
	
}
