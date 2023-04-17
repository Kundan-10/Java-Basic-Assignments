package Q2;

import java.util.Objects;

public class Song {
	
      private String movieName;
      private String songsName;
      
      
      
      public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSongsName() {
		return songsName;
	}

	public void setSongsName(String songsName) {
		this.songsName = songsName;
	}

	
	Song(String movieName,String songsName){
    	  this.movieName=movieName;
    	  this.songsName=songsName;
      }
	
	
  	public Song() {
		// TODO Auto-generated constructor stub
	}

	void play() {
		System.out.println(songsName+" of "+movieName+" is playing...!");
	}

  	
	@Override
	public String toString() {
		return "Song [movieName=" + movieName + ", songsName=" + songsName + "]";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(movieName, songsName);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songsName, other.songsName);
	}
}

