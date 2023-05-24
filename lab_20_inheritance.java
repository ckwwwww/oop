package labexam;

class VideoTape {
    public String title;
    public int length;
    public boolean available;

    public VideoTape(String title, int length, boolean available) {
        this.title = title;
        this.length = length;
        this.available = available;
    }

    public void show() {
        System.out.println("Video Tape Information:");
        System.out.println("Title: " + title);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}

class Movie extends VideoTape {
    public String director;
    public double rating;

    public Movie(String title, int length, boolean available, String director, double rating) {
        super(title, length, available);
        this.director = director;
        this.rating = rating;
    }

    public void show() {
        super.show();
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }
}

class MusicVideo extends VideoTape {
    public String artist;
    public String category;

    public MusicVideo(String title, int length, boolean available, String artist, String category) {
        super(title, length, available);
        this.artist = artist;
        this.category = category;
    }

    public void show() {
        super.show();
        System.out.println("Artist: " + artist);
        System.out.println("Category: " + category);
    }
}


public class lab_20_inheritance {
    public static void main(String[] args) {
        VideoTape videoTape = new VideoTape("Generic Video", 120, true);
        Movie movie = new Movie("The Matrix", 150, true, "The Wachowskis", 8.7);
        MusicVideo musicVideo = new MusicVideo("Shape of You", 180, false, "Ed Sheeran", "Pop");

        System.out.println("Video Tape Information:");
        videoTape.show();
        System.out.println();

        System.out.println("Movie Information:");
        movie.show();
        System.out.println();

        System.out.println("Music Video Information:");
        musicVideo.show();
    }
}
