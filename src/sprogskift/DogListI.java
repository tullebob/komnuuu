package sprogskift;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface DogListI {
	public ArrayList<Dog> dogList(String filename)throws FileNotFoundException;
	public void printList(int numofdogs);
	
}
