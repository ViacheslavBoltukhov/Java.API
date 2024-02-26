package src.StoreToys;


public class Toy {

    int id;
    String name;
    double percent;

    public Toy(int id, String name, double percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", percent=" + percent + "]";
    }
}