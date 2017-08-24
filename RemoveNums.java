import java.io.*;

public class RemoveNums {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.print(s.replaceAll("\\d", ""));
    }
}