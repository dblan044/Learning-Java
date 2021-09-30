import java.util.*;

public class Album {
    private String name;
    private String artist;
    private SongList songs;
 
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
 
    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }
 
    public boolean addToPlayList(int trackNumber, LinkedList playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        
        return false;
    }
 
    public boolean addToPlayList(String title, LinkedList playList) {
        Song checkedSong = this.songs.findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        
        return false;
    }
    
    public static class SongList{
        private ArrayList songs;
        
        private SongList(){
            this.songs = new ArrayList();
        }
        
        private boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            
            this.songs.add(song);
            return true;
        }
        
        private Song findSong(String title) {
           for(Song songExists: this.songs){
            if(songExists.getTitle().equals(title)){
                return songExists;
            }
        }
        return null;
        }
        
        private Song findSong(int trackNumber) {
           int index = trackNumber - 1;
            if(index &gt; 0 &amp;&amp; index &lt; songs.size()){
                return songs.get(index);
            }
        
        return null;
        }
    }
}
