package Task10Animals;

abstract class Animals implements voice, move, isHungry {
    String name;
    int FootNumber;
    boolean hasMustache;

    public Animals() {
    }

    public Animals(String name, int footNumber, boolean hasMustache) {
        this.name = name;
        FootNumber = footNumber;
        this.hasMustache = hasMustache;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFootNumber() {
        return FootNumber;
    }

    public void setFootNumber(int footNumber) {
        FootNumber = footNumber;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }

}
