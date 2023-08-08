package com.playlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class CircularPlaylistManager {
	

	    private Deque<String> playlist;
	    private int capacity;

	    public CircularPlaylistManager(int capacity) {
	        this.capacity = capacity;
	        this.playlist = new ArrayDeque<>(capacity);
	    }

	    public void playSong(String song) {
	        if (playlist.size() >= capacity) {
	            playlist.pollFirst(); // Remove the oldest song
	        }
	        playlist.offerLast(song); // Add the new song to the end
	    }

	    public void displayPlaylist() {
	        System.out.println("Current Playlist: " + playlist);
	    }
	

}
