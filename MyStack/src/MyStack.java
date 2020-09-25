import java.util.EmptyStackException;

public class MyStack {
    private Integer[] stack;
    private int size;

    public MyStack() {
        this(1);
        size = 0;
    }

    public MyStack(int initCap) {
        stack = new Integer[initCap];
        size = initCap;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public Integer pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else{
            int x = stack[size];
            size --;
            return x;
        }
    }

    public Integer peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack[size];
    }

    public void push(Integer item){
        if (isEmpty()){
            doubleCapacity();
            size++;
            stack[size] = item;
        }
        else if (!(isEmpty())){
            doubleCapacity();
            size++;
            stack[size] = item;
        }
    }

    private void doubleCapacity(){
        int initSize = stack.length;
        Integer[] finArray = new Integer[stack.length*2];
        for(int i = 0; i < stack.length; i ++){
            finArray[i] = this.stack[i];
        }
        this.stack = finArray;
    }

    private boolean isFull(){
        return (!(stack[size] == null));
    }

    @Override
    public String toString(){
        String fin = "";
        for (int i = stack.length-1; i >0; i--){
            if(stack[i]!=null){
                fin += stack[i];
            }
        }
        return fin;
    }
}
    /*public boolean isEmpty(){
        for (int i = 1; i < this.size; i ++){
            if (!(stack[i] == null)){
                return false;
            }
        }
        return true;
    }

    public Integer peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else{
            size = stack.length;
            return stack[size-1];
        }
    }

    public Integer pop(){
        size = stack.length;
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int x = stack[size-1];
        return x;
    }

    public void push(Integer item){
        if (isEmpty()){
            doubleCapacity();
            stack[stack.length-1] = item;
        }
        else{stack[stack.length-1] = item;}
    }

    private void doubleCapacity(){
        int initSize = stack.length;
        if (stack.length == 0){
            stack = new Integer[1];
        }
        Integer[] list2 = new Integer[stack.length*2];
        for(int i = 0; i < stack.length; i ++){
            list2[i] = this.stack[i];
        }
        int g =0;
        while (g < initSize){
            for (int i = 1; i < initSize*2; i ++){
                list2[i-1] = list2[i];
            }
            g++;
        }
        this.stack = list2;
    }
    @Override
    public String toString(){
        String fin = "";
        for (int i = 0; i < stack.length; i++){
            if(stack[i]!=null){
                fin += stack[i];
            }
        }
        return fin;
    }*/


