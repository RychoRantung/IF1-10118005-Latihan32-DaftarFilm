/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan32.daftarfilm;

/**
 *
 * @author USER
 */
public class IF110118005Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film film = new Film();
		Film film1 = new Film();
		Film film2 = new Film();
		Film film3 = new Film();
		
		System.out.println("===Daftar Film Sedang Tayang=== \n");
		film.filmName = "Venom";
                film.filmGenre = "Action, Horror, Sci-fi";
                film.filmRating = 8.5;
                film.filmDuration = 120;
                film.nowPlaying();
                
                film1.filmName = "Small Foot";
                film1.filmGenre = "Animation";
                film1.filmRating = 9.0;
                film1.filmDuration = 96;
                film1.nowPlaying();
                
                film2.filmName = "Crazy Rich Asian";
                film2.filmGenre = "Comedy";
                film2.filmRating = 7.8;
                film2.filmDuration = 119;
                film2.nowPlaying();
                
                film3.filmName = "Asih";
                film3.filmGenre = "Horror";
                film3.filmRating = 6.0;
                film3.filmDuration = 100;
                film3.nowPlaying();
                
                
	}
    }
    

