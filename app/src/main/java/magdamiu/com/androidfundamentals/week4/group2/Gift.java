package magdamiu.com.androidfundamentals.week4.group2;

public class Gift {
    private String mColor;
    private int mWeight;
    private String mName;
    private double mPrice;
    private String mPicture;

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public int getWeight() {
        return mWeight;
    }

    public void setWeight(int weight) {
        mWeight = weight;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public String getPicture() {
        return mPicture;
    }

    public void setPicture(String picture) {
        mPicture = picture;
    }

    public Gift(String color, int weight, String name, double price, String picture) {
        mColor = color;
        mWeight = weight;
        mName = name;
        mPrice = price;
        mPicture = picture;
    }
}
