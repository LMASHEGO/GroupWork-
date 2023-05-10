package Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class largerinteger2Test {

 @Test
   
    public void testFirstIntLarger() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    
    String input = "10\n5\n"; // simulate user input "10" and "5"
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    
    LargerInteger2.main(new String[]{});
    
    String expectedOutput = "The larger integer is: 10\n";
    assertEquals(expectedOutput, outContent.toString());
}

}
