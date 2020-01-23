package flowerProperties;

/**
 * Created by Prokopenko Vitaly on 12.01.2020.
 */
public class Accessory extends Properties {
    private String type;

        public Accessory(int price, String type) {
            super(price);
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Accessory{" +
                    "type='" + type + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

