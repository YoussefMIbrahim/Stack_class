
import java.lang.reflect.Array;

public class Stack<E> {
    
    private final int DEFAULT = 20;
    private E[] array;


    //default constructor
    //credit https://stackoverflow.com/questions/529085/how-can-i-create-a-generic-array-in-java
    public Stack(Class<E> clazz){

        this.array = (E[]) Array.newInstance(clazz, DEFAULT);

    }

    //constructor with a specific size
    public Stack(Class<E> clazz, int capacity){


        this.array = (E[]) Array.newInstance(clazz, capacity);
        
        
    }



}
