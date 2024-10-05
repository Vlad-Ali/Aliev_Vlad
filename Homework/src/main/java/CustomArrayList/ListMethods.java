package CustomArrayList;

/**
 * @param <E>
 */
public interface ListMethods<E> {
    /**Inserts the element at the specified position in this list.
     * @param value  element to be inserted
     * @param index  index at which the specified element is to be inserted
     */
    void add(E value,int index);

    /**
     * Removes the element at the specified position in this list.
     * @param index  the index of the element to be removed
     * @return the element that was removed from the list
     */
    E remove(int index);

    /**
     * Returns the element at the specified position in this list
     * @param index
     * @return  the element at the specified position in this list
     */
    E get(int index);
}
