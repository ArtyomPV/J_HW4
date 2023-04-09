import java.util.*;

/**
 * @ArtyomPV
 */
/*
Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task1 {
    static int counter = 0;
    private String[] texts ={"Введите имя: ", "Введите номер телефона: ", "Абонент есть в списке, можете добавить номер: "};
    Map<String, List<String>> phoneBook = new HashMap<>();
    Task1(){
    }

    public void putContact(){

        String name = getContact(texts[0]);

        //есть ли в справочнике данная фамилия? да- добавить в список, нет создать запись в Map
        if (phoneBook.containsKey(name)) {
            String phoneNumber = getContact(texts[2]);
            if(phoneBook.get(name).equals(phoneNumber))
            System.out.println("Данный номер уже есть в списке!");
            else {
                List<String> list = phoneBook.get(name);
                list.add(phoneNumber);
                phoneBook.put(name, list);
            }
            System.out.println(phoneBook.get(name));
            //добавить в список этого ключа, новый телефон
        } else {
            String phoneNumber = getContact(texts[1]);
            phoneBook.put(name, addPhoneNumber(phoneNumber));
        }
        System.out.println(phoneBook);

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
//    for(Map<Integer, Map<Integer, String>> phoneBookEntrySet: phoneBook.entrySet()){
//        Map<Integer, String>  =
//    }
}
//for (Map.Entry<String, Map<Integer, String>> outerBakedGoodsMapEntrySet : outerBakedGoodsMap.entrySet()) {
//        Map<Integer, String> valueMap = outerBakedGoodsMapEntrySet.getValue();
//        System.out.println(valueMap.entrySet());
//        }
//
//        for (Map.Entry<Integer, Map<String, String>> employeeEntrySet : employeeAddressMap.entrySet()) {
//        Map<String, String> valueMap = employeeEntrySet.getValue();
//        System.out.println(valueMap.entrySet());
//        }