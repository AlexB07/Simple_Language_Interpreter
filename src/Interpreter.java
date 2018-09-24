import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Interpreter
{
	HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	int test;
    public ArrayList<String> interpret(String line) {
        ArrayList<String> output = new ArrayList<String>();
        String[] bits = line.split("\\s+");
	if (bits[0].equals("set")){
	hmap.put(bits[1], Integer.parseInt(bits[2]));	
	}else 
	if (bits.length == 1){
		output.add("");
		return output;
	}else
		if (bits.length > 0 && bits[0].equals("print")) {
		
		if (hmap.containsKey(bits[1])){
		output.add(Integer.toString(hmap.get(bits[1])));
		return output;		
} 	
            for (int i = 1; i < bits.length; ++i) {
                output.add(bits[i]);
            }
        } else if (!bits[0].equals("set") || (!bits[0].equals("print"))){
            output.add("error: unrecognised command");
        }
        return output;
    }
}
                   
