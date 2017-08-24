import java.io.*;
/*
Эту задачу можно было делать через преобразование строки в символьный массив и так далее
по стандартному школьному алгоритму, но я немного погуглил и нашел метод reverse()
*/

public class Palindrom {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(isPal(s));
    }

    static String isPal (String s) {
        StringBuilder s1 = new StringBuilder(s).reverse();
        if (s.equalsIgnoreCase(s1.toString()))
            return "Слово является палиндромом";
        else
            return "Слово не является палиндромом";

    }
}
