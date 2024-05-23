package didi63cntt.ungdungsuckhoe.Domain;

public class Category_Domain {
    private String imgPath;
    private String title;

    public Category_Domain(String imgPath, String title) {
        this.imgPath = imgPath;
        this.title = title;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
