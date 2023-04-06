import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
/**
 * @author ArtyomPV
 */
public class Htask1 {

    /**
     * Спрашивает пользователя, заполнить список самостоятельно
     * или использовать список по умолчанию
     * @return возвращает заполненый список
     */
    public static LinkedList<Integer> askUser() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Желаете создать список в ручную");
        System.out.println("Наберите да или нет");
        String text = sc.next();

        if(text.equalsIgnoreCase("да")) {
            System.out.println("Введите количество элементов: ");
            linkedList = Htask1.fillLinkedList(sc.nextInt());
        } else if (text.equalsIgnoreCase("нет")){
            linkedList = Htask1.readyLinkedList();
        } else System.out.println("Неверный ввод");
        sc.close();
        return linkedList;
    }

    /**
     * Заполнение списка пользователем
     * @param size количество элементов списка
     * @return возвращает список LinkedList
     */

    private static LinkedList<Integer> fillLinkedList (int size){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size ; i++) {
            System.out.printf("Введите %d элемент списка - ", i+1);
            linkedList.add(sc.nextInt());
        }
        sc.close();
        return linkedList;
    }

    /**
     * Функция которая содержит конечное количество, заполненых элементов, списка
     * @return Возвращает заполненый список, длиной в 7 элементов
     */
    private static LinkedList<Integer> readyLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            linkedList.add(random.nextInt(20));
        }
        return linkedList;
    }

    /**
     * Метод, разоращивает список
     * @param ll связанный списокб который необходимо развернуть
     */
    public static void reverse(LinkedList<Integer> ll){
        if(ll.size() < 1) System.out.println("Список пустой");
        else {
            int num;
            for (int i = 0; i < ll.size(); i++) {
                num = ll.remove(i);
                ll.addFirst(num);
            }
        }
    }
}
/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
который вернёет «перевёрнутый» список.

Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.

В калькулятор добавьте возможность отменить последнюю операцию.


 */