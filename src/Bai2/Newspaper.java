package Bai2;

public class Newspaper extends Document {
    private int date;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() +
                "date=" + date;
    }
}
