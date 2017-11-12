package corp.siendev.datastructures;

import java.io.Serializable;

/**
 * Internal data structure for one way linked list
 *
 * @param <T> any type for you )
 */
public final class ListElement<T> implements Serializable
{
    private static final long serialVersionUID = 9045691038568311L;

    /**
     * Point to next an element
     */
    private ListElement<T> next;

    /**
     * Value of the element
     */
    private T value;

    /**
     * Constructor without parameters
     */
    public ListElement()
    {

    }

    /**
     * Constructor with parameters
     *
     * @param next next element in the linked list
     * @param value value of the element
     */
    public ListElement(ListElement<T> next, T value)
    {
        this.next = next;
        this.value = value;
    }

    /**
     * Get value from our linked list
     *
     * @return value of the element
     */
    public T getValue()
    {
        return this.value;
    }

    /**
     * Set value for the element
     *
     * @param value new value for the element
     */
    public void setValue(T value)
    {
        this.value = value;
    }

    /**
     * Get the next element
     *
     * @return next element
     */
    public ListElement<T> getNext()
    {
        return this.next;
    }

    /**
     * Set the next element
     *
     * @param next point to the next element
     */
    public void setNext(ListElement<T> next)
    {
        this.next = next;
    }

    @Override
    public int hashCode()
    {
        return this.next.hashCode() + this.value.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.equals(obj);
    }

    @Override
    public String toString()
    {
        return "Handmade LinkedList: current value = " + this.value + " the next element is " + this.next;
    }
}
