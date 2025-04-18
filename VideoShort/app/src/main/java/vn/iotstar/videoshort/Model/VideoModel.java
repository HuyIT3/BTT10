package vn.iotstar.videoshort.Model;

import java.io.Serializable;

public class VideoModel implements Serializable {
    private String title;
    private String desc;
    private String url;

    // Constructor
    public VideoModel() {}

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
