import java.util.LinkedList;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Task text = new Task();
        text.enqueue();
        text.first();
        text.dequeue();
    }
}

class Task {
    String a;
    LinkedList<String> text = new LinkedList<>();

    public void enqueue() {
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        do {
            a = in.next();
            text.addLast(a);

        } while (!a.equals("end"));
        in.close();
        System.out.print(text);
    }

    public void first() {
        String x=text.getFirst();
        System.out.println();
        System.out.print("Вызвать первый элемент " + x);
    }

    public void dequeue() {
        text.pollFirst();
        System.out.println();
        System.out.print("Вызываем и удаляем первый элемент" + text);
    }
}
