package homework.lecture4;

public class Plate {
    public int foodInPlate;

    public Plate(int foodInPlate) {
        this.foodInPlate = foodInPlate;
    }

    public void decreaseFood(int n){
        foodInPlate -= n;
    }

    public void plateInfo(){
        System.out.println("There is " + foodInPlate + " food in the plate.");
    }

    public void addFoodIntoPlate(int putFood){
        foodInPlate += putFood;
        System.out.println(" We add " + putFood + " of food into the plate .");
    }
}
