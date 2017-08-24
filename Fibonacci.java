import java.util.*;
import java.io.*;

//Немного не понял условие, поэтому сделал два варианта

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n == 0)
            System.out.print(0);
        else if (n == 1)
            System.out.print(1);
        else {
            variant1(n);
            System.out.println("");
            variant2(n);
        }
    }
//Вариант первый: ряд Фибоначчи от 1-го до N-го члена
    static void variant1(int n) {
        ArrayList<Integer> raw = new ArrayList<>();
        raw.add(1);
        raw.add(1);
        for (int i = 2; i < n; i++)
            raw.add(raw.get(i - 1) + raw.get(i - 2));

        for (int i : raw)
            System.out.print(i + " ");

    }
//Вариант второй: ряд фибоначи от 1 до N
    static void variant2(int n) {
        ArrayList<Integer> raw = new ArrayList<>();
        raw.add(1);
        raw.add(1);
        int i = 2;
        int k = 0;
        while (k <= n) {
            if ((raw.get(i - 1) + raw.get(i - 2)) <= n)
                raw.add(raw.get(i - 1) + raw.get(i - 2));
            k = (raw.get(i - 1) + raw.get(i - 2));
            i++;
        }
        for (int j : raw) {
            System.out.print(j + " ");
        }
    }

}

