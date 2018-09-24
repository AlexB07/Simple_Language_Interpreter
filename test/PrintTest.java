import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PrintTest
{
	@Test
	public void testPrint(){
		Interpreter interpreter = new Interpreter();
		ArrayList<String> result = interpreter.interpret("print hello world");
		assertEquals(result.size(), 2);
		assertEquals(result.get(0), "hello");
		assertEquals(result.get(1), "world");


	}

	@Test
	public void testset(){
		Interpreter interpreter = new Interpreter();
		ArrayList<String> result = interpreter.interpret("set x 4");
		ArrayList<String> result1 = interpreter.interpret("print x");
		assertEquals(result.get(0), 4);
		



	}
}
