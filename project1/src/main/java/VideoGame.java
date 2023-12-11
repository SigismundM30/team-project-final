class VideoGame {
    private final String size;
    private final String platform;
    private final String title;
    private final int year;
    private final float price;

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
