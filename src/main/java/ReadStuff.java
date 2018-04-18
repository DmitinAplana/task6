import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadStuff {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:\\project\\111.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
            list.add("test");
        }
        //Arrays.toString(list.toArray());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("111");
        s.close();
    }
}
