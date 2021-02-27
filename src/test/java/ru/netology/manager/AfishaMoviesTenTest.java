package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaMoviesTenTest {
    private Afisha manager = new Afisha(10);
    private MovieItem first = new MovieItem(1, 1, "Номер один", "Комедия");
    private MovieItem second = new MovieItem(2, 2, "Тролли. Мировой тур", "Мультфильм");
    private MovieItem third = new MovieItem(3, 3, "Человек-невидимка", "Ужасы");
    private MovieItem fourth = new MovieItem(4, 4, "Джентльмены", "Боевик");
    private MovieItem fifth = new MovieItem(5, 5, "Отель Белград", "Комедия");
    private MovieItem sixth = new MovieItem(6, 6, "Вперед", "Мультфильм");
    private MovieItem seventh = new MovieItem(7, 7, "Бладшот", "Боевик");
    private MovieItem eighth = new MovieItem(8, 8, "eighth", "eighth");
    private MovieItem ninth = new MovieItem(9, 9, "ninth", "ninth");
    private MovieItem tenth = new MovieItem(10, 10, "tenth", "tenth");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    public void shouldMoviesAll() {

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}
