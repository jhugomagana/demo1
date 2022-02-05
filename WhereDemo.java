import java.lang.StringBuilder;
import java.util.stream.IntStream;

class WhereDemo {
	
    public static String thisDirectory() {
        StringBuilder myDir = new StringBuilder(System.getProperty("user.dir"));
        System.out.println("WhereDemo.thisDirectory() called\n" + "codePoints for this string:");
        IntStream thisStream = myDir.codePoints();
        thisStream.forEach(System.out::println);
        return myDir.toString();

    }
    
    public static void main(String[] args) {

        System.out.println("Calling thisDirectory() from main()\n" + thisDirectory());
    }
}
