package ru.netology.manager;

import ru.netology.domain.PurchaseItem;

public class Afisha {
    private PurchaseItem[] items = new PurchaseItem[0];
    private int moviesLength = 10;

    public Afisha(int moviesLength) {
        this.moviesLength = moviesLength;
    }

    public Afisha() {
    }

    public void add(PurchaseItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] getAll() {
        if (items.length <= moviesLength) {
        PurchaseItem[] result = new PurchaseItem[items.length];

        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    } else {
            PurchaseItem[] result = new PurchaseItem[moviesLength];
            for (int i = 0; i < moviesLength; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }
}