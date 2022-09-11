package Bai2;

public class Main {

    private static DocumentManager manager = new DocumentManager();

    public static void main(String[] args) {

        int choice = ConsoleHelper.getMenu("Add", "Remove", "Search");
        switch (choice) {
            case 1: {
                addDocument();
                break;
            }
            case 2: {
                //removeDocument();
                break;
            }
        }
    }

    private static void addDocument() {
        String type = ConsoleHelper.inputString("Document type: (b/m/n)");
        Document doc;
        switch (type.toUpperCase()) {
            case "B": {
                doc = inputBook();
                break;
            }
            case "M": {
                doc = inputMagazine();
                break;
            }
            case "N": {
                doc = inputNewspaper();
                break;
            }
            default: {
                return;
            }
        }

        manager.add(doc);
    }

    private static void inputBaseInfo(Document doc) {
        doc.setId(ConsoleHelper.inputString("#ID: "));
        doc.setCount(ConsoleHelper.inputInt("Count: "));
        doc.setPublisher(ConsoleHelper.inputString("Publisher: "));
    }

    private static Book inputBook() {
        Book book = new Book();
        inputBaseInfo(book);
        book.setPage(ConsoleHelper.inputInt("Page: "));
        book.setAuthorName(ConsoleHelper.inputString("Author name: "));
        return book;
    }

    private static Magazine inputMagazine() {
        Magazine magazine = new Magazine();
        inputBaseInfo(magazine);
        // TODO: Viết thêm code nhập dữ liệu cho tạp chí ở đây
        return magazine;
    }

    private static Newspaper inputNewspaper() {
        Newspaper newspaper = new Newspaper();
        inputBaseInfo(newspaper);
        // TODO: Viết thêm code nhập dữ liệu cho báo ở đây
        return newspaper;
    }
}
