public class Thing {
    private int value;
    private int weight;

    public Thing(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public Thing(int size) {
        this.value = (int)(Math.random() * size);
        this.weight = (int)(Math.random() * size);
    }

    public int getValue() {
        return this.value;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return ("Value: " +  this.getValue() + ", weight: " + this.getWeight());
    }
}
