import java.util.*;
public class Main {
    static ArrayList<Album> albums = new ArrayList<Album>();
    
    public static void main(String[] args) {
        Album album = new Album("Iowa", "Slipknot");
        album.addSong("My Plague", 3.40);
        album.addSong("The Heretic Anthem", 4.14);
        album.addSong("Gently", 4.54);
        album.addSong("Skin Ticket", 6.41);
        album.addSong("Metabolic", 3.59);
        
        Album album2 = new Album("El Ultimo Tour Del Mundo", "Bad Bunny");
        album2.addSong("La Noche de Anoche", 3.23);
        album2.addSong("La Droga", 2.42);
        album2.addSong("Antes Que Se Acabe", 3.41);
        album2.addSong("Hoy Cobre", 2.42);
        album2.addSong("Sorry Papi", 2.43);
        
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("My Plague", playList);
        albums.get(0).addToPlaylist("4", playList);
        albums.get(0).addToPlaylist("Disasterpiece", playList); //son not in album
        
        albums.get(1).addToPlaylist("La Noche de Anoche", playList);
        albums.get(1).addToPlaylist("3", playList);
        albums.get(1).addToPlaylist("10", playList);    //no 10th song
        
    }
}