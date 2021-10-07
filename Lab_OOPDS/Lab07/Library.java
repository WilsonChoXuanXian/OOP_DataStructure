package Lab_OOPDS.Lab07;

import java.util.ArrayList;

public class Library<E extends Media> {
    ArrayList<E> medias = new ArrayList<>();

    public void add (E m) {
        medias.add(m);
    }
}

class TestLibrary {
    public static void main(String[] args) {
        Library<Media> mediaLibrary = new Library<>();

        mediaLibrary.add(new Book("Java Programming", "1111-28735"));
        mediaLibrary.add(new Video("Lord of the Rings", 150));

        for (int i = 0; i < mediaLibrary.medias.size(); i++)
            System.out.println(mediaLibrary.medias.get(i).toString());
    }
}

abstract class Media {
    protected String title;

    public Media (String title) {
        this.title = title;
    }

    public abstract String toString();
}

class Book extends Media {
    protected String isbn;

    public Book (String title, String isbn) {
        super(title);
        this.isbn = isbn;
    }

    public String toString() {
        return "Title : " + title + ", Isbn : " + isbn;
    }
}

class Video extends Media {
    protected double duration;

    public Video (String title, double duration) {
        super(title);
        this.duration = duration;
    }

    public String toString() {
        return "Title : " + title + ", Duration : " + duration;
    }
}