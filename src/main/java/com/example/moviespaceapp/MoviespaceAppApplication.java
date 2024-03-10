package com.example.moviespaceapp;

import com.example.moviespaceapp.dao.GenreDAO;
import com.example.moviespaceapp.entity.Genre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MoviespaceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviespaceAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(GenreDAO genreDAO){
		return runner -> {
			getAllGenre(genreDAO);
		};
	}

	private void getAllGenre(GenreDAO genreDAO) {
		List<Genre> genres = genreDAO.findAll();

		System.out.println(genres);
	}

	private void createMultipleGenres(GenreDAO genreDAO) {
		List<Genre> genres = List.of(
				new Genre(28, "Action"),
				new Genre(12, "Adventure"),
				new Genre(16, "Animation"),
				new Genre(35, "Comedy"),
				new Genre(80, "Crime"),
				new Genre(99, "Documentary"),
				new Genre(18, "Drama"),
				new Genre(10751, "Family"),
				new Genre(14, "Fantasy"),
				new Genre(36, "History"),
				new Genre(27, "Horror"),
				new Genre(10402, "Music"),
				new Genre(9648, "Mystery"),
				new Genre(10749, "Romance"),
				new Genre(878, "Science Fiction"),
				new Genre(10770, "TV Movie"),
				new Genre(53, "Thriller"),
				new Genre(10752, "War"),
				new Genre(37, "Western"),
				new Genre(10759, "Action & Adventure"),
				new Genre(10762, "Kids"),
				new Genre(10763, "News"),
				new Genre(10764, "Reality"),
				new Genre(10765, "Sci-Fi & Fantasy"),
				new Genre(10766, "Soap"),
				new Genre(10767, "Talk"),
				new Genre(10768, "War & Politics")
		);

		System.out.println("Saving genres______________");

		for (int i = 0; i < genres.size(); i++) {
			genreDAO.save(genres.get(i));
		}

//		genreDAO.save(genres[0]);
	}

}
