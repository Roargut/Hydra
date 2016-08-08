import java.util.Arrays;
import java.util.HashSet;

public class Station {
	
	private Gui g;
	private Action a;
	
	public HashSet<String> generateMandant(String placeholder, int anzahl) {
		HashSet<String> ml = new HashSet<>();
		for(int x = 0; x < anzahl; x++)	ml.add(placeholder+x);
		return ml;
	}

	public void genTable(String[] data){
		System.out.println(Arrays.toString(data));
	}
	
}
	
