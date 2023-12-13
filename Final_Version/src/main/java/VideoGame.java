class VideoGame {
    private final String size; // The size of the video game
    private final String platform; // The platform on which the video game is played
    private final String title; // The title of the video game
    private final int year; // The year the video game was released
    private final float price; // The price of the video game
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
