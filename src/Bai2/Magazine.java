package Bai2;

public class Magazine extends Document {
    private int publishNumber;
    private int publishMonth;

    public int getPublishNumber() {
        return publishNumber;
    }

    public void setPublishNumber(int publishNumber) {
        this.publishNumber = publishNumber;
    }

    public int getPublishMonth() {
        return publishMonth;
    }

    public void setPublishMonth(int publishMonth) {
        this.publishMonth = publishMonth;
    }

    @Override
    public String toString() {
        return super.toString() +
                "publishNumber=" + publishNumber +
                ", publishMonth=" + publishMonth;
    }
}
