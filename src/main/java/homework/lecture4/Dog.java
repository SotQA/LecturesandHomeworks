package homework.lecture4;

public class Dog extends Animal {
    static int counter = 0;

    public Dog(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        counter++;
    }

    public void animalSwims(int distance) {
        if (distance >= 10) {
            System.out.println(name + " cannot swim more than 10 meters!");
        } else {
            super.animalSwims(distance);
        }
    }

    public void animalRuns(int distance) {
        if (distance >= 500) {
            System.out.println(name + " cannot run more than 500 meters!");
        } else {
            super.animalRuns(distance);
        }
    }

    public void eating(Plate plate) {
        if (plate.foodInPlate - appetite >= 0) {
            plate.decreaseFood(appetite);
            System.out.println(" The dog " + name + " ate " + appetite + " food from the plate .");
        } else if (plate.foodInPlate - appetite < 0){
            System.out.println(" There is not enough food in the plate for the " + name + "!");
        }
    }
}
