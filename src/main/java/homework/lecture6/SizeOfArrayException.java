package homework.lecture6;

public class SizeOfArrayException extends Exception {
    private String name;

    public SizeOfArrayException(String name){
        this.name = name;
    }

    public SizeOfArrayException(){

    }

    public String getName() {
        return name;
    }

}
