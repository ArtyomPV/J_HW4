import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
который вернёет «перевёрнутый» список.
 */
// --------------- Task 1 --------------------
        LinkedList<Integer> linkedList;
        linkedList = Htask1.askUser();
        System.out.println(linkedList);
        Htask1.reverse(linkedList);
        System.out.println(linkedList);
    }
}