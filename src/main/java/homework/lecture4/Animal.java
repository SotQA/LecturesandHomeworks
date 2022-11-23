package homework.lecture4;

public abstract class Animal {
    String name;
    int appetite;
    public void animalRuns(int distance){
        System.out.println(name + " has ran " + distance + " meters.");
    }
    public void animalSwims(int distance){
        System.out.println(name + " has swum " + distance + " meters.");
    }
}
