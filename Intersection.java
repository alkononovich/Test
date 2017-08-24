import java.io.*;

public class Intersection {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите построчно координаты первого отрезка:");
        int ax1 = Integer.parseInt(reader.readLine());
        int ay1 = Integer.parseInt(reader.readLine());
        int ax2 = Integer.parseInt(reader.readLine());
        int ay2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите построчно координаты второго отрезка:");
        int bx1 = Integer.parseInt(reader.readLine());
        int by1 = Integer.parseInt(reader.readLine());
        int bx2 = Integer.parseInt(reader.readLine());
        int by2 = Integer.parseInt(reader.readLine());

        int v1, v2, v3, v4;

        v1 =(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
        v2 =(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
        v3 =(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
        v4 =(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);

        if ((v1*v2<0) && (v3*v4<0))
            System.out.print("Отрезки пересекаются");
        else if ((v1*v2==0) || (v3*v4==0))
                System.out.print("Крайняя точка одного орезка лежит на другом отрезке");
        else
            System.out.print("Отрезки не пересекаются");
    }
}
