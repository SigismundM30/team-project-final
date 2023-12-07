import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class VideoGame {
    private String size;
    private String platform;
    private String title;
    private int year;
    private float price;

    public VideoGame(String size, String platform, String title, int year, float price) {
        this.size = size;
        this.platform = platform;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getSize() {
        return size;
    }

    public String getPlatform() {
        return platform;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }
}
