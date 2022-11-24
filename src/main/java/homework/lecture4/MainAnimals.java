package homework.lecture4;

public class MainAnimals {
    public static void main(String[] args) {
        Dog scooby = new Dog(" Scooby", 4);
        Dog bobby = new Dog(" Bobby", 3);
        Dog mars = new Dog(" Mars", 2);

        Cat furr = new Cat(" Furr", 4);
        Cat kitty = new Cat(" Kitty", 2);
        Cat lina = new Cat(" Lina", 5);

        Plate plate1 = new Plate(3);
        Plate plate2 = new Plate(15);
        Plate plate3 = new Plate(28);
        Plate plate4 = new Plate(22);
        Plate plate5 = new Plate(5);
        Plate plate6 = new Plate(14);


        furr.animalRuns(150);
        furr.animalSwims(1);
        plate1.plateInfo();
        plate1.addFoodIntoPlate(10);
        furr.eating(plate1);
        plate1.plateInfo();

        System.out.println("___________________ ");

        scooby.animalRuns(500);
        scooby.animalSwims(200);
        plate2.plateInfo();
        scooby.eating(plate2);
        plate2.plateInfo();

        System.out.println("___________________ ");

        bobby.animalRuns(100);
        bobby.animalSwims(5);
        plate3.plateInfo();
        bobby.eating(plate3);
        plate3.plateInfo();

        System.out.println("___________________ ");

        kitty.animalRuns(50);
        kitty.animalSwims(10);
        plate4.plateInfo();
        kitty.eating(plate4);
        plate4.plateInfo();

        System.out.println("___________________ ");

        lina.animalRuns(500);
        lina.animalSwims(30);
        plate5.plateInfo();
        lina.eating(plate5);
        plate5.plateInfo();

        System.out.println("___________________ ");

        mars.animalRuns(30);
        mars.animalSwims(2);
        plate6.plateInfo();
        mars.eating(plate6);
        plate6.plateInfo();

        System.out.println("___________________________________________ ");

        Cat[] cats = new Cat[3];
        cats[0] = furr;
        cats[1] = kitty;
        cats[2] = lina;

        Plate bowl = new Plate(20);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eating(bowl);
            System.out.println("_________");
        }
    }
}
