package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CartManagerMoviesLessThanTenTest {
    private CartManager manager = new CartManager();
    private PurchaseItem first = new PurchaseItem(1, 1, "Номер один","Комедия");
    private PurchaseItem second = new PurchaseItem(2, 2, "Тролли. Мировой тур", "Мультфильм");
    private PurchaseItem third = new PurchaseItem(3, 3, "Человек-невидимка", "Ужасы");
    private PurchaseItem fourth = new PurchaseItem(4, 4, "Джентльмены", "Боевик");
    private PurchaseItem fifth = new PurchaseItem(5, 5, "Отель Белград", "Комедия");
    private PurchaseItem sixth = new PurchaseItem(6, 6, "Вперед", "Мультфильм");
    private PurchaseItem seventh = new PurchaseItem(7, 7, "Бладшот", "Боевик");



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

        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}
