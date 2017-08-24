import java.io.*;

public class NodNok {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println("НОД: " + nod(a, b));
        System.out.println("НОК: " + nok(a, b));
    }
    static int nod (int a, int b){
        if (b == 0)
            return Math.abs(a);
        return nod(b, a % b);
    }

    static int nok (int a, int b) {
        return a * b / nod (a , b);
    }
}
