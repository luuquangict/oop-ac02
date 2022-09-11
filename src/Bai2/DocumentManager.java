package Bai2;

import java.util.ArrayList;

public class DocumentManager {
    private ArrayList<Document> documents;

    public DocumentManager() {
        this.documents = new ArrayList<>();
    }

    public boolean add(Document doc) {
        // Validate id có trùng không?
        if (isDocumentExists(doc.getId())) {
            // Nếu đã tồn tại một document nào đó
            // có cùng ID với id của tài liệu đang nhập vào
            // thì bỏ qua không làm gì cả
            return false;
        }

        this.documents.add(doc);
        return true;
    }

    public boolean remove(String id) {
        Document doc = this.getDocumentById(id);
        if (doc == null) {
            // Nếu null nghĩa là không tìm được cuốn sách nào có ID trùng với id mà ta nhập vào
            // Nếu không tồn tại thì ta không remove gì cả
            return false;
        }

        this.documents.remove(doc);
        return true;
    }

    /**
     * Hiển thị danh sách các tài liệu ra màn hình
     * */
    public void showDocuments() {
        for (int i = 0; i < documents.size(); i++) {
            System.out.println(documents.get(i).toString());
        }
    }

    /**
     * Hàm kiểm tra một tài liệu có tồn tại trong danh sách hay không
     * thông qua id của nó
     */
    private boolean isDocumentExists(String id) {
        // TODO: Viết hàm validate ID ở đây

        return true;
    }

    /**
     * Hàm lấy ra một tài liệu trong danh sách
     * dựa vào ID của tài liệu
     * */
    private Document getDocumentById(String id) {
        for (int i = 0; i < this.documents.size(); i++) {

            Document currentDoc = this.documents.get(i);
            if (currentDoc.getId() == id)
                return currentDoc;
        }

        return null;
    }
}
