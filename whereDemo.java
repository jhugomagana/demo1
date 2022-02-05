import java.io.IOException;
import java.nio.file.Path;

class WhereAmI {
	
    public static String thisDirectory() {
        String myDir = System.getProperty("user.dir");
        return myDir;

    }
    
    public static void main(String[] args){

        System.out.print(thisDirectory());
    }
}
