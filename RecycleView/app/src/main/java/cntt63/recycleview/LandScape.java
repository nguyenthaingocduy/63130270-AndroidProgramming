package cntt63.recycleview;

public class LandScape {
    String landName;
    String landCaption;

    public LandScape(String landName, String landCaption) {
        this.landName = landName;
        this.landCaption = landCaption;
    }

    public String getLandName() {
        return landName;
    }

    public void setLandName(String landName) {
        this.landName = landName;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }
}
