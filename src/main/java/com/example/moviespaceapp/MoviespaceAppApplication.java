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

		for (int i = 0; i < genres.size(); i++) {
			System.out.println(genres.get(i));
		}
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

/*
*
*[
    {
        "id": 112409,
        "adult": false
    },
    {
        "id": 1116905,
        "adult": null
    },
    {
        "id": 1127959,
        "adult": false
    },
    {
        "id": 1256802,
        "adult": false
    },
    {
        "id": 960470,
        "adult": false
    },
    {
        "id": 1245505,
        "adult": false
    },
    {
        "id": 1248045,
        "adult": false
    },
    {
        "id": 883140,
        "adult": false
    },
    {
        "id": 951037,
        "adult": false
    },
    {
        "id": 1161396,
        "adult": false
    },
    {
        "id": 1175177,
        "adult": false
    },
    {
        "id": 1205660,
        "adult": false
    },
    {
        "id": 1216195,
        "adult": false
    },
    {
        "id": 1223153,
        "adult": false
    },
    {
        "id": 1234407,
        "adult": false
    },
    {
        "id": 1235014,
        "adult": false
    },
    {
        "id": 1236288,
        "adult": false
    },
    {
        "id": 1244111,
        "adult": false
    },
    {
        "id": 1244122,
        "adult": false
    },
    {
        "id": 1244720,
        "adult": false
    },
    {
        "id": 1245190,
        "adult": false
    },
    {
        "id": 1245192,
        "adult": false
    },
    {
        "id": 1245193,
        "adult": false
    },
    {
        "id": 1245195,
        "adult": false
    },
    {
        "id": 1245200,
        "adult": false
    },
    {
        "id": 1245202,
        "adult": false
    },
    {
        "id": 1245220,
        "adult": false
    },
    {
        "id": 1245222,
        "adult": false
    },
    {
        "id": 1245362,
        "adult": false
    },
    {
        "id": 1245368,
        "adult": false
    },
    {
        "id": 1245373,
        "adult": false
    },
    {
        "id": 1245379,
        "adult": false
    },
    {
        "id": 1245391,
        "adult": false
    },
    {
        "id": 1245393,
        "adult": false
    },
    {
        "id": 1246963,
        "adult": false
    },
    {
        "id": 1248626,
        "adult": false
    },
    {
        "id": 1248795,
        "adult": false
    },
    {
        "id": 1253062,
        "adult": false
    },
    {
        "id": 1256437,
        "adult": false
    },
    {
        "id": 968441,
        "adult": false
    },
    {
        "id": 1043899,
        "adult": false
    },
    {
        "id": 1051690,
        "adult": false
    },
    {
        "id": 1125180,
        "adult": false
    },
    {
        "id": 1143128,
        "adult": false
    },
    {
        "id": 1170000,
        "adult": false
    },
    {
        "id": 1176647,
        "adult": false
    },
    {
        "id": 1178595,
        "adult": false
    },
    {
        "id": 1180931,
        "adult": false
    },
    {
        "id": 1198847,
        "adult": false
    },
    {
        "id": 1206319,
        "adult": false
    },
    {
        "id": 1210107,
        "adult": false
    },
    {
        "id": 1220044,
        "adult": false
    },
    {
        "id": 1220814,
        "adult": false
    },
    {
        "id": 1220815,
        "adult": false
    },
    {
        "id": 1230770,
        "adult": false
    },
    {
        "id": 1235489,
        "adult": false
    },
    {
        "id": 1235491,
        "adult": false
    },
    {
        "id": 1238625,
        "adult": false
    },
    {
        "id": 1244956,
        "adult": false
    },
    {
        "id": 1245224,
        "adult": false
    },
    {
        "id": 1245232,
        "adult": false
    },
    {
        "id": 1245233,
        "adult": false
    },
    {
        "id": 1245242,
        "adult": false
    },
    {
        "id": 1245354,
        "adult": false
    },
    {
        "id": 1246089,
        "adult": false
    },
    {
        "id": 1246091,
        "adult": false
    },
    {
        "id": 1256622,
        "adult": false
    },
    {
        "id": 1246093,
        "adult": false
    },
    {
        "id": 1246095,
        "adult": false
    },
    {
        "id": 1246096,
        "adult": false
    },
    {
        "id": 1246106,
        "adult": false
    },
    {
        "id": 1246112,
        "adult": false
    },
    {
        "id": 1246117,
        "adult": false
    },
    {
        "id": 1246120,
        "adult": false
    },
    {
        "id": 1255828,
        "adult": false
    },
    {
        "id": 1078157,
        "adult": false
    },
    {
        "id": 1234287,
        "adult": false
    },
    {
        "id": 1255962,
        "adult": false
    },
    {
        "id": 1256659,
        "adult": false
    },
    {
        "id": 1256663,
        "adult": false
    },
    {
        "id": 1256666,
        "adult": false
    },
    {
        "id": 1256670,
        "adult": false
    },
    {
        "id": 1256672,
        "adult": false
    },
    {
        "id": 1256675,
        "adult": false
    },
    {
        "id": 1256676,
        "adult": false
    },
    {
        "id": 1256681,
        "adult": false
    },
    {
        "id": 1256683,
        "adult": false
    },
    {
        "id": 1256685,
        "adult": false
    },
    {
        "id": 1256688,
        "adult": false
    },
    {
        "id": 1256689,
        "adult": false
    },
    {
        "id": 1256704,
        "adult": false
    },
    {
        "id": 1256754,
        "adult": false
    },
    {
        "id": 1256765,
        "adult": false
    },
    {
        "id": 1256767,
        "adult": false
    },
    {
        "id": 1256770,
        "adult": false
    },
    {
        "id": 1256772,
        "adult": false
    },
    {
        "id": 1256773,
        "adult": false
    },
    {
        "id": 1256775,
        "adult": false
    },
    {
        "id": 1256776,
        "adult": false
    },
    {
        "id": 1256777,
        "adult": false
    }
]
* */