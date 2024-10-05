package CustomArrayList;

/**
 * @param <E>  the type of elements in this list
 */
public class CustomArrayList<E> implements ListMethods<E>{
    private int capacity;
    private int length;
    private Object[] Array;
    /**
     *
     */
    public CustomArrayList(){
        this.capacity=16;
        this.length=0;
        this.Array=new Object[this.capacity];
    }

    /**
     * @return true if List is Empty
     * else false
     */
    public boolean isEmpty(){
        return this.length==0;
    }

    /**
     * @return length of the List
     */
    public int size(){
        return this.length;
    }

    /**
     *
     */
    private void Realloc(){
        Object[] NewArray=new Object[capacity*2];
        System.arraycopy(this.Array,0,NewArray,0,length);
        this.capacity*=2;
        this.Array=NewArray.clone();
    }

    /**
     * @param index
     * @return
     */
    private E elementdata(int index){
        return (E) Array[index];
    }

    /**
     * Appends the element to the end of this list.
     * @param value
     */
    public void add(E value){
        if (length+1>capacity){
            Realloc();
        }
        this.Array[length]=value;
        this.length+=1;
    }

    /**Inserts the element at the specified position in this list.
     * @param value  element to be inserted
     * @param index  index at which the specified element is to be inserted
     */
    @Override
    public void add(E value, int index) {
        if (index>length){
            throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length "+length);
        }
        if (length+1>capacity){
            Realloc();
        }
        if (length==index){
            this.Array[index]=value;
        }
        else {
            Object[] NewArray=new Object[capacity];
            System.arraycopy(this.Array,0,NewArray,0,index);
            System.arraycopy(this.Array,index,NewArray,index+1,length-index);
            NewArray[index]=value;
            this.Array=NewArray.clone();
        }
        this.length+=1;
    }

    /**
     * Removes the element at the specified position in this list.
     * @param index  the index of the element to be removed
     * @return the element that was removed from the list
     */
    @Override
    public E remove(int index) {
        if (index>=length){
            throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length "+length);
        }
        E deleted= elementdata(index);
        if (index==length-1){
            this.length-=1;
        }
        else{
            System.arraycopy(this.Array,0,this.Array,0,index);
            System.arraycopy(this.Array,index+1,this.Array,index,length-index+1);
            this.length-=1;
        }
        return deleted;
    }

    /**
     * Returns the element at the specified position in this list
     * @param index
     * @return  the element at the specified position in this list
     */
    @Override
    public E get(int index) {
        if (index>=length){
            throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length "+length);
        }
        return elementdata(index);
    }
}
