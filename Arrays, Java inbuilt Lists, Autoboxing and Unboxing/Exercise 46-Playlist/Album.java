import java.util.*;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
 
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
 
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            Song newSong = new Song(title, duration);
            songs.add(newSong);
            return true;
        }
        
        return false;
    }
 
    private Song findSong(String title) {
           for(Song songExists: this.songs){
            if(songExists.getTitle().equals(title)){
                return songExists;
            }
        }
        return null;
    }
 
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if(trackNumber <= 0 || trackNumber > songs.size()) {
            return false;
        }
 
        Song addSong = songs.get(trackNumber-1);
        String addTitle = addSong.getTitle();
 
        ListIterator<Song> listIterator = playList.listIterator();
        while(listIterator.hasNext()) {
            if(listIterator.next().getTitle().compareTo(addTitle) == 0) {
                return false;
            }
        }
        playList.add(addSong);
        return true;
    }
 
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song addSong = findSong(title);
        if (addSong == null) {
            return false;
        }
        
        ListIterator<Song> listIterator = playList.listIterator();
        while (listIterator.hasNext()) {
            if(listIterator.next().getTitle().compareTo(addSong.getTitle()) == 0) {
                return false;
            }
        }
        playList.add(addSong);
        return true;
    }
}