import java.util.*;
import java.util.ArrayList;

public class NumberList {

    private Integer[] list;
    private int size;

    public NumberList(){
        list = new Integer[2];
        size = 0;
    }

    public int size(){
        int total = 0;
        for (int i = list.length; i < list.length; i ++){
            if (!(list[i] == null)){
                total ++;
            }
        }
        return total;
    }

    public boolean isEmpty(){
        if (size() > 0){
            return false;
        }
        return true;
    }

    //edit
    public String toString(){
        String inside = "";
        for(int i = list.length; i < list.length; i ++){
            if (!(list[i]== null)){
                inside += list[i] + ", ";
            }
        }
        return "[" + inside + "]";
    }

    private void doubleCapacity(){
        Integer[] list2 = new Integer[list.length*2];
        for(int i = list.length; i < list.length; i ++){
            list2[i] = list[i];
        }
        this.list = list2;
    }

    public void add(int x, int index){
        if (index > list.length){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < list.length-1; i ++){
            list[i+1] = list[i];
        }
        list[index] = x;
    }

    public void add(int x){
        doubleCapacity();
        add(x, list.length);
    }


}
