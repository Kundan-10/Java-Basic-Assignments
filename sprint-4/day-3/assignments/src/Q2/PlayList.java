package Q2;


import java.util.HashSet;


public class PlayList {
	
	

	HashSet<Song> songs = new HashSet<>();
	
	public void addSong(Song song) {
		
		 if(songs.add(song)) {
			 System.out.println("Song added to the playlist successfully.");
		 }
		 else {
			 System.out.println("Song is already added in the playlist");
			
		 }
			 

	
	}
	


}
