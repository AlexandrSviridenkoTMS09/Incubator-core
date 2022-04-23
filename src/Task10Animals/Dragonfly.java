package Task10Animals;

public class Dragonfly extends Animals{
    public Dragonfly(){
        super();
    }

    public Dragonfly(String name, int footNumber, boolean hasMustache){
        super(name, footNumber, hasMustache);
    }


   public void voice() {
        System.out.println("bj-w-w");
    }


    public void move() {
        System.out.println("flight");
    }


    public void isHangry() {
        System.out.println("I want insects");
    }
}
