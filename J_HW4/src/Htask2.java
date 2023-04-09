import java.util.LinkedList;

/**
 * @author ArtyomPV
 */
/*
Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.
 */
public class Htask2 {


    /**
     * Метод помещает элемент в конец очереди,
     *
     * @param ll Связанный список в который добавляет элементы в конец списка
     */
  public static void enqueue(String string, LinkedList<String> ll){
      ll.addLast(string);
  }

    public static String dequeue(LinkedList<String> ll){
        return ll.removeLast();
    }

    public static String first(LinkedList<String> ll){
        return ll.peek();
    }
}
