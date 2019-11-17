package sprogskift;

import java.io.FileNotFoundException;
import java.util.List;

public interface DogListI {
	public List<Dog> dogList(String source);
	public void printList(int numofdogs);
	
}
