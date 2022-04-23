package Task10Animals;

public class Horse extends Animals{
    public Horse(){
        super();
    }
    public Horse(String name, int footNumber, boolean hasMustache){
        super(name, footNumber, hasMustache);
    }


    public void voice(){
        System.out.println("I-go-go");
    }

    public void move(){
        System.out.println("top-top");
    }

    public void isHangry(){
        System.out.println("I want hay");
    }
}
