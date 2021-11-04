package Exercise2;

public class Exercise2Cars {

    private String name;
    private String color;
    private int velocity;
    private int currentSpeed;

    public Exercise2Cars(String name, String color, int velocity, int currentSpeed) {
        this.name = name;
        this.color = color;
        this.velocity = velocity;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString() {
        return "Exercise2Cars{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", velocity=" + velocity +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

}
