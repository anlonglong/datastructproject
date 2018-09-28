package com.allon.datastruct.note.base;


@SuppressWarnings("all")
public abstract class AbstractList<T> implements Operation<T> {

    public void union(AbstractList<T> list) {
        if (this.isEmpty()) {
            for (int i = 0; i < list.length(); i++) {
                this.listInsert(i, list.getElement(i));
            }
        } else {
            for (int i = 0; i < list.length(); i++) {
                T element = list.getElement(i);
                if (this.locationElement(element) == 0) {
                    this.listInsert(this.length() + 1, element);
                }
            }
        }
    }


}
