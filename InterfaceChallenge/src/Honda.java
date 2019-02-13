import java.util.ArrayList;
import java.util.List;

public class Honda implements ISaveable{

    private String name;
    private int topSpeed;
    private List<String> specs;

    public Honda(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
        specs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }


    @Override
    public List<String> write() {
        specs.add(0, this.name);
        specs.add(1, "" + this.topSpeed);

            System.out.println("Now saving " + specs.get(0) + " with the top speed of " + specs.get(1));


        return specs;
    }

    @Override
    public void read(List<String> list) {
            System.out.println("Loading " + specs.get(0) + " with the top speed of " + specs.get(1));

    }
}
