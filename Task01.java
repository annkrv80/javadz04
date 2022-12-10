import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        List list = new List();
        list.reverseArray();
    }

}

class List {
    int n;
    LinkedList<Integer> list = new LinkedList<>();

    List() {
        Random random = new Random();
        System.out.println("Введите число элементов: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        in.close();
        System.out.println("Исходный список");
        System.out.print(list);
    }

    public void reverseArray() {
        LinkedList<Integer> reverList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverList.add(list.get(i));

        }
        System.out.println();
        System.out.println("Перевернутый список");
        System.out.print(reverList);
    }
}
