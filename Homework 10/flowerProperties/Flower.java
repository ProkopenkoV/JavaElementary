package flowerProperties;

public class Flower extends Properties {
    private String flower;
    private int freshnessLevel;
    private int stemLength;

    public Flower(int price, String flower, int percentageOfFreshness, int stemLength) {
        super(price);
        this.flower = flower;
        this.freshnessLevel = percentageOfFreshness;
        this.stemLength = stemLength;
    }

    public String getFlower() {
        return flower;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public int getStemLength() {
        return stemLength;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flower='" + flower + '\'' +
                ", freshnessLevel=" + freshnessLevel +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}