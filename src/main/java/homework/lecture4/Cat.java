package homework.lecture4;

public class Cat extends Animal {
    static int counter = 0;
    public boolean catIsFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        counter++;
    }

    public void animalSwims(int distance) {
        if (distance > 0) {
            System.out.println(name + " cannot swim at all!");
        }
    }

    public void animalRuns(int distance) {
        if (distance >= 200) {
            System.out.println(name + " cannot run more than 200 meters !");
        } else {
            System.out.println(name + " has ran " + distance + " meters.");
        }
    }

    public void eating(Plate plate) {
        if (plate.foodInPlate - appetite >= 0) {
            plate.decreaseFood(appetite);
            catIsFull = true;
            System.out.println(" The cat " + name + " ate " + appetite + " food from the plate . \n " + name + " is full : " + catIsFull);
        } else if (plate.foodInPlate - appetite < 0){
            catIsFull = false;
            System.out.println(" There is not enough food in the plate for the " + name + "!" + "\n  " + name + " is full : " + catIsFull);
        }
    }
}
