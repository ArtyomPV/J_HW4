import java.util.ArrayList;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        ------------ Task 1 ___________________
        Task1 task1 = new Task1();

//        ------------ Task 2 ___________________
        String[] emploees = new String[]{"Иван Иванов", "Иван Петров", "Сергей Козлов", "Евгений Петров", "Сергей Васильев", "Иван Смирнов", "Андрей Петров"};
        ArrayList<String> emploeesName = Task2.getName(emploees);
        Map<String, Integer> mapName = Task2.getMap(emploeesName);
        System.out.println("Повторяющиеся имена: ");
        Task2.nameRepeat(mapName);
        System.out.println("Имена, отсортированные по убыванию популярности: ");
        Task2.sortName(mapName);

//        ------------ Task 3 ___________________
        int[] listNum = new int[]{5, 2, 3, 8, 10, 5, -1};
        Task3.heapsort(listNum);
        for (int el : listNum) System.out.printf("%d ", el);
    }
}

