
public class Bird extends Animal {
    protected String featherColor;

    public Bird() {}

    public Bird(String name, int age, double weight, String featherColor) {

        super(name, age, weight);

        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public String getVoice() {
        return "Bird sound";
    }


    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {

        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", featherColor='" + featherColor + '\'' +
                '}';
    }
}