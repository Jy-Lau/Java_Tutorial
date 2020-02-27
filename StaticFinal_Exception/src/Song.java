public class Song {   //final class cannot be inherited but can only be instantiated
    private String title;
    private long length;
    static String ARTIST="JAY_CHOU";

    public Song(String title, long length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public long getLength() {
        return length;
    }
}
