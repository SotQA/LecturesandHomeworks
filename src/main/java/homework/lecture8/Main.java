package homework.lecture8;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPerson("Sotnichenko", List.of(82107293, 82745939, 2793972));
        phoneBook.addPerson("Gustafson", List.of(647589291));
        phoneBook.addPerson("Gefersson", List.of(64758921, 9217491, 355387920));
        phoneBook.addPerson("Miles", List.of(182687920));

        System.out.println(phoneBook.getPhoneBook().get("Sotnichenko").get(0));

    }
}
