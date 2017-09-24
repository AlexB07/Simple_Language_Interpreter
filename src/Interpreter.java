import java.util.ArrayList;
import java.util.HashMap;

public class Interpreter
{
    public ArrayList<String> interpret(String line) {
        ArrayList<String> output = new ArrayList<String>();
        String[] bits = line.split("\\s+");
        if (bits.length > 0 && bits[0].equals("print")) {
            for (int i = 1; i < bits.length; ++i) {
                output.add(bits[i]);
            }
        } else {
            output.add("error: unrecognised command");
        }
        return output;
    }
}
