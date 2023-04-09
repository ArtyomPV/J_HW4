import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
    который вернёет «перевёрнутый» список.
     */
    // --------------- Task 1 --------------------
//        LinkedList<Integer> linkedList;
//        linkedList = Htask1.askUser();
//        System.out.println(linkedList);
//        Htask1.reverse(linkedList);
//        System.out.println(linkedList);

    /*
     Реализуйте очередь с помощью LinkedList со следующими методами:
    • enqueue() — помещает элемент в конец очереди,
    • dequeue() — возвращает первый элемент из очереди и удаляет его,
    • first() — возвращает первый элемент из очереди, не удаляя.
    */
    // --------------- Task 2 --------------------

        /* ********************************************
        ** Как сделать для работы с другими типами?  **
         **********************************************/

//        LinkedList<String> linkedList2 = new LinkedList<>();
//
//        System.out.println("Empty list: " + linkedList2);
//
//        Htask2.enqueue("Ivan", linkedList2);
//        Htask2.enqueue("Semen", linkedList2);
//        Htask2.enqueue("Petr", linkedList2);
//        System.out.println("Filled List: " + linkedList2);
//        System.out.println("Removed last element: " + Htask2.dequeue(linkedList2));
//        String firstElementList = Htask2.first(linkedList2);
//        System.out.println("First element of list:" + firstElementList);
//        System.out.println("List: " + linkedList2);


        /*
        В калькулятор добавьте возможность отменить последнюю операцию.
         */
        // --------------- Task 3 --------------------

        //***************************************************************
        //*****        Логи подправить уже просто нет времени.     ******
        //***************************************************************
        Htask3 htask3 = new Htask3();
        htask3.Calculate();
    }
}