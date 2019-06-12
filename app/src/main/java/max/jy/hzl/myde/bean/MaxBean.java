package max.jy.hzl.myde.bean;

public class MaxBean {

    private int price;

    public MaxBean() {
    }

    @Override
    public String toString() {
        return "MaxBean{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public MaxBean(int price) {
        this.price = price;
    }
}
