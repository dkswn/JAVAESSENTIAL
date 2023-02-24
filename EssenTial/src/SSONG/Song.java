package SSONG;

public class Song {
	String mySong, yourSong;

	public String getmySong() {
		return "공주는 잠 못 이루고";
	}

	public String getyourSong() {
		return "Nessun Dorma";
	}
	



	public static void main(String[] args) {
		Song t = new Song();
		
		System.out.println(t.mySong);
		System.out.println(t.yourSong);
	}
}
