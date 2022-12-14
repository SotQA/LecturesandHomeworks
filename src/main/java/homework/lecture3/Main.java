package homework.lecture3;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee(" Ivan Ivanov", "Java Dev", "124@mail.com", 8220845, 2000, 28);
        employees[1] = new Employee(" John Marston", "Java LEad Dev", "1245@mail.com", 8244443, 5000, 45);
        employees[2] = new Employee(" Arthur Morgan", "Java Junior Dev", "1245121@mail.ru", 8112311, 1000, 20);
        employees[3] = new Employee(" Kianu Reaves", " Senior Automation", "maileco@mail.ru", 6728391, 1700, 23);
        employees[4] = new Employee(" Mug Muglestone", "Designer", "1245121@mail.yahoo", 1112311, 2300, 51);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].showInformation();
            }
        }
    }
}
