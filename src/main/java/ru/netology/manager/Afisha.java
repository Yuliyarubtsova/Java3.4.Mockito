package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class Afisha {
    private MovieItem[] items = new MovieItem[0];
    private int moviesLength = 10;

    public Afisha(int moviesLength) {
        this.moviesLength = moviesLength;
    }

    public Afisha() {
    }

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getAll() {
        if (items.length <= moviesLength) {
            MovieItem[] result = new MovieItem[items.length];

            for (int i = 0; i < items.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        } else {
            MovieItem[] result = new MovieItem[moviesLength];
            for (int i = 0; i < moviesLength; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }
}