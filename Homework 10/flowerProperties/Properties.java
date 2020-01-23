package flowerProperties;

/**
 * Created by Prokopenko Vitaly on 12.01.2020.
 */
 public abstract class Properties {
        public int price;

        public Properties(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

}
