package Practicing;


import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    
    private ArrayList<String> songs;
    private Random random;

    // Constructor
    public MusicLibrary() {
        songs = new ArrayList<>();
        random = new Random();
    }

    // Method to add a song
    public void addSong(String songName) {
        songs.add(songName);
        System.out.println(songName + " added to the library.");
    }

    // Method to remove a song
    public void removeSong(String songName) {
        if (songs.remove(songName)) {
            System.out.println(songName + " removed from the library.");
        } else {
            System.out.println(songName + " not found in the library.");
        }
    }

    // Method to play a random song
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library to play.");
        } else {
            int index = random.nextInt(songs.size());
            String song = songs.get(index);
            System.out.println("Now playing: " + song);
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        library.addSong("Shape of You");
        library.addSong("Believer");
        library.addSong("Blinding Lights");

        library.playRandomSong();

        library.removeSong("Believer");
        library.playRandomSong();
    }
}

