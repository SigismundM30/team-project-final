import java.util.ArrayList;//jetbrains://idea/navigate/reference?project=Main.java&path=D:/OpenJDK21U-jdk_x64_windows_hotspot_21_35/jdk-21+35/lib/src.zip!/java.base/java/util/ArrayList.java
import java.util.Collections;//jetbrains://idea/navigate/reference?project=Main.java&path=D:/OpenJDK21U-jdk_x64_windows_hotspot_21_35/jdk-21+35/lib/src.zip!/java.base/java/util/Collections.java
import java.util.Comparator;//jetbrains://idea/navigate/reference?project=Main.java&path=D:/OpenJDK21U-jdk_x64_windows_hotspot_21_35/jdk-21+35/lib/src.zip!/java.base/java/util/Comparator.java
import java.util.List;//jetbrains://idea/navigate/reference?project=Main.java&path=D:/OpenJDK21U-jdk_x64_windows_hotspot_21_35/jdk-21+35/lib/src.zip!/java.base/java/util/List.java
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
