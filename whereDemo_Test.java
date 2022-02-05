import static org.junit.Assert.*;
import org.junit.*;

// windows MINGW64 bash commands
// javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" whereDemo_Test.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore whereDemo_Test

public class whereDemo_Test {
    @Test
    public void addition() {
        assertEquals(5, 1 + 1);
    }


}
