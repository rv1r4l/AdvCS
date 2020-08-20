import java.util.*;
import java.util.ArrayList;

//Rishit Viral 4B

public class NumberList {

    private Integer[] list;
    private int size;

    public NumberList(){
        list = new Integer[2];
        size = 0;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        return false;
    }

    public String toString(){
        String inside = "";
        for(int i = 0; i < this.size; i ++){
            if (i==this.size-1){
                inside = inside + this.list[i];
                break;
            }
            inside = inside + this.list[i] + ", ";
        }
        return "[" + inside + "]";
    }

    private void doubleCapacity(){
        Integer[] list2 = new Integer[list.length*2];
        for(int i = 0; i < list.length; i ++){
            list2[i] = this.list[i];
        }
        this.list = list2;
    }

    public void add(int index, int element) {
        if (index > this.size|| index < 0)
            throw new IndexOutOfBoundsException();
        if (this.size == this.list.length){
            this.doubleCapacity();
        }
        for (int i = this.size; i > index; i --){
            this.list[i] = this.list[i-1];
        }
        this.list[index] = element;
        this.size++;
    }

    public boolean add(int number){
        add(this.size, number);
        return true;
    }

    public int get(int index){
        if (index >= this.size|| index < 0){
            throw new IndexOutOfBoundsException();
        }
        return this.list[index];
    }

    public Integer set(int index, int element){
        if (index >= this.size|| index < 0){
            throw new IndexOutOfBoundsException();
        }
        int x = this.list[index];
        this.list[index] = element;
        return x;
    }

    public Integer remove(int index){
        if (index >= this.size|| index < 0){
            throw new IndexOutOfBoundsException();
        }
        int x = this.list[index];
        this.list[index] = null;
        for (int i = index; i < this.size-1; i++){
            this.list[i] = list[i+1];
        }
        this.size--;
        return x;
    }
}
