package Task10Animals;

public class Kangaroo extends Animals{
    public Kangaroo(){
        super();
    }

    public Kangaroo(String name, int footNumber, boolean hasMustache){
        super(name, footNumber, hasMustache);
    }

    public void voice() {
        System.out.println("Khe-khe");
    }

    public void move() {
        System.out.println("jump-jump");
    }

    public void isHangry() {
        System.out.println("I want berries");
    }
}
