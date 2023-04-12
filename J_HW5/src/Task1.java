import java.util.*;

/**
 * @author ArtyomPV
 */
/*
Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task1 {
    char startSymbol;
    private final String[] texts ={"Введите имя: ", "Введите номер телефона: ", "Абонент есть в списке, можете добавить номер: "};
    Map<String, List<String>> phoneBook = new HashMap<>();

    Task1(){
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    Для продолжения работы наберите символ и нажмите Enter
                    для вывода списка справочника, наберите символ 'P' и нажмите Enter
                    для выхода наберите символ 'Q' и нажмите Enter
                    """);

            startSymbol = sc.nextLine().charAt(0);
            if(startSymbol != 'Q') {
                if (startSymbol == 'P') System.out.println(phoneBook);
                else putContact();
            }

        } while (startSymbol != 'Q');
    }

    public void putContact(){

        String name = getContact(texts[0]);

        //есть ли в справочнике данная фамилия? да- добавить в список, нет создать запись в Map
        if (phoneBook.containsKey(name)) {
            String phoneNumber = getContact(texts[2]);
            if(phoneBook.get(name).toString().equals(phoneNumber))
            System.out.println("Данный номер уже есть в списке!");
            else {
                List<String> list = phoneBook.get(name);
                list.add(phoneNumber);
                phoneBook.put(name, list);
            }

        } else {
            String phoneNumber = getContact(texts[1]);
            phoneBook.put(name, addPhoneNumber(phoneNumber));
        }


    }
    public String getContact(String text){
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public List<String> addPhoneNumber(String phoneNumber){
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(phoneNumber);
        return phoneNumbers;
    }
}
