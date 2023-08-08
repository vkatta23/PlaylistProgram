package com.playlist;
import java.util.ArrayDeque;
import java.util.Deque;

public class CircularPlaylist extends CircularPlaylistManager{
    public CircularPlaylist(int capacity) {
		super(capacity);
	}

	public static void main(String[] args) {
        CircularPlaylistManager playlistManager = new CircularPlaylistManager(3);

        playlistManager.playSong("s1");
        playlistManager.playSong("s2");
        playlistManager.playSong("s3");

        playlistManager.displayPlaylist();

        playlistManager.playSong("s4");
        playlistManager.displayPlaylist();

        playlistManager.playSong("s2");
        playlistManager.displayPlaylist();

        playlistManager.playSong("s1");
        playlistManager.displayPlaylist();
    }
}


 
