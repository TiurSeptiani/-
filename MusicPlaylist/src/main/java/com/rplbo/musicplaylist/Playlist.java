package com.rplbo.musicplaylist;

import java.util.ArrayList;

public class Playlist {
    static ArrayList<Song> songs = new ArrayList<>(6);
    private String playListName;
    private int count;

    public Playlist() {
        // TODO Auto-generated constructor stub

    }

    public static void print() {
        System.out.println("Jumlah lagu = "+ songs.size() + " / Kapasitas playlist = 6");
        for(int i = 0 ; i<songs.size();i++) {
            System.out.println("ListSong["+i+"]: " + songs.get(i).getName() + " - "+songs.get(i).getArtist());


        }

    }

    public String totalTime() {
        int total = 0;
        for(int i = 0 ; i<songs.size();i++) {
            total += songs.get(i).getLength();
        }
        String totalTime = total + " detik";
        return totalTime;

    }

    public void add(Song song) {
        int limit = 6;
        if(songs.size() < limit) {
            songs.add(song);
        }
        else {
            System.out.println("Playlist Favorite penuh!. Tidak bisa menambah lagu lagi");
        }
    }

    public void remove(String songName) {
        for(int i = 0 ; i < songs.size();i++) {
            if(songs.get(i).getName().equals(songName)) {
                songs.remove(i);
            }
        }
        System.out.println(songName + " terhapus...");
    }
    public int size() {
        int size = songs.size();
        return size;
    }
    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playlistName) {
        this.playListName = playlistName;
    }

}
