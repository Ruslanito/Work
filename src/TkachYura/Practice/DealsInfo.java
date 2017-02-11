package TkachYura.Practice;

/**
 * Created by Ruslanito on 11.02.2017.
 */
public class DealsInfo {


    public class Party {// стороны сделок
        private String name;

        public String getName() {//вывод имени стороны сделки
            return name;
        }

        public void setName(String newvalue) { //ввод имени стороны сделки
            this.name = newvalue;
        }
    }

    public class Product {// товары отражённые в сделке
        private String title;
        private double price;
        private int quantity;

        public String getTitle() {
            return title;
        }

        public void setTitle(String newtitle) {
            this.title = newtitle;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double newprice) {
            this.price = newprice;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int newquantity) {
            this.quantity = newquantity;
        }
    }

}
