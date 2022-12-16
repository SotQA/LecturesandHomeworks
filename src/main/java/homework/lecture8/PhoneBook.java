package homework.lecture8;

import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<Integer>> phoneBook = new HashMap<>();

    public HashMap<String, List<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public void addPerson(String lastName, List phoneNumber) {
        phoneBook.put(lastName, phoneNumber);
    }
}
