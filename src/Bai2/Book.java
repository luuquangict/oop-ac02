package Bai2;

public class Book extends Document {
    private String authorName;
    private int page;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo +
                "AuthorName=" + authorName +
                ", Page=" + page;
    }
}
