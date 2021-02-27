package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaMoviesLessThanTenTest {
    private Afisha manager = new Afisha();
    private MovieItem first = new MovieItem(1, 1, "Номер один", "Комедия");
    private MovieItem second = new MovieItem(2, 2, "Тролли. Мировой тур", "Мультфильм");
    private MovieItem third = new MovieItem(3, 3, "Человек-невидимка", "Ужасы");
    private MovieItem fourth = new MovieItem(4, 4, "Джентльмены", "Боевик");
    private MovieItem fifth = new MovieItem(5, 5, "Отель Белград", "Комедия");
    private MovieItem sixth = new MovieItem(6, 6, "Вперед", "Мультфильм");
    private MovieItem seventh = new MovieItem(7, 7, "Бладшот", "Боевик");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
    }

    @Test
    public void shouldMoviesAll() {

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}
