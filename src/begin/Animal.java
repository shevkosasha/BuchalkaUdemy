package udemy.buchalka.begin;

public class Animal {
    private String name;
    private int brain;
    private int size;
    private int weight;
    private int body;

    public Animal(String name, int brain, int size, int weight, int body) {
        this.name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
        this.body = body;
    }

    public void eat (){
        System.out.println("Anumal.eat() called");
    }
    public void move(int speed){
        System.out.println("animal is moving at " + speed);
    }
    public boolean move(int speed, boolean compare){
        System.out.println("animal is moving at " + speed);
        if (compare) return speed > 10;
        else return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

}
