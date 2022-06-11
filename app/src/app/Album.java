package app;

import java.util.ArrayList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Album(String name, String artist, ArrayList<Song> songs) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = songs;
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			songs.add(new Song(title, duration));
			System.out.println(title + " sucessfully added to the list");
			return true;
		} else {
			System.out.println("song with the name" + title + "already added");
			return false;

		}
	}

	public Song findSong(String title) {
		for (Song checkedsong : songs) {
			if (checkedsong.getTitle().equals(title)) {
				return checkedsong;
			} else {
				return null;
			}
		}
		return null;
	}

}
//10 min in youtube video