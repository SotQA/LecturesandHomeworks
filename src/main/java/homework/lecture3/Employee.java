package homework.lecture3;

public class Employee {
    String information;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;

    public Employee(String information, String position, String email, int phoneNumber, int salary, int age) {
        this.information = information;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showInformation() {
        System.out.println("This is " + this.information + " , and he is a " + this.position + " at SENLA company" + " , his email is " + this.email + " , phone number : " + this.phoneNumber + " , salary is " + this.salary + " and he is " + this.age + " .");
    }
}
